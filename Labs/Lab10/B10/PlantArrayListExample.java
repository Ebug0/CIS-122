package Labs.Lab10.B10;
import java.util.*;

public class PlantArrayListExample {
   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   public static void printArrayList(ArrayList<Plant> test){
   int count = 1;
    for(Plant items : test){
        System.out.printf("Plant %s Information: \n",count);
        items.printInfo();
        System.out.println();
        count +=1;
        }
   }
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String input;
    // TODO: Declare an ArrayList called myGarden that can hold object of type plant
    ArrayList<Plant> mygarden = new ArrayList<Plant>();
    // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
    String plantname, flowername, colorofflowers, plantcost, flowercost;
    boolean isannual;
    input = scnr.next();
    while(!input.equals("-1")){
       // TODO: Check if input is a plant or flower
       if(input.equals("plant")){
        plantname = scnr.next();
        plantcost = scnr.next();
        Plant plant = new Plant();
        plant.setPlantCost(plantcost);
        plant.setPlantName(plantname);
        mygarden.add(plant);
       }
       else if (input.equals("flower")){
        flowername = scnr.next();
        flowercost = scnr.next();
        isannual = scnr.nextBoolean();
        colorofflowers = scnr.next();
        Flower flower = new Flower();
        flower.setPlantCost(flowercost);
        flower.setPlantName(flowername);
        flower.setColorOfFlowers(colorofflowers);
        flower.setPlantType(isannual);
        mygarden.add(flower);

       }

       //       Store as a plant object or flower object
       //       Add to the ArrayList myGarden
       input = scnr.next();
    }
    
    // TODO: Call the method printArrayList to print myGarden
    printArrayList(mygarden);
    
    scnr.close();
 }
 
}
