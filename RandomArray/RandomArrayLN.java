public class RandomArrayLN {

    public static void main(String[] args) {
        
        int[] occurances = new int[25];
        int num = 0;

        for(int i=0; i<100; i++) {
            num = (int)(Math.random()*25) + 1;
            occurances[num-1]++;
        }

        System.out.println("Occurances:");
        for(int i=0; i<25; i++) {
            System.out.println((i+1) + ":\t" + occurances[i]);
        }

    }

}