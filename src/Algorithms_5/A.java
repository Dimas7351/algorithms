package Algorithms_5;

interface A {
    int sum(int x, int y);
}
class B implements A{
    public int diff(int x, int y){return x - y;}
    public int sum(int x, int y){return x + y;}
}
class C extends B{
    public int mult(int x, int y){return x*y;}
    public int diff(int x, int y){return y - x;}
}

class Test {
    public static void main(String[] args) {
        A aB = new B();
        A aC = new C();
        B bB= new B();
        B bC= new C();
        C cC = new C();


//        System.out.println(bC.mult(2,2) == 4);

        System.out.println(cC.sum(1,1) == 2);

        System.out.println(bC.diff(2,1) == 1);

        System.out.println(aC.sum(1,1) == 2);

        System.out.println(cC.diff(2,1) == 1);


    }
}
