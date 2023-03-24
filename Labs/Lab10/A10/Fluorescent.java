package Labs.Lab10.A10;

public class Fluorescent extends LightBulb {
    private String shape;
    
    public Fluorescent(double lumens, String shape)
    {
       super(lumens);
       this.shape = shape;
    }
    
    public String getShape()
    {
       return this.shape;
    }
}
