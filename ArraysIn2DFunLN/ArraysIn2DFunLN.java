public class ArraysIn2DFunLN {

    public static void main(String[] args) {
        int[][] nums = new int[10][10];

        for(int row=0; row<nums.length; row++) {
            for(int i=0; i<161; i++) { System.out.print("-"); }
            System.out.println();
            System.out.print("|\t");

            for(int col=0; col<nums[row].length; col++) {
                nums[row][col] = (row+1) * (col+1);
                System.out.print(nums[row][col] + "\t|\t");
            }

            System.out.println();
        }

        for(int i=0; i<161; i++) { System.out.print("-"); }
        System.out.println();
    }

}