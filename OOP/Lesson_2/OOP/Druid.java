package Lesson_2.OOP;
import java.util.Random;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;
    Random rand = new Random();

    public Druid(String name) {
        super(name);
        this.maxHarmony = Magician.rand.nextInt(50, 150);
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s  Harmony: %d", super.getInfo(), this.harmony);
    }

    public void healing(BaseHero target) {
        int heal = BaseHero.rand.nextInt(10, 20);
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }

    @Override
    public void die() {
        BaseHero.names.remove(this.name);
    }
}
