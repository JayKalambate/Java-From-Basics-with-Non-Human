class Method{
    public static void main(String[] args) {
        Calculator Calc = new Calculator();     //At this point we are calling the object to use the methods
        System.out.println(Calc.add(5, 6));  // This is Addition 
        System.out.println(Calc.subtract(10, 5));  // This is Substraction
        System.out.println(Calc.multiply(5, 5));   // This is Multiplication
        System.out.println(Calc.divide(10, 2));    // This is Division
        
    }
}

class Calculator {
    //Creating a calculator to add we can use add as a Method
    public int add(int a, int b) {
        return a + b;
    }
    // To subtract Numbers
    public int subtract(int a, int b) {
        return a - b;
    }
    // To multiply Numbers
    public int multiply(int a, int b) {
        return a * b;
    }
    // To divide Numbers
    public int divide(int a, int b) {
        return a / b;
    }
}
