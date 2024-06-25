package Interface;
import static print_module.print_library.println;

import java.util.ArrayList;
import java.util.List;

import Interface.lesson_2.Healers.Druid;
import Interface.lesson_2.Healers.Healer;
import Interface.lesson_2.Healers.Shaman;
import Interface.lesson_2.Warriors.Knight;
import Interface.lesson_2.Warriors.Paladin;
import Interface.lesson_2.Warriors.Warrior;

public class Intro_To_Interface {
    public static void main(String[] args) {
        println("Hello");

        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        var h = team1.get(0);

        if(h instanceof Warrior){
            ((Warrior) h).Attack(null);
        }else if (h instanceof Healer){
            ((Healer) h).healing(null);
        }else{
            //...
        }


        var team2 = new ArrayList<Warrior>();
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).Attack(null);

        var team3 = new ArrayList<Healer>();
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);

    }
}
