import java.util.ArrayList;

public class Testing {

    public static void main(String args[]){
    
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(4);
        nums.add(29);
        nums.add(13);
        nums.add(9);
        nums.add(34);

        for(int num : nums) {
            System.out.println(num);
        }

    }

}