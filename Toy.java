package toys_game;

import java.util.UUID;

public abstract class Toy {

    private String uid;
    private String type;
    private String name;
    private int quantity;
    private float toyDropRate;
    protected static int toyCnt;

    public Toy(String type, String name, int quantity, float toyDropRate) {
        this.uid = UUID.randomUUID().toString();
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.toyDropRate = toyDropRate;
    }

    static {
        toyCnt = 0;
    }
    
    public float getToyDropRate() {
        return toyDropRate;
    }

    public void setToyDropRate(float toyDropRate) {
        this.toyDropRate = toyDropRate;
    }

    @Override
    public String toString() {
        return String.format("ID: %s. Тип: %s. Название игрушки: %s. Количество: %s. Частота выпадения: %s",
                uid,
                type, 
                name, 
                quantity,
                toyDropRate);
    }

}
