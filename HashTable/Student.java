import java.util.Scanner;

public class Student {
    String name;
    int id;
    byte age;

    public void input(String nameP) {
        Scanner input = new Scanner(System.in);
        name=nameP;
        System.out.print("ѧ��ѧ�ţ�");
        id = input.nextInt();
        System.out.print("ѧ�����䣺");
        age = input.nextByte();
    }

    public void output() {
        System.out.println("ѧ��ѧ�ţ�" + id);
        System.out.println("ѧ�����䣺" + age);
    }
}
