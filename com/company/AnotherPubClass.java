package com.company;

public class AnotherPubClass extends PubClass{
    //обращаемся к унаследованным переменным. Private dPub работать не должна
    int newA = a;
    public int newB = b;
    protected int newC = c;
//    private string newD = d;

    //обращаемся к унаследованным конструкторам. Private (последний) не работает
    AnotherPubClass (int i) {
        super(i);
    }

    public AnotherPubClass (int i, int j) {
        super(i, j);
    }

    protected AnotherPubClass (int i, int j, int k) {
        super(i, j, k);
    }
/*
    private AnotherPubClass (int i, int j, int k, int l) {
        super(i, j, k, l);
    }
*/

    //обращаемся к унаследованным методам. Private (последний) не работает
    int defAdd() {
        return super.defAdd();
    }


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
