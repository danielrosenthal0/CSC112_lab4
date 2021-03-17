import java.sql.SQLOutput;
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
            writer.println("Car,bmt147,lkjlkjlklj12231231lkjl,15173.17,2005,pinto,true,4");
            writer.println("Vehicle,xrc761,oojojjpjp09809,3500.00,2019");
            writer.println("Vehicle,xrc761,oojojjpjp09809,3500.00,2015");
            writer.println("Vehicle,xrc761,oojojjpjp09809,3500.00,2008");
            writer.println("Truck,abc698,iuyj08-9j,35165.88,2019,4");
            //System.out.println("1");
            writer.close();
        } catch (IOException e) {
            System.exit(1);

        }

        //3) put vehicles in the inventory (read from a file and add), the followin lines are examples
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/inventory.csv");
            //System.out.println("2");
        } catch (FileNotFoundException e) {
            System.exit(1);

        }
        Scanner reader = new Scanner(fis);

        while (reader.hasNextLine()) {
            lines = reader.nextLine().split(",");
            //System.out.println("3.1");
//            for(String s : lines){
//                System.out.println(s);
//            }
            //System.out.println(lines);
            if (lines[0].equals("Vehicle") ) {
                inventory.add(new Vehicle(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4])));
                //System.out.println("3");
            } else if (lines[0].equals("Car")) {
                inventory.add(new Car(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4]), lines[5], Boolean.parseBoolean(lines[6]),
                        Integer.parseInt(lines[7])));
                //System.out.println("5");
            } else if (lines[0].equals("Truck")) {
                inventory.add(new Truck(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4]), Integer.parseInt(lines[5])));

            } else {
                //System.out.println("4");
            }
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

