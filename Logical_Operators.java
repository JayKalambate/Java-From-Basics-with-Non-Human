public class Logical_Operators {
    public static void main(String[] args) {
        int x = 24;
        int y = 56;
        int a = 45;
        int b = 99;
        
        // And Operations
        boolean And = x>y && a<b;
        System.out.println(And);

        // OR Operations
        boolean Or = x>y || a<b;
        System.out.println(Or);

        // Not Operations
        boolean Not = !(x>y);
        System.out.println(Not);
    }
    
}
