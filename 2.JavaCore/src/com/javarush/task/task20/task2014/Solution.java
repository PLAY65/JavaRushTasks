package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/* 
Serializable Solution
*/

public class Solution implements Externalizable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));

        Solution savedObject = new Solution(4);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("c:\\11\\test"));
        savedObject.writeExternal(outputStream);
        Solution loadedObject =new Solution(5);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("c:\\11\\test"));
        loadedObject.readExternal(inputStream);

        savedObject.equals(loadedObject);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(string, solution.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, currentDate, temperature, string);
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(string);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        string =(String) in.readObject();
    }
}
