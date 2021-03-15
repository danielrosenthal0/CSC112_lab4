import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //1) create an inventory of type ArrayList of vehicles
        ArrayList<Vehicle> inventory = new ArrayList<>();
        String[] lines;


        //2) create an input file of Vehicles,Cars andTrucks in comma separated values (CSV) format


        FileOutputStream fos = null;
        File csvFile = new File("src/inventory.csv");
        try {
            csvFile.createNewFile();
            PrintWriter writer = new PrintWriter(csvFile);
            writer.println("Car, bmt147, lkjlkjlklj12231231lkjl, 15173.17, 2005, pinto, true, 4");
            writer.println("Vehicle, xrc761, oojojjpjp09809, 3500.00, 2015");
            writer.println("Truck, abc698, iuyj08-9j, 35165.88, 2019, 4");
            writer.close();
        } catch (IOException e) {
            System.exit(1);
        }

        //3) put vehicles in the inventory (read from a file and add), the followin lines are examples
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("inventory.csv");
        } catch (FileNotFoundException e) {
            System.exit(1);
        }
        Scanner reader = new Scanner(fis);

        while (reader.hasNextLine()) {
            lines = reader.nextLine().split(",");
            if (lines[0] == "Vehicle") {
                inventory.add(new Vehicle(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4])));
            } else if (lines[0] == "Car") {
                inventory.add(new Car(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4]), lines[5], Boolean.parseBoolean(lines[6]),
                        Integer.parseInt(lines[7])));
            } else if (lines[0] == "Truck") {


            }
            reader.close();

//            //testing inventory
//            int size = inventory.size();
//            for (int i = 0; i < size; i++) {
//                System.out.println(inventory.get(i));
//            }
//        inventory.add(new Car("bmt147", "lkjlkjlklj12231231lkjl", 15173.17, 2005,
//                "pinto", true, 4));
//        inventory.add(new Vehicle("xrc761","oojojjpjp09809",3500.00, 2015));
//        inventory.add(new Truck("abc698", "iuyj08-9j", 35165.88, 2019, 4));


            //4) for each vehicle in the inventory print the tag and the tax

            int size = inventory.size();
            for (int i = 0; i < size; i++) {
                System.out.println(inventory.get(i));
            }


        }
    }
}
