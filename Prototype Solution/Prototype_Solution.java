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

class Button_Prototype extends Button {
    public Button_Prototype() {
        color = "red";
        name = "click";
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

    public static Button getColor(String color) {
        return (Button) buttonMap.get(color).clone();
    }

    public static Button getName(String name) {
        return (Button) buttonMap.get(name).clone();
    }

    static {
        buttonMap.put("red", new Button_Prototype());
        buttonMap.put("click", new Button_Prototype());
    }
}

class Prototype {
    public static void main(String[] args) {
        ButtonData.getName("click").setName();
        ButtonData.getColor("red").setColor();
    }
}
