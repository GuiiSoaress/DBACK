package exemploSobrecarga;

public class Calcular {
    //attributes
    private Double linear;
    private Double area;
    private Double volume;

    //constructor
    public Calcular(){};
    

    //getters and setters
    public Double getLinear() {
        return linear;
    }
    public void setLinear(Double linear) {
        this.linear = linear;
    }
    public Double getArea() {
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }
    public Double getVolume() {
        return volume;
    }
    public void setVolume(Double volume) {
        this.volume = volume;
    }   

    //methods
    public void calcular(Double comprimento){
        setLinear(comprimento);
        System.out.println("Comprimento: " + comprimento);
    }
    
    public void calcular(Double comprimento, Double largura){
        this.linear = comprimento;
        this.area = this.linear * largura;
        System.out.println("Área: " + this.area);

    };

    public void calcular(Double comprimento, Double largura, Double altura){
        this.linear = comprimento;
        this.area = this.linear * largura;
        setVolume(this.area * altura);
        System.out.println("Volume: " + this.volume);
    }
    

    
}
