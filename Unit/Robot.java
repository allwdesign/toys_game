package toys_game.Unit;

public class Robot extends Toy {

    private String controlType;

    public Robot(String name, int quantity, String controlType) {
        super("Робот", name, quantity, 0.2f);
        this.controlType = controlType;
    }

}
