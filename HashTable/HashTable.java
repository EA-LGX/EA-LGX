import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        Student[] student = new Student[71]; // ����һ��������СΪ71��ѧ����������
        Scanner input = new Scanner(System.in);
        Byte select;
        do {
            System.out.println("1.����ѧ����Ϣ");
            System.out.println("2.����ѧ����Ϣ");
            System.out.println("0.�˳�");

            select = input.nextByte();
            switch (select) {
                case 1: {
                    System.out.print("ѧ��������");
                    String name = input.next(); //��������
                    int index = HashAlgorithm.stringToHashValue(name, 71); //���ù�ϣ�������󷵻�������index
                    student[index]=new Student();  //�õ�����������ռ�
                    student[index].input(name);   //
                }break;

                case 2: {
                    System.out.print("ѧ��������");
                    String name = input.next(); //��������
                    int index = HashAlgorithm.stringToHashValue(name, 71); //���ù�ϣ�������󷵻�������index
                    student[index].output(); //
                }break;
                default:
                    break;
            }
        } while (select != 0);

        input.close();
    }
}