class MethodOverloading {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();     //At this point we are calling the object to use the methods


       System.out.println(Calc.add(5, 6, 10)); // This is Where we are Overloading the Method


       System.out.println(Calc.add(5, 89));  // This is the second Method


       System.out.println(Calc.add(5.5, 6.5));  // This is the third Method
    }
}

class Calculator {
    public int add(int a,int b,int c) {         // Here our first method 
        return a + b + c;
    }
    public int add(int a , int b)              // Here is our second Method
    {
        return a+b;
    }
    public double add(double a, double b ){     // Here is Third Method 
        return a+b;
    }
}