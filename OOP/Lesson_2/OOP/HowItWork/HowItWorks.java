package Lesson_2.OOP.HowItWork;
import static print_module.print_library.println;

public class HowItWorks {
    public static void main(String[] args) {
        println("Hello");

        println("\nDwarf dw1 = new Dwarf()");
        Dwarf dw1 = new Dwarf();
        println(dw1);

        println("\nDruid dw2 = new Dwarf()");
        Druid dw2 = new Dwarf();
        println(dw2);

        println("\nBaseHero dw3 = new Dwarf()");
        BaseHero dw3 = new Dwarf();
        println(dw3);
        
    }
}
