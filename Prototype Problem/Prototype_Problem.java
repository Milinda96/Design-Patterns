class Button {

    protected String color;
    protected String name;

    public void setColor() {
    }

    public void setName() {
    }

}

class Button_Prototype1 extends Button {
    public Button_Prototype1() {
        this.color = "Light Blue";
        this.name = "Click1";
    }

    @Override
    public void setColor() {
        System.out.println("Button Prototype1 Color: " + this.color);
    }

    @Override
    public void setName() {
        System.out.println("Button Prototype1 Name: " + this.name);
    }

}

class Button_Prototype2 extends Button {

    public Button_Prototype2() {
        this.color = "Gray";
        this.name = "Click2";
    }

    @Override
    public void setColor() {
        System.out.println("Button Prototype2 Color: " + this.color);
    }

    @Override
    public void setName() {
        System.out.println("Button Prototype2 Name: " + this.name);
    }
}

class Prototype {
    public static void main(String[] args) {

        Button button_Prototype1 = new Button_Prototype1();
        Button button_Prototype2 = new Button_Prototype2();

        button_Prototype1.setColor();
        button_Prototype1.setName();
        button_Prototype2.setColor();
        button_Prototype2.setName();

    }
}