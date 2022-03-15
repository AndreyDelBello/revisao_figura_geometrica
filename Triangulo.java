public class Triangulo implements FiguraGeometrica{
    
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getLadoC() {
        return ladoC;
    }
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (ladoA*ladoB);
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Triangulo";
    }
    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return ladoA+ladoB+ladoC;
    }

    
}
