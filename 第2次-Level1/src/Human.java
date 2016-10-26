/**
 * Created by Shenghong_Li on 2016/10/16.
 */
public class Human {
    String name;
    int age;
    private String sex;

    Human(String sex_set){
        this.sex = sex_set;
    }

    public void set_information(String set_name , int set_age){
        name = set_name;
        age = set_age;
    }
    public void introduce(Human people){
        System.out.print("Hellow,大家好，我是你们的"+ people.sex + people.name + ",我今年"+ people.age + "岁了！\n");
    }
}
class a_1{

}
class a_2{

}
class Text{
    public static void main(String args[]){
        Human P1 = new Human("学长");
        Human P2 = new Human("学长");
        Human P3 = new Human("学长");
        Human P4 = new Human("学姐");
        Human P5 = new Human("学姐");
        Human P6 = new Human("学姐");
        P1.set_information("学长1",18);
        P2.set_information("学长2",18);
        P3.set_information("学长3",18);
        P4.set_information("学姐1",18);
        P5.set_information("学姐2",18);
        P6.set_information("学姐3",18);
        P1.introduce(P1);
        P2.introduce(P2);
        P3.introduce(P3);
        P4.introduce(P4);
        P5.introduce(P5);
        P6.introduce(P6);
    }
}