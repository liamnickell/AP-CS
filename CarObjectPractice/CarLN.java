public class CarLN {
    
    private static String color; // Testing how static works in OOP
    private String model;

    public CarLN(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String toString() {
        return "I am a " + color + " " + model + ".";
    }

    public String getColor() { return color; }
    public String getModel() { return model; }

    public void setColor(String color) { this.color = color; }
    public void setModel(String model) { this.model = model; }

}