package seminar7.model;

public class ComplexNum {
    private double real;
    private double imag;

    public ComplexNum(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return real + ", " + imag;
    }

    public void soutComplex() {
        if (imag > 0) {
            System.out.println(real + " + " + imag + 'i');
        } else {
            System.out.println(real + String.valueOf(imag) + 'i');
        }
    }
}
