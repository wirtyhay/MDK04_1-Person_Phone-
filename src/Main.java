public class Main {


    public static void main(String[] args) {
        Phone a = new Phone("+79107755915", "Samsung", 7.8);
        Person b = new Person();
        Person v = new Person("Kolya", 44);
        v.talk();
        v.move();
        b.talk();
        b.move();
        a.receiveCall("Влад:", "+79104565915");

    }
}
