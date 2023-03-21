package pr4;

import java.util.ArrayList;

public class Lab2 {
    public static void main(String[] args) {

        int[] nums1 = {1, 7};
        int[] nums2 = {5, 8, 6, 3, 4};
        int[] nums3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        sortedArray(sortOddNums(extractOddNums(nums1)), nums1);
        sortedArray(sortOddNums(extractOddNums(nums2)), nums2);
        sortedArray(sortOddNums(extractOddNums(nums3)), nums3);

    }
    public static ArrayList<Integer> extractOddNums(int[] nums){
        ArrayList<Integer> oddNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddNums.add(nums[i]);
            }
        }
        return oddNums;
    }

    public static ArrayList<Integer> sortOddNums(ArrayList<Integer> oddNums){
        for (int k = 0; k < oddNums.size(); k++) {
            for (int i = 1; i < oddNums.size() - k; i++) {
                if (oddNums.get(i) < oddNums.get(i - 1)) {
                    int num = oddNums.get(i - 1);
                    oddNums.set(i - 1, oddNums.get(i));
                    oddNums.set(i, num);
                }
            }
        }
        return oddNums;
    }

    public static void sortedArray(ArrayList<Integer> oddNums, int[] nums){
        int elNum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                nums[i] = oddNums.get(elNum);
                elNum += 1;
            }
            System.out.printf(" %d ", nums[i]);
        }
        System.out.println(" ");
    }
}

