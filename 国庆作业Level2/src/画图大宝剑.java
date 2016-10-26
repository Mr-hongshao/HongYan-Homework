/**
 * Created by Shenghong_Li on 2016/10/4.
 */
public class 画图大宝剑 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 18; i++) {
            if (i == 9) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (i = 1; i <= 18; i++) {
            if (i == 8 || i == 10) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (i = 1; i <= 18; i++) {
            if (i == 7 || i == 9 || i == 11) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (i = 1; i <= 18; i++) {
            if (i == 6 || i == 8 || i == 10 || i == 12) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        int j;
        for (j = 1; j <= 20; j++) {
            for (i = 1; i <= 18; i++) {
                if (i==5 || i == 7 || i == 9 || i == 11 || i==13) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(i=1;i<=18;i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 13 || i == 15 || i == 17) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for(i=1;i<=18;i++) {
            if (i == 2 || i == 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14 || i == 16 ) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for(i=1;i<=18;i++) {
            if ( i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 13 || i == 15) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for(i=1;i<=18;i++) {
            if ( i == 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for(i=1;i<=18;i++) {
            if (i == 5 || i == 7 || i == 9 || i == 11 || i == 13) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for(i=1;i<=18;i++) {
            if (i == 6 || i == 8 || i == 10 || i == 12) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        int k;
        for(k=1;k<=6;k++){
            for(i=1;i<=18;i++) {
                if (i == 7 || i == 9 || i == 11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
         System.out.print("\n");
        }
    }
}
