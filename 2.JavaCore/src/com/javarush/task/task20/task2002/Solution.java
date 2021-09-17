package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            //File yourFile = new File("C:\\11\\t.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("Ivan");
            user1.setLastName("Ivanov");
            user1.setBirthDate(new GregorianCalendar(1985,05,05).getTime());
            user1.setCountry(User.Country.OTHER);
            javaRush.users.add(user1);

            User user2 = new User();
            user2.setFirstName("Sergey");
            user2.setLastName("Ivanov");
            user2.setBirthDate(new GregorianCalendar(1985,05,05).getTime());
            user2.setCountry(User.Country.OTHER);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            javaRush.equals(loadedObject);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            DataOutputStream outToFile = new DataOutputStream(outputStream);
            outToFile.writeInt(users.size());

            for (User user : users) {
                String firstName = (user.getFirstName() == null) ? "null" : user.getFirstName();
                outToFile.writeUTF(firstName);
                String lastName = (user.getLastName() == null) ? "null" : user.getLastName();
                outToFile.writeUTF(lastName);
                outToFile.writeLong(user.getBirthDate().getTime());
                outToFile.writeBoolean(user.isMale());
                outToFile.writeUTF(user.getCountry().name());
            }
            outToFile.flush();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            DataInputStream fromFile = new DataInputStream(inputStream);
            int userCount = fromFile.readInt();

            for (int i = 0; i < userCount; i++) {
                User user = new User();

                String firstName = fromFile.readUTF();
                if(firstName.equals("null")) firstName = null;
                user.setFirstName(firstName);

                String lastName = fromFile.readUTF();
                if(lastName.equals("null")) lastName = null;
                user.setLastName(lastName);

                user.setBirthDate(new Date(fromFile.readLong()));
                user.setMale(fromFile.readBoolean());
                user.setCountry(User.Country.valueOf(fromFile.readUTF()));

                users.add(user);
            }
            //implement this method - реализуйте этот метод
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
