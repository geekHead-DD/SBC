package Arrays;

public class equilibrium {
    public static int findEquilibriumIdx(int nums[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0, rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            leftSum += nums[i]; //sum till nums[i] ,prefix
            // System.out.println("leftSum "+leftSum +" index "+i);
            if (leftSum == rightSum) {              //2+3+(-1) =4
                return i;                           //3 (8)
            }
            rightSum -= nums[i]; //suffix
            // System.out.println("rightSum "+rightSum+" index "+i);

        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 5;
        int nums[] = {2, 3, -1, 8, 4};
        int equilibriumidx = findEquilibriumIdx(nums, n);
        System.out.println(equilibriumidx);

    }
}
