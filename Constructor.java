package toys_game;

public class Constructor extends Toy {

    private int numberOfDetails;
    private String complexity;

    public Constructor(String type, String name, int quantity, float toyDropRate, int numberOfDetails,
            String complexity) {
        super(type, name, quantity, toyDropRate);
        this.numberOfDetails = numberOfDetails;
        this.complexity = complexity;
    }

}
