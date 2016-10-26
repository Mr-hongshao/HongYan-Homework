import java.util.Scanner;

/**
 * Created by Shenghong_Li on 2016/10/4.
 */
public class 时间解析 {
    public static void main(String[] args) {
        final int nianmiaoshu = 31536000;
        final int rimiaoshu = 86400;
        final int shimiaoshu = 3600;
        final int fenmiaoshu =60;
        Scanner input = new Scanner(System.in);
        System.out.print("输入时间戳：\n");
        int a;
        boolean judge;
        int nian, yue = 0, ri,shi, fen, miao;
        a = input.nextInt();
        if (a / nianmiaoshu > 6)
        {
            if (((a / nianmiaoshu) - 2) % 4 == 0) {
                judge = false;
            } else {
                judge = true;
            }
        }
        else
        {
            if (a / nianmiaoshu == 2 || a/nianmiaoshu ==6) {
                judge = false;
            }
            else
            {
                judge = true;
            }
        }
        if (judge == true)
        {
            int runnianshu;
            if (a / nianmiaoshu < 2)
            {
                runnianshu = 0;
            }
            else
            {
                runnianshu = ((a/nianmiaoshu)+2)/4;
            }
            nian = a/nianmiaoshu+1970;
            int panduanyue;
            panduanyue = a-(nian-1970)*nianmiaoshu;
            if(panduanyue >=(0*rimiaoshu) && panduanyue <(31*rimiaoshu))yue =1;
            if(panduanyue >=(31*rimiaoshu) && panduanyue <(59*rimiaoshu))yue =2;
            if(panduanyue >=(59*rimiaoshu) && panduanyue <(90*rimiaoshu))yue =3;
            if(panduanyue >=(90*rimiaoshu) && panduanyue <(120*rimiaoshu))yue =4;
            if(panduanyue >=(120*rimiaoshu) && panduanyue <(151*rimiaoshu))yue =5;
            if(panduanyue >=(151*rimiaoshu) && panduanyue <(181*rimiaoshu))yue =6;
            if(panduanyue >=(181*rimiaoshu) && panduanyue <(212*rimiaoshu))yue =7;
            if(panduanyue >=(212*rimiaoshu) && panduanyue <(243*rimiaoshu))yue =8;
            if(panduanyue >=(243*rimiaoshu) && panduanyue <(273*rimiaoshu))yue =9;
            if(panduanyue >=(273*rimiaoshu) && panduanyue <(304*rimiaoshu))yue =10;
            if(panduanyue >=(304*rimiaoshu) && panduanyue <(334*rimiaoshu))yue =11;
            if(panduanyue >=(334*rimiaoshu) && panduanyue <(365*rimiaoshu))yue =12;
            int zongyuetianshu =0;
            if(yue == 1) zongyuetianshu = 0;
            if(yue == 2) zongyuetianshu =31;
            if(yue == 3) zongyuetianshu =59;
            if(yue == 4) zongyuetianshu =90;
            if(yue == 5) zongyuetianshu =120;
            if(yue == 6) zongyuetianshu =151;
            if(yue == 7) zongyuetianshu =181;
            if(yue == 8) zongyuetianshu =212;
            if(yue == 9) zongyuetianshu =243;
            if(yue == 10) zongyuetianshu = 273;
            if(yue == 11)zongyuetianshu =304;
            if(yue == 12)zongyuetianshu =334;
            ri = 1+(a-(nian-1970)*nianmiaoshu-runnianshu*rimiaoshu-zongyuetianshu*rimiaoshu)/rimiaoshu;
            shi =((a%rimiaoshu)/shimiaoshu);
            fen =(a-(nian-1970)*nianmiaoshu-runnianshu*rimiaoshu-zongyuetianshu*rimiaoshu-(ri-1)*rimiaoshu-shi*shimiaoshu)/fenmiaoshu;
            miao =a%60;
        }
        else
        {
            int runnianshu;
            if (a / nianmiaoshu == 2)
            {
                runnianshu = 1;
            }
            else
            {
                runnianshu = ((a/nianmiaoshu)+2)/4;
            }
            nian = a/nianmiaoshu+1970;
            int panduanyue;
            panduanyue = a-(nian-1970)*nianmiaoshu;
            if(panduanyue >=(0*rimiaoshu) && panduanyue <(31*rimiaoshu))yue =1;
            if(panduanyue >=(31*rimiaoshu) && panduanyue <(60*rimiaoshu))yue =2;
            if(panduanyue >=(60*rimiaoshu) && panduanyue <(91*rimiaoshu))yue =3;
            if(panduanyue >=(91*rimiaoshu) && panduanyue <(121*rimiaoshu))yue =4;
            if(panduanyue >=(121*rimiaoshu) && panduanyue <(152*rimiaoshu))yue =5;
            if(panduanyue >=(152*rimiaoshu) && panduanyue <(182*rimiaoshu))yue =6;
            if(panduanyue >=(182*rimiaoshu) && panduanyue <(213*rimiaoshu))yue =7;
            if(panduanyue >=(213*rimiaoshu) && panduanyue <(244*rimiaoshu))yue =8;
            if(panduanyue >=(244*rimiaoshu) && panduanyue <(274*rimiaoshu))yue =9;
            if(panduanyue >=(274*rimiaoshu) && panduanyue <(305*rimiaoshu))yue =10;
            if(panduanyue >=(305*rimiaoshu) && panduanyue <(335*rimiaoshu))yue =11;
            if(panduanyue >=(335*rimiaoshu) && panduanyue <(366*rimiaoshu))yue =12;
            int zongyuetianshu= 0;
            if(yue == 1) zongyuetianshu = 0;
            if(yue == 2) zongyuetianshu =31;
            if(yue == 3) zongyuetianshu =60;
            if(yue == 4) zongyuetianshu =91;
            if(yue == 5) zongyuetianshu =121;
            if(yue == 6) zongyuetianshu =152;
            if(yue == 7) zongyuetianshu =182;
            if(yue == 8) zongyuetianshu =213;
            if(yue == 9) zongyuetianshu =244;
            if(yue == 10) zongyuetianshu = 274;
            if(yue == 11)zongyuetianshu =305;
            if(yue == 12)zongyuetianshu =335;
            ri = 1+(a-(nian-1970)*nianmiaoshu-(runnianshu-1)*rimiaoshu-zongyuetianshu*rimiaoshu)/rimiaoshu;
            shi =((a%rimiaoshu)/shimiaoshu);
            fen =(a-(nian-1970)*nianmiaoshu-(runnianshu-1)*rimiaoshu-zongyuetianshu*rimiaoshu-(ri-1)*rimiaoshu-shi*shimiaoshu)/fenmiaoshu;
            miao =a%60;
        }
        System.out.print("对应北京时间为：");
        System.out.print(nian);
        System.out.print("年");
        System.out.print(yue);
        System.out.print("月");
        System.out.print(ri);
        System.out.print("日");
        System.out.print(shi+8);
        System.out.print("时");
        System.out.print(fen);
        System.out.print("分");
        System.out.print(miao);
        System.out.print("秒");
    }
}
