package TestPack;

import com.company.PubClass;
/* Класс, на котором проверяем, как наследуются содержимое открытого класса из другого пакета*/

public class InheritedPubClass extends PubClass {
    //обращаемся к унаследованным переменным. Private d и package a не работают
//    int newA = a;
    public int newB = b;
    protected int newC = c;
//    private string newD = d;


    //обращаемся к унаследованным конструкторам. Private (последний) и package (первый) не работают
/*
    InheritedPubClass (int i) {
        super(i);
    }
*/
    public InheritedPubClass (int i, int j) {
        super(i, j);
    }

    protected InheritedPubClass (int i, int j, int k) {
        super(i, j, k);
    }
/*
    private InheritedPubClass (int i, int j, int k, int l) {
        super(i, j, k, l);
    }
*/

    //обращаемся к унаследованным методам. 1-й и 4-й снова в пролёте

    //не должно унаследоваться, т.к. без модификатора
/*  int defAdd() {
        return super.defAdd();
}
*/

    public int pubAdd() {
        return super.pubAdd();
    }

    protected int protAdd() {
        return super.protAdd();
    }

    // private переменная не наследуется
/*    private int privAdd() {
        return super.privAdd();
    }
    */
}
