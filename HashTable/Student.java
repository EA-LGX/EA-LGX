import java.util.Scanner;

public class Student {
    String name;
    int id;
    byte age;

    public void input(String nameP) {
        Scanner input = new Scanner(System.in);
        name=nameP;
        System.out.print("学生学号：");
        id = input.nextInt();
        System.out.print("学生年龄：");
        age = input.nextByte();
    }

    public void output() {
        System.out.println("学生学号：" + id);
        System.out.println("学生年龄：" + age);
    }
}
