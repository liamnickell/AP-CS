/**
* Program Name:        Library.java
* Program Purpose:     runner class for ReadingMaterial assignment
* Date Created:        2/27/2017
* Last Modified:       3/2/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        
        ArrayList<ReadingMaterial> readingMaterial = new ArrayList<ReadingMaterial>();
        readingMaterial.add(new Book("Chaos: Making a New Science", "312-43-1231293-0",
                                     new Date(5, 2, 1978), "Viking Press", "James Gleick"));
        readingMaterial.add(new Book("Accelerated C++", "436-97-3952481-0",
                                     new Date(25, 7, 2000), "Addison-Wesley", "Andrew Koenig and Barbara Moo"));
        
        readingMaterial.add(new Magazine("Popular Science", "743-35-7438075-0",
                                     new Date(10, 2, 2017), "Science and Technology", "Cliff Ransom"));
        readingMaterial.add(new Magazine("MAKE Magazine", "865-21-5932851-0",
                                     new Date(17, 11, 2016), "Science and Technology", "Dale Dougherty"));

        readingMaterial.add(new Textbook("PreCalculus", "926-18-1285395-0",
                                     new Date(1, 5, 2010), "Math", 960));
        readingMaterial.add(new Textbook("Cambell Biology", "105-33-1769284-0",
                                     new Date(25, 7, 2000), "Biology", 1020));

        for(ReadingMaterial rm : readingMaterial) {
            System.out.println(rm);
        }

        System.out.println("Chaos == Accelerated C++? " + readingMaterial.get(0).equals(readingMaterial.get(1)));
        System.out.println("Popular Science == PreCalculus? " + readingMaterial.get(2).equals(readingMaterial.get(4)));
        System.out.println("Accelerated C++ == Accelerated C++? " + readingMaterial.get(0).equals(readingMaterial.get(0)));
        System.out.println("Cambell Biology == MAKE Magazine? " + readingMaterial.get(5).equals(readingMaterial.get(3)));
        System.out.println("PreCalculus == PreCalculus? " + readingMaterial.get(4).equals(readingMaterial.get(4)));

    }

}
