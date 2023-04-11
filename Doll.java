package toys_game;

public class Doll extends Toy {

    private String features;

    public Doll(String name, int quantity, String features) {
        super("Кукла", name, quantity, 0.6f);
        this.features = features;
    }

}
