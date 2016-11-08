/**
* File Name:        DogLN.java
* Purpose:          class blueprint for DogLN objects
* Date Created:     10/5/2016
* Last Updated:     10/11/2016
*
* @author   Liam Nickell
* @version  1.0.0
*/

public class DogLN {

// Varibles (attributes, states)
    private int age;
    private String breed;
    private String name;
    private String sound;

// Methods (behaviors)
    // Constructors
    public DogLN(int age, String breed, String name, String sound) {
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("Invalid age input.");
            this.age = 0;
        }

        this.breed = breed;
        this.name = name;
        this.sound = sound;
    }

    public DogLN(int num) {
        if(num == 12) {
            age = 6;
            breed = "Shiba Inu";
            name = "Levi";
            sound = "Ruff Ruff, give me food so I can stay fat";
        } else {

        }
    }

    public DogLN() {
        age = 0;
        breed = "Shiba Inu";
        name = "FNU";
        sound = "Bark Bark I\'m generic";
    }

    // Accessors and Mutators (Getters and Setters)
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    
    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge(int age) { return age; }
    public void setAge() { 
        if(age >= 0) {
            this.age = age; 
        } else {
            System.out.println("Invalid age input.");
        }
    }

    // What class returns when called (toString)
    public String toString() {
        String str = "";

        str += "My name is " + name + " and ";
        str += "I am " + age + "years old. ";
        str += "I am a " + breed + " and ";
        str += "I say \"" + sound + "\".";

        return str;
    }

    // Behaviors

}