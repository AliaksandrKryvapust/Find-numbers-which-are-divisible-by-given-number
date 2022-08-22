import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int dev = 2;
        System.out.println(Arrays.equals(divisibleBy(arr, dev), new int[]{2, 4, 6}));
    }
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        count=0;
        for (int number : numbers) {
            if (number % divider == 0) {
                result[count] = number;
                count++;
            }
        }
        return result; //Arrays.stream(numbers).filter((i) -> (i % divider) == 0).toArray();
    } }


