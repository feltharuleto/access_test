package com.company;

//пробуем создать разные классы с разными методами и переменными

public class PubClass {
    int a = 1;
    public int b = 3;
    protected int c = 5;
    private int d = 7;

    PubClass (int i) {
        a = i;
    }

    public PubClass (int i, int j) {
        a = i;
        b = j;
    }

    protected PubClass (int i, int j, int k) {
        a = i;
        b = j;
        c = k;
    }

    private PubClass (int i, int j, int k, int l) {
        a = i;
        b = j;
        c = k;
        d = l;
    }



//все методы ниже должны работать
    int defAdd() {
        return a + b;
    }

    public int pubAdd () {
        return b + c;
    }

    protected int protAdd () {
        return c + d;
    }

    private int privAdd () {
        return d + a;
    }


}

// Private у классов не должен работать
/*private class PrivClass {

} */


// Protected у классов не должен работать
/*protected class ProtClass {

} */


class DefClass {
    int a = 1;
    public int b = 3;
    protected int c = 5;
    private int d = 7;

    DefClass (int i) {
        a = i;
    }

    public DefClass (int i, int j) {
        a = i;
        b = j;
    }

    protected DefClass (int i, int j, int k) {
        a = i;
        b = j;
        c = k;
    }

    private DefClass (int i, int j, int k, int l) {
        a = i;
        b = j;
        c = k;
        d = l;
    }


    //все методы ниже должны работать
    int defAdd() {
        return a + b;
    }

    public int pubAdd () {
        return b + c;
    }

    protected int protAdd () {
        return c + d;
    }

    private int privAdd () {
        return d + a;
    }

}
