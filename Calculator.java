public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator(0, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        calc.Add(3, 5);
        calc.Division(10, 2);
        calc.Multiply(4, 8);
        calc.Substract(25, 48);
        calc.Square(9);
        calc.Factoriel(6);
        calc.Cos(37);
        calc.Sin(53);
        calc.Tangent(53);
        calc.SquareRoot(81);

    }

    private int sum, substract, multiply, square, factoriel;
    private double division, squareRoot, cos, sin, tangent;

    Calculator(int sum, int substract, int multiply, double division, int square, int factoriel, double squareRoot,
            double cos, double sin, double tangent) {
        this.sum = sum;
        this.substract = substract;
        this.multiply = multiply;
        this.division = division;
        this.square = square;
        this.cos = cos;
        this.factoriel = 1;
        this.sin = sin;
        this.squareRoot = squareRoot;
        this.tangent = tangent;
    }

    public void Add(int num1, int num2) {
        sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public void Substract(int num1, int num2) {
        if (num1 > num2) {
            substract = num1 - num2;
        } else {
            substract = num2 - num1;
        }
        System.out.println("Substract: " + substract);
    }

    public void Multiply(int num1, int num2) {
        multiply = num1 * num2;
        System.out.println("Multiply: " + multiply);
    }

    public void Division(int num1, int num2) {
        division = num1 / num2;
        System.out.println("Division: " + division);
    }

    public void Square(int num1) {
        square = num1 * num1;
        System.out.println("Square: " + square);
    }

    public void SquareRoot(int num1) {
        squareRoot = Math.sqrt(num1);
        System.out.println("Square Root: " + squareRoot);
    }

    public void Cos(int num1) {
        cos = Math.cos(num1);
        System.out.println("Cos: " + cos);
    }

    public void Sin(int num1) {
        sin = Math.sin(num1);
        System.out.println("Sin: " + sin);
    }

    public void Tangent(int num1) {
        tangent = Math.tan(num1);
        System.out.println("Tangent: " + tangent);
    }

    public void Factoriel(int num1) {
        for (int i = 1; i <= num1; i++) {
            factoriel = factoriel * i;
        }
        System.out.println("Factoriel: " + factoriel);
    }
}