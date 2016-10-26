/**
 * Created by Shenghong_Li on 2016/10/4.
 */
public class 画图空心梯形 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 17; i++) {
            if (i == 5 || i == 7 || i == 9 || i == 11 || i == 13) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (i = 1; i <= 17; i++) {
            if (i == 4 || i == 14) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (i = 1; i <= 17; i++) {
            if (i == 3 || i == 15) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (i = 1; i <= 17; i++) {
            if (i == 2 || i == 16) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (i = 1; i <= 17; i++) {
            if (i == 1 || i==3 || i ==5  || i == 7 || i == 9 || i == 11 || i == 13 || i == 15 || i == 17) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}

