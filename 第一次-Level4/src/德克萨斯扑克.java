/**
 * Created by Shenghong_Li on 2016/10/11.
 */
import java.util.Random;

class Card {
    public String num;
    public String suit;
    Card(String n,String s) {
        this.num=n;
        this.suit=s;
    }
    public String toString() {
        String ss=suit+":"+num;
        return ss;
    }
}

class DeskOfCard {
    Card card[];
    public void initcard() {
        String num[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String suit[] = {"方块", "梅花", "红桃", "黑桃"};
        card = new Card[52];
        for (int i = 0; i < 52; i++) {
            card[i] = new Card(num[i % 13], suit[i / 13]);
        }
    }
    public void shufflecard() {
        Random rd = new Random();
        for (int i = 0; i < 52; i++) {
            int j = rd.nextInt(52);
            Card temp = card[i];
            card[i] = card[j];
            card[j] = temp;
        }
    }
    public void dealcard(int i){
        System.out.print(card[i]);
    }
}
class game {
    public static void main(String[] args) {
        System.out.print("现在开始游戏！\n");
        DeskOfCard F1 = new DeskOfCard();
        F1.initcard();
        F1.shufflecard();
        String output;
        System.out.print("玩家的牌为：");
        F1.dealcard(1);
        F1.dealcard(2);
        System.out.print("\n");
        System.out.print("电脑的牌为：");
        F1.dealcard(3);
        F1.dealcard(4);
        System.out.print("\n");
    }
}
