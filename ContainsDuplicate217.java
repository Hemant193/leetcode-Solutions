import java.util.*;

public class ContainsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {

        int i = 0;
        int j = 1;
        int length = nums.length;

        Arrays.sort(nums);

        if(length <= 1) {
            return false;
        }


        while(j < length) {
            if(nums[i] == nums[j]) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}
