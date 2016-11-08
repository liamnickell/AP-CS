public class CatLN {

    // Instance Variables
    String name;
    String breed;
    int age;

    // Constructors
    public CatLN() {
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public CatLN(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Accessors
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }

    // Mutators
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }
    public void setAge(int age) { this.age = age; }

    // toString
    public String toString() {
        return "My name is " + name + ". I am " + age
                + " years old and am a cat of the " 
                + breed + " breed.";
    }

}