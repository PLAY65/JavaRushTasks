package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        synchronized ((imf == null) ? imf= new IMF() : imf)
       {}
        return imf;
    }

    private IMF() {
    }
}
