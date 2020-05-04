import java.util.HashMap;
import java.util.Map;

abstract class Button implements Cloneable {

    protected String color;
    protected String name;

    abstract void setColor();

    abstract void setName();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Button_Prototype1 extends Button {
    public Button_Prototype1() {
        this.color = "Light Blue";
        this.name = "Click1";
    }

    @Override
    void setColor() {
        System.out.println("Button Prototype1 Color: " + this.color);
    }

    @Override
    void setName() {
        System.out.println("Button Prototype1 Name: " + this.name);
    }

}

class Button_Prototype2 extends Button {

    public Button_Prototype2() {
        this.color = "Gray";
        this.name = "Click2";
    }

    @Override
    void setColor() {
        System.out.println("Button Prototype2 Color: " + this.color);
    }

    @Override
    void setName() {
        System.out.println("Button Prototype2 Name: " + this.name);
    }
}

class ButtonStore {

    private static Map<String, Button> buttonMap = new HashMap<String, Button>();

    static {
        buttonMap.put("Light Blue", new Button_Prototype1());
        buttonMap.put("Click1", new Button_Prototype1());
        buttonMap.put("Gray", new Button_Prototype2());
        buttonMap.put("Click2", new Button_Prototype2());
    }

    public static Button getColor(String color) {
        return (Button) buttonMap.get(color).clone();
    }

    public static Button getName(String name) {
        return (Button) buttonMap.get(name).clone();
    }
}

class Prototype {
    public static void main(String[] args) {
        ButtonStore.getColor("Light Blue").setColor();
        ButtonStore.getName("Click1").setName();
        ButtonStore.getColor("Gray").setColor();
        ButtonStore.getName("Click2").setName();

    }
}
