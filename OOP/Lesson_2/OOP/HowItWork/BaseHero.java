package Lesson_2.OOP.HowItWork;

public abstract class BaseHero {
    
    int hp;
    
    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
        this.hp = hp;
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызвван BaseHero()");
    }
    
}
