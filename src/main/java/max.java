import java.util.Scanner;


public class max {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size < 20) System.out.println("Size must be >= 20 ");

        } while (size < 20);
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("arr["+i+"]=");
            arr[i]=scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max is: "+max);
    }
}
