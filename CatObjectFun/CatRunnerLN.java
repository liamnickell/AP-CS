public class CatRunnerLN {

    public static void main(String[] args) {
        
        CatLN cat1 = new CatLN();
        CatLN cat2 = new CatLN("Tom", "British Shorthair", 4);
        CatLN cat3 = new CatLN("Epicurus", "Maine Coon", 12);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        cat1.setName("Marlow");
        cat1.setBreed("Savannah Cat");
        cat1.setAge(24);

        System.out.println(cat1);
    }

}