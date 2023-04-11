package toys_game;

public class Constructor extends Toy {

    private int numberOfDetails;
    private String complexity;

    public Constructor(String name, int quantity, int numberOfDetails,
            String complexity) {
        super("Конструктор", name, quantity, 0.2f);
        this.numberOfDetails = numberOfDetails;
        this.complexity = complexity;
    }

}
