package by.itacademy.test2;

public class Main {
    public static void main(String[] args) {
        Capacity prizma = new Capacity(2L,3L);
        System.out.println(prizma.rectangle());

        Capacity trapecia = new Capacity(4L, 5L, 2L);
        System.out.println(trapecia.isoscelesTrapezoid());


    }
}
