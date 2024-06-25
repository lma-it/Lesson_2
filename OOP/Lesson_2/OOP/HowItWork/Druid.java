package Lesson_2.OOP.HowItWork;

public class Druid extends BaseHero {

    int mp;
    public Druid(String name, int hp, int mp){
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");
        this.mp = mp;
    }

    public Druid() {
        this("", 0, 0);
        System.out.println("Вызван Druid()");
    }
}
