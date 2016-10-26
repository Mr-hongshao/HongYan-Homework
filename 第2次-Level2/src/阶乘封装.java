import java.math.BigInteger;

/**
 * Created by Shenghong_Li on 2016/10/18.
 */
class 阶乘封装 {
    public static void function(int input, int start, int end){
        BigInteger sum = new BigInteger("1");
        for (int i = input; i > 0; i--) {
            sum=sum.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(sum.toString().substring(start,end));

    }
}
class Text{
    public static void main(String args[]){
        阶乘封装.function(1000,20,30);
    }
}
