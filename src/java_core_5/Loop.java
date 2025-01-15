package java_core_5;

public class Loop {
    public static void main(String[] args) {
        System.out.println("=====for=====");
        for(int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("=====do while=====");
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=10);
        System.out.println();

        System.out.println("=====while=====");
        int i1=1;
        while (i1 <= 5) {
            System.out.print(i1+" ");
            i1++;
        }
        System.out.println();

        System.out.println("=====foreach=====");
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        for(int item : arr) {
            System.out.print(item+" ");
        }
    }
}
