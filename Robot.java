package toys_game;

public class Robot extends Toy{

    private String controlType;

    public Robot(String name, int quantity, float toyDropRate, String controlType) {
        super(name, quantity, toyDropRate);
        this.controlType = controlType;
    }

    
    
}
