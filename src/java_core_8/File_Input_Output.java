package java_core_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Input_Output {
    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("src/java_core_8/input.txt");
            output = new FileOutputStream("src/java_core_8/output.txt");

            int c;
            System.out.println("Nội dung file input.txt:");
            StringBuilder inputContent = new StringBuilder();

            while ((c = input.read()) != -1) {
                System.out.print((char) c);
                inputContent.append((char) c);
                output.write(c);
            }
            System.out.println("\nĐã sao chép nội dung sang output.txt.");

            input.close();
            output.close();

            System.out.println("\nNội dung file output.txt:");
            FileInputStream outputInput = new FileInputStream("src/java_core_8/output.txt");
            while ((c = outputInput.read()) != -1) {
                System.out.print((char) c);
            }
            outputInput.close();

        } catch (IOException ex) {
            System.out.println("Lỗi khi xử lý tệp: " + ex.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
