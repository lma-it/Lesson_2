package Interface;

import Interface.lesson_2.Healers.Healer;
import Interface.lesson_2.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior{

    @Override
    public void Attack(Hero target) {
    }

    @Override
    public void healing(Hero target) {
    }
    
}
