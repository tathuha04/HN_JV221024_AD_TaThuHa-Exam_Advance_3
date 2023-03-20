import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();;
        System.out.println("chọn: ");
        do {

            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát");
            System.out.println("chọn: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên khách hàng: ");
                    String person = input.nextLine();
                    queue.add(person);
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("chọn lại");
            }
        }while (true);
    }
}