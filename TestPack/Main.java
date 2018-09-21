package TestPack;

/* Пакет, в котором мы проверяем импортированные из другого пакета классы и один - из этого*/
//импортируем классы из другого пакета
import com.company.AnotherPubClass;
import com.company.PubClass;
//import com.company.DefClass;
// без модификатора и не должен импортироваться

public class Main {

    public static void main(String[] args) {
        
        System.out.println("I'm gonna test everything from a second package!");
        int l = 0;
        int n = 0;

        //проверяем конструкторы суперкласса из другого пакета. Работает публичный


//      PubClass nechto1 = new PubClass(9);
        PubClass nechto = new PubClass(9, 11);
//      PubClass nechto3 = new PubClass(9, 11, 13);
//      PubClass nechto4 = new PubClass(9, 11, 13, 15);
        //проверяем переменные суперкласса из другого пакета. Вызывается только b
//      l = nechto.a;
        l = nechto.b;
//      l = nechto.c;
//      l = nechto.d;
        //вызываем методы класса. Ошибки компиляции быть не должно только в public
//      n = nechto.defAdd();
        n = nechto.pubAdd();
//      n = nechto.protAdd();
//      n = nechto.privAdd();
        System.out.println("Superclass from the first package seems okay");


        //проверяем конструкторы субкласса из другого пакета. Работает публичный и встроенный

//      AnotherPubClass drugoe1 = new AnotherPubClass(9);
        AnotherPubClass drugoe = new AnotherPubClass(9, 11);
//      AnotherPubClass drugoe3 = new AnotherPubClass(9, 11, 13);

        //проверяем переменные субкласса из другого пакета. Вызывается только b и newB (они оба  открыты)
//      l = drugoe.a;
//      l = drugoe.newA;
        l = drugoe.b;
        l = drugoe.newB;
//      l = drugoe.c;
//      l = drugoe.newC;
        //вызываем методы субкласса. Ошибки компиляции быть не должно только в public
//      n = drugoe.defAdd();
        n = drugoe.pubAdd();
//      n = drugoe.protAdd();
        System.out.println("Foreign subclass - pass!");

        //проверяем конструкторы субкласса, который в этом же пакете. Всё в порядке

        InheritedPubClass ewe2 = new InheritedPubClass(9, 11);
        InheritedPubClass ewe = new InheritedPubClass(9, 11, 13);

        //проверяем переменные субкласса, который в этом же пакете. cPub не работает, и правильно!
        l = ewe.b;
        l = ewe.newB;
//      l = ewe.c;
        l = ewe.newC;


        //вызываем методы. Оба метода работают
        n = ewe.pubAdd();
        n = ewe.protAdd();
        System.out.println("And finally - our own subclass! Very nice!");

    }
}
