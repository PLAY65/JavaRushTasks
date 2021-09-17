package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        ArrayList<Word> wordArray = new ArrayList<>();
        int[] dx = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};

        //проверяем входящее слово в метод
        for (String s : words) {
            //разбиваем слово на массив символов
            char[] c = s.toCharArray();
            //перебираем матрицу двойным фором
            for (int y = 0; y < crossword.length; y++) {
                for (int x = 0; x < crossword[0].length; x++) {
                    //начинаем поиск, если первый символ в слове совпадает с символом в ячейке
                    if (crossword[y][x] == c[0]) {
                        //ищем направление слова от первого символа, верх-вниз, влево, вправо и 4 стороны диагонали
                        for (int i = 0; i < dx.length; i++) {
                            //по умолчанию wordFound тру если слово наглось
                            boolean wordFound = true;
                            //перебираем все символы в слове, начиная со второго символа
                            for (int j = 1; j < c.length; j++) {
                                //1. Если
                                if (y + dy[i] * j < 0 || y + dy[i] * j >= crossword.length ||
                                        x + dx[i] * j < 0 || x + dx[i] * j >= crossword[y + dy[i] * j].length ||
                                        crossword[y + dy[i] * j][x + dx[i] * j] != c[j]) {
                                    wordFound = false;
                                    break;
                                }
                            }
                            if (wordFound) {
                                //добавить найденое слово с координатами первого и споследнего символа
                                Word w = new Word(s);
                                w.setStartPoint(x, y);
                                w.setEndPoint(x + dx[i] * (c.length - 1), y + dy[i] * (c.length - 1));
                                wordArray.add(w);
                                //если в слове только один символ, то выйти из цикла
                                if (c.length == 1)  break;
                            }

                        }
                    }
                }
            }
        }
        return wordArray;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
