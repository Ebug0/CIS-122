package Labs.Lab8.B8;

public class FoodItem{
    private String name;
    private double fat;
    private double carbs;
    private double protein;
    
    // TODO: Define default constructor
        public FoodItem (String name1, double fat1, double carbs1, double protein1){
         this.name = name1;
         this.fat = fat1;
         this.carbs = carbs1;
         this.protein = protein1;
     }
    // TODO: Define second constructor with parameters to initialize private fields (name, fat, carbs, protein)
        public FoodItem(){
         name = "Water";
         fat = 0.0;
         carbs = 0.0;
         protein = 0.0;
     }
    public String getName() {
       return name;
    }
    
    public double getFat() {
       return fat;
    }
    
    public double getCarbs() {
       return carbs;
    }
    
    public double getProtein() {
       return protein;
    }
    
    public double getCalories(double numServings) {
       // Calorie formula
       double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
       return calories;
    }
    
    public void printInfo() {
       System.out.println("Nutritional information per serving of " + name + ":");
       System.out.printf("  Fat: %.2f g\n", fat);
       System.out.printf("  Carbohydrates: %.2f g\n", carbs);
       System.out.printf("  Protein: %.2f g\n", protein);
    }
}