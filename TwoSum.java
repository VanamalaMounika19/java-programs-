import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
       throw new IllegalArgumentException("No two sum solution");
     
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Read the array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Find the two sum solution
      //  try {
            int[] result = twoSum(nums, target);
            System.out.println(result[0] + "," + result[1]);
       // } catch (IllegalArgumentException e) {
           // System.out.println(e.getMessage());
        

        scanner.close();
    }
}
