import java.util.HashMap; 
import java.util.Map; 
  
  
abstract class Button implements Cloneable 
{ 
      
    protected String color; 
    protected String name; 

    abstract void setColor(); 
    abstract void setName();

    public Object clone() 
    { 
        Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
    } 
} 
  
class Button1 extends Button 
{ 
    public Button1()  
    { 
        this.color = "Light Blue"; 
        this.name = "Button1";
    } 
   
    @Override
    void setColor()  
    { 
        System.out.println("Button1 Color: " + this.color);
    }
    @Override
    void setName()  
    { 
        System.out.println("Button1 Name: " + this.name); 
    }  
      
} 
  
class Button2 extends Button{ 
   
    public Button2() 
    { 
        this.color = "Light Blue"; 
        this.name = "Button2"; 
    } 
   
    @Override
    void setColor()  
    { 
        System.out.println("Button2 Color: " + this.color);
    }
    @Override
    void setName()  
    { 
        System.out.println("Button2 Name: " + this.name); 
    }  
} 
   
class ButtonStore { 
   
    private static Map<String, Button> buttonMap = new HashMap<String, Button>();  
       
    static 
    { 
        buttonMap.put("Light Blue", new Button1()); 
        buttonMap.put("Button1", new Button1()); 
        buttonMap.put("Light Blue", new Button2()); 
        buttonMap.put("Button2", new Button2()); 
    } 
       
    public static Button getColor(String color) 
    { 
        return (Button) buttonMap.get(color).clone(); 
    } 
    public static Button getName(String name) 
    { 
        return (Button) buttonMap.get(name).clone(); 
    }
} 
  
class Prototype 
{ 
    public static void main (String[] args) 
    { 
        ButtonStore.getColor("Light Blue").setColor(); 
        ButtonStore.getName("Button1").setName();
        ButtonStore.getColor("Light Blue").setColor();
        ButtonStore.getName("Button2").setName(); 

    } 
} 
