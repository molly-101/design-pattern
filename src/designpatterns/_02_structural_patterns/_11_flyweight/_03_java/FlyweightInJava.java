package designpatterns._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf(10000);
        Integer i4 = Integer.valueOf(10000);
        System.out.println(i3 == i4);
    }
}
