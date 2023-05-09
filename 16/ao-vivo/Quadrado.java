public class Quadrado extends Poligono implements IQuadrado {
    
    // 1) Implemente get/set dos atributos:
    // double largura, double altura...
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // 2) Defina os atribuitos necessários para iniciar a classe:
    // double largura, double altura...
    public Quadrado(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }

    // 3) Sobrescreva o função getArea()
    public double getArea() {
        double area = altura * largura;

        return area;
    }
}
