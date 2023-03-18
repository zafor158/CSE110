public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Ruby", 10);
        System.out.println(p1.getAge());
        //--> 10
        Person p2 = new Person();
        System.out.println(p2.getAge());
        System.out.println(p1.getAge());
        // --0

    }
}
