package toys_game;

public class Doll extends Toy{

    private String features;

    public Doll(String name, int quantity, float toyDropRate, String features) {
        super(name, quantity, toyDropRate);
        this.features = features;
    }   
    
}
