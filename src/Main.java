import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //1) create an inventory of type ArrayList of vehicles
        ArrayList<String> inventory = new ArrayList<>();


        //2) create an input file of Vehicles,Cars andTrucks in comma separated values (CSV) format


        FileOutputStream fos = null;
        File csvFile = new File("src/inventory.csv");
        try {
            csvFile.createNewFile();
            PrintWriter writer = new PrintWriter(csvFile);
            writer.println("Car, bmt147, lkjlkjlklj12231231lkjl, 15173.17, 2005, pinto, true, 4");
            writer.println("Truck, abc698, iuyj08-9j, 35165.88, 2019, 4");
            writer.close();
        }
        catch (IOException e) {
            System.exit(1);
        }

        //3) put vehicles in the inventory (read from a file and add), the followin lines are examples
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("inventory.csv");
        } catch (FileNotFoundException e){
            System.exit(1);
        }
        Scanner reader = new Scanner(fis);
        reader.useDelimiter(",");
        while (reader.hasNextLine()) {
            String currentLine = reader.nextLine();
            inventory.add(currentLine);
        }
        reader.close();

        //testing inventory
        int size = inventory.size();
        for (int i = 0; i < size; i++) {
            System.out.println(inventory.get(i));
        }
//        inventory.add(new Car("bmt147", "lkjlkjlklj12231231lkjl", 15173.17, 2005,
//                "pinto", true, 4));
//        inventory.add(new Vehicle("xrc761","oojojjpjp09809",3500.00, 2015));
//        inventory.add(new Truck("abc698", "iuyj08-9j", 35165.88, 2019, 4));


        //4) for each vehicle in the inventory print the tag and the tax



    }
}
