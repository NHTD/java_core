package java_core_9;

public class ThrowsEx {
    public static void main(String[] args) throws Exception {
        int point = 6;
        if(point < 6) {
            throw new Exception("Point must be greater than 7 to be considered good");
        }
    }
}
