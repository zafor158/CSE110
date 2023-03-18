//Name: Md.Abu Zafor
//Student Id:2020-2-60-158
 interface I1{
    void f1();
    default void f2(){
        System.out.println("Default method of Interface I1");
    }
}
 abstract class A1 implements I1{
    abstract void f3();
    void f4(){
        System.out.println("Concrete method of Abstract Class A1");
    }
}
 abstract class A2 extends A1{
    abstract void f8();
    abstract void f9();
    void f10(){
        System.out.println("Concrete method of Abstract ClassA2");
    }
}
 interface I2{
    void f5();
    void f6();
    default void f7(){
        System.out.println("Default method of Interface I2");
    }
}
class C1 extends A2 implements I2{

    public void f1() {
        System.out.println("Method f1 inside C1");
    }
    public void f2() {
        super.f2();
    }
    public void f3() {
        System.out.println("Method f3 inside C1");
    }
    public void f4() {
        super.f4();
    }
    public void f5() {
        System.out.println("Method f5 inside C1");
    }
    public void f6() {
        System.out.println("Method f6 inside C1");
    }

    public void f7() {
        I2.super.f7();
    }

    @Override
    /*void f10() {
        super.f10();
    }*/
    void f8() {
    }
    void f9() {
    }
}

class C2 extends C1{
    public void f2() {
        System.out.println("Default method of Interface I1 inside C2");
    }

    public void f3() {
        System.out.println("Method f3 inside C2");
    }

    public void f4() {
        System.out.println("Concrete method of Abstract Class A1 Inside C3");
    }

    public void f5() {
        System.out.println("Method f5 inside C3");
    }

    public void f6() {
        System.out.println("Method f6 inside C2");
    }
}

class C3 extends C2{
    public void f3() {
        System.out.println("Method f3 inside C3");
    }
    public void f7() {
        System.out.println("Default method of Interface I2 Inside C1");
    }
}
    public class Online3{
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.f1();//method f1 inside c1
        c1.f2();
        c1.f3();
        c1.f4();
        c1.f5();
        c1.f6();
        c1.f7();
        System.out.println();

        c1 = new C2();
        c1.f1();
        c1.f2();
        c1.f3();
        c1.f4();
        c1.f5();
        c1.f6();
        c1.f7();
        System.out.println();
        c1 = new C3();
        System.out.println();
        c1.f1();
        c1.f2();
        c1.f3();
        c1.f4();
        c1.f5();
        c1.f6();
        c1.f7();
        System.out.println();
    }
}