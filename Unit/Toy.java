package toys_game.Unit;

import java.util.UUID;

public abstract class Toy implements ShopInterface{

    private String uid;
    private String type;
    private String name;
    private int quantity;
    private float toyDropRate;

    public Toy(String type, String name, int quantity, float toyDropRate) {
        this.uid = UUID.randomUUID().toString();
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.toyDropRate = toyDropRate;
    }
    
    public float getToyDropRate() {
        return toyDropRate;
    }

    public void setToyDropRate(float toyDropRate) {
        this.toyDropRate = toyDropRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
    
    @Override
    public String getInfo() {
        return String.format("Количество(шт): %s. Тип: %s. Название игрушки: %s.",
        quantity,
        type, 
        name);
    }

}
