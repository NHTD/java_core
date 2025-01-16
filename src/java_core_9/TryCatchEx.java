package java_core_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchEx {
    public static void main(String[] args) {
        // checked
        try {
            new FileInputStream("input.txt");
        } catch (Exception ex) {
            System.out.println("File doesn't exist " + ex.getMessage());
        }

        // unchecked
        int[] arr = new int[]{1, 2, 3};
        arr[3]=2; // error: ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    }
}
