class Button {

    protected String color;
    protected String name;

    public void setColor() {
    }

    public void setName() {
    }

}

class Button1 extends Button {
    public Button1() {
        this.color = "Light Blue";
        this.name = "Click1";
    }

    @Override
    public void setColor() {
        System.out.println("Button1 Color: " + this.color);
    }

    @Override
    public void setName() {
        System.out.println("Button1 Name: " + this.name);
    }

}

class Button2 extends Button {

    public Button2() {
        this.color = "Gray";
        this.name = "Click2";
    }

    @Override
    public void setColor() {
        System.out.println("Button2 Color: " + this.color);
    }

    @Override
    public void setName() {
        System.out.println("Button2 Name: " + this.name);
    }
}

class Prototype {
    public static void main(String[] args) {

        Button button1 = new Button1();
        Button button2 = new Button2();

        button1.setColor();
        button1.setName();
        button2.setColor();
        button2.setName();

    }
}