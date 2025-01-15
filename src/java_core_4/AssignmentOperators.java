package java_core_4;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a=5;
        int rs1=0;
        rs1+=a;
        System.out.println(rs1); // 5

        int rs2=0;
        rs2-=a;
        System.out.println(rs2); // -5

        int rs3=0;
        rs3/=a;
        System.out.println(rs3); // 0

        int rs4=0;
        rs4*=a;
        System.out.println(rs4); // 0

        int rs5=0;
        rs5%=a;
        System.out.println(rs5); // 0

        int rs6=0;
        rs6 = a;
        System.out.println(rs6); // 5
    }
}
