package toys_game;

public class Constructor extends Toy{
    
    private int numberOfDetails;
    private String complexity;
    
    public Constructor(String name, int quantity, float toyDropRate, int numberOfDetails, String complexity) {
        super(name, quantity, toyDropRate);
        this.numberOfDetails = numberOfDetails;
        this.complexity = complexity;
    }

    
}
