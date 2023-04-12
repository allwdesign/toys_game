package toys_game.Unit;

public class Constructor extends Toy {

    private int numberOfDetails;
    private String complexity;

    public Constructor(String name, int quantity, int numberOfDetails,
            String complexity) {
        super("Конструктор", name, quantity, 0.2f);
        this.numberOfDetails = numberOfDetails;
        this.complexity = complexity;
    }

    @Override
    public String getInfo() {
        String str = super.getInfo() + " Сложность: " + this.complexity + ". Количество деталей: "
                + this.numberOfDetails + ".";
        return str;
    }

}
