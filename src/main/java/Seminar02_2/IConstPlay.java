package Seminar02_2;

public class IConstPlay implements IConst {
    public static void main(String[] args) {
        int nums[] = new int[MAX];
        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) {
                System.out.println(ERROR);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
