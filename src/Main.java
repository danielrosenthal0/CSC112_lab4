import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //1) create an inventory of type ArrayList of vehicles
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();


        //2) create an input file of Vehicles,Cars andTrucks in comma separated values (CSV) format
//        fileoutputstram
//                fileprinter printwriter
//                        "vehicle", tag,

        FileOutputStream fos = null;
        File csvFile = new File("src/inventory.csv");
        try {
            csvFile.createNewFile();
            PrintWriter writer = new PrintWriter(csvFile);
            writer.println("Car");
            writer.close();
        }
        catch (IOException e) {
            System.exit(1);
        }

//            try {
//                fos = new FileOutputStream("inventory.csv");
//            }
//            catch (FileNotFoundException e) {
//                System.out.println("File is not found.");
//                System.exit(1);
//            }

//        FileInputStream inventory = new FileInputStream("inventory.csv");
//        Scanner inventory = new Scanner(inventory);


        //3) put vehicles in the inventory (read from a file and add), the followin lines are examples

//        inventory.add(new Car("bmt147", "lkjlkjlklj12231231lkjl", 15173.17, 2005,
//                "pinto", true, 4));
//        inventory.add(new Vehicle("xrc761","oojojjpjp09809",3500.00, 2015));
//        inventory.add(new Truck("abc698", "iuyj08-9j", 35165.88, 2019, 4));


        //4) for each vehicle in the inventory print the tag and the tax



    }
}
