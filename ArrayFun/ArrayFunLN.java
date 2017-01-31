public class ArrayFun {
    
    public static void main(String[] args) {
        
        int[] arrgh = new int[10];
        System.out.println(arrgh);

        for(int i=0; i<arrgh.length; i++) {
            System.out.print(arrgh[i] + "\t");
        }

        System.out.println();

        for(int i=10; i<=100; i+=10) {
            arrgh[(i-10)/10] = i;
            System.out.print(arrgh[(i-10)/10] + "\t");
        }

        System.out.println();

        String[] names = {"Liam", "Dez", "Kirk", "Will"};

        for(int i=0; i<names.length; i++) {
            if(names[i].equals("Liam")) {
                System.out.println("Liam is at position " + i);
            } else {
                System.out.println("Liam is not at position " + i);
            }
        }

        System.out.println();

        for(int i=0; i<names.length; i++) {
            if(names[i].equals("Kirk")) {
                System.out.println("Kirk is at position " + i);
            } else {
                System.out.println("Kirk is not at position " + i);
            }
        }

        System.out.println();

        for(int i=0; i<names.length; i++) {
            if(names[i].equals("Dez")) {
                System.out.println("Dez is at position " + i);
            } else {
                System.out.println("Dez is not at position " + i);
            }
        }

        System.out.println();

        int[] threes = new int[100];

        for(int i=0; i<100; i++) {
            threes[i] = i * 3;
        }

        for(int i=0; i<100; i++) {
            if(i % 10 == 0) {
                System.out.println();
            }

            System.out.print(threes[i] + "\t");
        } 

    }

}