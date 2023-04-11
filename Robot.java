package toys_game;

public class Robot extends Toy {

    private String controlType;

    public Robot(String type, String name, int quantity, float toyDropRate, String controlType) {
        super(type, name, quantity, toyDropRate);
        this.controlType = controlType;
    }

}
