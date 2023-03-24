package Labs.Lab10.A10;

public abstract class LightBulb {
       // TODO: Add any needed instance variables, constructors, and methods
   private double lumens;
   public LightBulb(double lumens){
    this.lumens = lumens;
   }
   public String getShape(){
    return "";
   }
   /**
      Gets a description of this light bulb.
      @return a string of the form lumensPerWatt=...,shape=... (without any spaces)
   */
  
   public String toString()
   {
      // TODO: Complete this method
      return "lumensPerWatt="+lumens+",shape="+getShape();
   }
}
