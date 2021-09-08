import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        Student[] student = new Student[71]; // 创建一个容量大小为71的学生对象数组
        Scanner input = new Scanner(System.in);
        Byte select;
        do {
            System.out.println("1.输入学生信息");
            System.out.println("2.查找学生信息");
            System.out.println("0.退出");

            select = input.nextByte();
            switch (select) {
                case 1: {
                    System.out.print("学生姓名：");
                    String name = input.next(); //输入姓名
                    int index = HashAlgorithm.stringToHashValue(name, 71); //调用哈希函数，后返回索引给index
                    student[index]=new Student();  //得到索引，分配空间
                    student[index].input(name);   //
                }break;

                case 2: {
                    System.out.print("学生姓名：");
                    String name = input.next(); //输入姓名
                    int index = HashAlgorithm.stringToHashValue(name, 71); //调用哈希函数，后返回索引给index
                    student[index].output(); //
                }break;
                default:
                    break;
            }
        } while (select != 0);

        input.close();
    }
}