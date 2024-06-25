package Lesson_2.OOP;
public class Priest extends BaseHero{


    private int elixir;
    private int maxElixir;

    public Priest(String name){
        super(name);
        this.maxElixir = Priest.rand.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public String getInfo(){
        return String.format("%s Elixir: %d", super.getInfo(), this.elixir);
    }

    @Override
    public void die() {
        BaseHero.names.remove(this.name);
    }


}
