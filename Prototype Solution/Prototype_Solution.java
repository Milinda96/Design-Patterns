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
        } catch (final CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Button_Prototype extends Button {
    public Button_Prototype() {
        this.color = "red";
        this.name = "click";
    }

    @Override
    void setColor() {
        System.out.println("Red");
    }

    @Override
    void setName() {
        System.out.println("Click");
    }

}

class ButtonData {

    private static Map<String, Button> buttonMap = new HashMap<String, Button>();

    static {
        buttonMap.put("red", new Button_Prototype());
        buttonMap.put("click", new Button_Prototype());
    }

    public static Button getColor(final String color) {
        return (Button) buttonMap.get(color).clone();
    }

    public static Button getName(final String name) {
        return (Button) buttonMap.get(name).clone();
    }
}

// Driver class
class Prototype {
    public static void main(final String[] args) {
        ButtonData.getName("click").setName();
        ButtonData.getColor("red").setColor();
    }
}
