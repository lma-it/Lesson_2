package Lesson_2.OOP;
import static print_module.print_library.println;

import alliance.*;


/**
 * Intro_Abstraction_and_Interface
 */
public class Intro_Abstraction_and_Interface {

    void A(){
        println("A()");
    }

    public static void main(String[] args) {
        println("Hello");

        // АБСТРАКЦИЯ - это свойство системы, позволяющее описывать общие характеристики базового класса, для всех его производных классов, а наполнение деталями представляется каждому из этих классов.

        // A(); при попытке вызвать не static метод в static main программа даже не скомпилируется, чтоб этого избежать, необходимо создать экзкспляр класса Intro_Abstract_and_Interface и уже у экзкмлпяра этого класса можно будет вызвать метод A().

        Intro_Abstraction_and_Interface intro_Abstraction_and_Interface = new Intro_Abstraction_and_Interface();
        intro_Abstraction_and_Interface.A(); // В этом случае проблем нет и не статический метод А() отработает как положено.

        // int teamCount = 10;
        // Random rand = new Random();

        // var teams = new ArrayList<BaseHero>();

        // for (int i = 0; i < teamCount; i++){
        //     int val = rand.nextInt(4);

        //     switch (val) {
        //         case 0:
        //             teams.add(new Priest(""));
        //             break;
        //         case 1:
        //             teams.add(new Magician(""));
        //             break;
        //         case 2:
        //             teams.add(new Druid(""));
        //             break;
        //         case 3:
        //             teams.add(new Human(""));
        //             break;
        //         default:
        //             break;
        //     }
        //     println(teams.get(i).getInfo());
        // }

        Priest priest = new Priest("Blessed");
        println(priest.getInfo());
        Druid druid = new Druid("Drull");
        println(druid.getInfo());
        Magician magician = new Magician("Archmage");
        println(magician.getInfo());

        priest.Attack(magician);
        println(magician.getInfo());
        priest.Attack(magician);
        println(magician.getInfo());
        druid.healing(magician);
        println(magician.getInfo());
        druid.healing(magician);
        println(magician.getInfo());
        druid.healing(magician);
        println(magician.getInfo());
        druid.healing(magician);
        println(magician.getInfo());
        druid.healing(magician);
        println(magician.getInfo());

        // BaseHero dd = new Druid("Dwarf_Druid");

        Dwarf dwarf = new Dwarf("");
        dwarf.dwarfMethod();
        ((Dwarf)dwarf).dwarfMethod();
        println(dwarf.name);

        // Абстракция - это свойство системы, позволяющее описать общие характеристики базового класса для всех его производных классов (наследников), а наполнение деталями предоставляется каждому из этих классов. В абстрактном классе, определяются лишь общие поля и характер методов. которые должны быть конкретно реализованы в производных классах, а не в самом базовом классе.

        // Интерфейс предназаначен для описания исключительно общего поведения сущностей.

        // ЧАСТНЫЙ СЛУЧАЙ: для гарантии, реализации некоторого поведения.

        // ИНТРЕФЕЙС - это частный случай класса, который представляет собой полностью абстрактный класс с абстрактными членами.

        
        
    }
}