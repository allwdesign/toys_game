package toys_game;

public class Doll extends Toy {

    private String features;

    public Doll(String type, String name, int quantity, float toyDropRate, String features) {
        super(type, name, quantity, toyDropRate);
        this.features = features;
    }

}
