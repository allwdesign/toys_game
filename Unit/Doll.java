package toys_game.Unit;

public class Doll extends Toy {

    private String features;

    public Doll(String name, int quantity, String features) {
        super("Кукла", name, quantity, 0.6f);
        this.features = features;
    }

    @Override
    public String getInfo() {
        String str = super.getInfo() + " Особенности: " + this.features + ".";
        return str;
    }

}
