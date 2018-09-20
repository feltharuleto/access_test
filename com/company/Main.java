package com.company;
/*Основной код пакета, в котором мы проверим открытый суперкласс, открытый субкласс и класс без модификатора из этого же пакета*/
public class Main {

    public static void main(String[] args) {
        
        System.out.println("I'm gonna test everything from a second package!");
        int l = 0;
        int n = 0;

        //проверяем конструкторы суперкласса из другого пакета. Не работает закрытый

        PubClass nechto = new PubClass(9);
        PubClass nechto2 = new PubClass(9, 11);
        PubClass nechto3 = new PubClass(9, 11, 13);
//      PubClass nechto4 = new PubClass(9, 11, 13, 15);

        //проверяем переменные суперкласса. dPub не работает и не должна
        l = nechto.a;
        l = nechto.b;
        l = nechto.c;
//      l = nechto.d;
        //вызываем методы суперкласса. Ощибки компиляции быть должны быть только в последнем
        n = nechto.defAdd();
        n = nechto.pubAdd();
        n = nechto.protAdd();
//      n = nechto.privAdd();
        System.out.println("Public superclass looks fine to me");


        //проверяем конструкторы субкласса. Всё в порядке

        AnotherPubClass drugoe = new AnotherPubClass(9);
        AnotherPubClass drugoe2 = new AnotherPubClass(9, 11);
        AnotherPubClass drugoe3 = new AnotherPubClass(9, 11, 13);

        //проверяем переменные субкласса. Все новые и унаследованные переменные в порядке
        l = drugoe.a;
        l = drugoe.newA;
        l = drugoe.b;
        l = drugoe.newB;
        l = drugoe.c;
        l = drugoe.newC;

        //вызываем методы субкласса. Все унаследованные методы в порядке
        n = drugoe.defAdd();
        n = drugoe.pubAdd();
        n = drugoe.protAdd();
        System.out.println("Public subclass is okay too");

        //проверяем конструкторы класса без модификатора. Private не работает

        DefClass ewe = new DefClass(9);
        DefClass ewe2 = new DefClass(9, 11);
        DefClass ewe3 = new DefClass(9, 11, 13);
//      DefClass ewe4 = new DefClass(9, 11, 13, 15);

        //проверяем переменные класса без модификатора. d не работает и не должна
        l = ewe.a;
        l = ewe.b;
        l = ewe.c;
//      l = ewe.d;
        //вызываем методы класса. Ощибки - только в private
        n = ewe.defAdd();
        n = ewe.pubAdd();
        n = ewe.protAdd();
//      n = ewe.privAdd();
        System.out.println("No probs in the package class either!");

    }
}
