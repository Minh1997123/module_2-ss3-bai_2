import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int select = 0;
        int totalStudent = 0;
        double sum = 0;
        double agv = 0;
        double maxScore = 0;
        double minScore = 10;

        while (select != 3) {
            System.out.println("***** Menu nhap diem *****");
            System.out.println("1.\tnhap diem hoc vien");
            System.out.println("2.\thien thi thong ke");
            System.out.println("3.\tthoat");
            System.out.print("lua chon cua ban : ");

            int score = 0;
            select = Integer.parseInt(scanner.nextLine());
            if (select == 1) {
                System.out.println("***** nhap diem hoc vien (nhap -1 de dung) *****");
                while (score != (-1)) {

                    System.out.print("nhap diem : ");
                    score = Integer.parseInt(scanner.nextLine());
                    String academicAbility = "hoc luc la : ";
                    if (score < 5) {
                        academicAbility += "Yeu";
                    } else if (score < 7) {
                        academicAbility += "Trung binh";
                    } else if (score < 8) {
                        academicAbility += "Kha";
                    } else if (score < 9) {
                        academicAbility += "Gioi";
                    } else if  (score <= 10) {
                        academicAbility += "Xuat sac";
                    }
                    if (score == -1) {
                        break;
                    }
                    if (score < 0 || score > 10) {
                        System.out.println("diem ko hop le. nhap lai");
                        score = 0;
                        continue;
                    }
                    totalStudent++;
                    sum += score;
                    agv = sum / totalStudent;
                    if (score > maxScore) {
                        maxScore = score;
                    }
                    if (minScore > score) {
                        minScore = score;
                    }

                    System.out.println(academicAbility);
                }
            }
            if (select == 2) {
                System.out.println("***** ket qua *****");
                System.out.printf("So hoc vien da nhap : %d", totalStudent);
                System.out.printf("\nDiem trung binh : %.2f", agv);
                System.out.printf("\nDiem cao nhat : %.2f", maxScore);
                System.out.printf("\nDiem thap nhat : %.2f \n", maxScore == 0 ? 0 : minScore);
            }
            if (select == 3) {
                System.out.println("ket thuc chuong trinh");
                System.exit(0);
            }
        }
    }
}
