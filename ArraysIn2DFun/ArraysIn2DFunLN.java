public class ArraysIn2DFunLN {

    public static void main(String[] args) {
    
        int[][] nums = new int[10][10];

        // array as grid in row major order
        for(int row=0; row<nums.length; row++) {
            for(int col=0; col<nums[row].length; col++) {
                nums[row][col] = (col + 1) + (row * 10);
                System.out.print(nums[row][col] + "\t");
            }

            System.out.println();
        }

        System.out.println("\n");

        // array as grid in column major order
        for(int row=0; row<nums.length; row++) {
            for(int col=0; col<nums[row].length; col++) {
                System.out.print(nums[col][row] + "\t");
            }

            System.out.println();
        }

        System.out.println("\n");

        // diagonal from top right to bottom left of array
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i][i] + "\t");
        }

        System.out.println("\n\n");

        // diagonal from top right to bottom left of array
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i][nums.length-1-i] + "\t");
        }

        System.out.println("\n\n");

        // array backwards as grid
        for(int row=nums.length-1; row>=0; row--) {
            for(int col=nums[row].length-1; col>=0; col--) {
                System.out.print(nums[row][col] + "\t");
            }

            System.out.println();
        }

        System.out.println();

    }

}