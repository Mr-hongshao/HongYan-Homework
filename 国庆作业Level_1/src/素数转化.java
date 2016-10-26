/**
 * Created by Shenghong_Li on 2016/10/4.
 */
public class 素数转化 {
    public static void main(String[] args) {
        int a;
        int i;
        for (a = 20160913; ; a++) {
            boolean judge = true;
            for (i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    judge = false;
                    break;
                } else if (a % i != 0) {
                    continue;
                } else {
                    break;
                }
            }
            if (judge) {
                System.out.print("20160913后的第一个素数为：");
                System.out.print(a);
                break;
            }
        }
    }
}