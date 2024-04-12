package assignment3;
import java.util.Scanner;

class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        double sumReal = this.real + other.real;
        double sumImag = this.imag + other.imag;
        return new Complex(sumReal, sumImag);
    }

    public Complex subtract(Complex other) {
        double diffReal = this.real - other.real;
        double diffImag = this.imag - other.imag;
        return new Complex(diffReal, diffImag);
    }

    public Complex multiply(Complex other) {
        double prodReal = this.real * other.real - this.imag * other.imag;
        double prodImag = this.real * other.imag + this.imag * other.real;
        return new Complex(prodReal, prodImag);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of first complex number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter the real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of second complex number: ");
        double imag2 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imag1);
        Complex complex2 = new Complex(real2, imag2);


        Complex sumResult = complex1.add(complex2);
        Complex diffResult = complex1.subtract(complex2);
        Complex prodResult = complex1.multiply(complex2);

        
        System.out.println("Sum: " + sumResult.real + " + " + sumResult.imag + "i");
        System.out.println("Difference: " + diffResult.real + " + " + diffResult.imag + "i");
        System.out.println("Product: " + prodResult.real + " + " + prodResult.imag + "i");

        scanner.close();
    }
}
