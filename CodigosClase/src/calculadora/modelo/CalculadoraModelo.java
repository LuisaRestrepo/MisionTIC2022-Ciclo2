package calculadora.modelo;

public class CalculadoraModelo {

    private double numeroUno;
    private double numeroDos;
    private double resultado;

    public CalculadoraModelo() {
    }

    public CalculadoraModelo(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void multiplicar() {
        this.resultado = this.numeroUno * this.numeroDos;
    }
}
