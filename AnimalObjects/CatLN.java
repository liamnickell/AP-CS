/**
* File Name:        CatLN.java
* Purpose:          class blueprint for CatLN objects
* Date Created:     10/31/2016
* Last Updated:     10/31/2016
*
* @author   Liam Nickell
* @version  1.0.0
*/

public class CatLN {

    private String name;
    private String sound;
    private int age;

    /**
    * Method purpose: constructor for class that sets all variables 
    * to default values
    */
    public CatLN() {
        name = "unknown";
        sound = "unknown";
        age = 0;
    }

    /**
    * Method purpose: constructor for class that sets all variables
    * to the corresponding parameter values
    *
    * @param name   sets name equal to this
    * @param sound  sets sound equal to this
    * @param age    sets age equal to this (must be greater than or equal to 0)
    */
    public CatLN(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        
        if(age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    /**
    * Method purpose: toString for class
    *
    * @return string of the animal giving its name, age, and sound
    */
    public String toString() {
        return "I am a cat and my name is " + name 
                + ". I am " + age + " years old and I say " 
                + sound + ".";
    }

    public String getName() { return name; }
    public String getSound() { return sound; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setSound(String sound) { this.sound = sound; }
    public void setAge(int age) { 
        if(age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    /**
    * Method purpose: Makes the animal speak with given sound
    *
    * @return the sound of the animal twice
    */
    public String speak() {
        return sound + ", " + sound + "!";
    }

}