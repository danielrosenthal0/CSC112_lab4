import javax.swing.*;
import java.awt.*;
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

        //fileoutputstream to create new file, add 20 lines
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
            writer.println("Car,xyz333,hfjdsfhjasfd,20000000.55,2020,blue,false,2");

            writer.close();
            //catch in case something goes wrong
        } catch (IOException e) {
            System.exit(1);

        }

        //3) put vehicles in the inventory (read from a file and add), the followin lines are examples

        //fileinoutstream to read from new csv file
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/inventory.csv");
            //System.out.println("2");
        } catch (FileNotFoundException e) {
            System.exit(1);

        }
        Scanner reader = new Scanner(fis);

        //scanner reads each line, splits at commas, checks first index and sorts accordingly
        //parses doubles and integers when needed
        while (reader.hasNextLine()) {
            lines = reader.nextLine().split(",");

            if (lines[0].equals("Vehicle")) {
                inventory.add(new Vehicle(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4])));

            } else if (lines[0].equals("Car")) {
                inventory.add(new Car(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4]), lines[5], Boolean.parseBoolean(lines[6]),
                        Integer.parseInt(lines[7])));

            } else if (lines[0].equals("Truck")) {
                inventory.add(new Truck(lines[1], lines[2], Double.parseDouble(lines[3]),
                        Integer.parseInt(lines[4]), Integer.parseInt(lines[5])));

            }
        }
        reader.close();


        //4) for each vehicle in the inventory print the tag and the tax
//original print statement for overrides that isn't used

//        int size = inventory.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(inventory.get(i));
//        }
        DisplayTaxResult(inventory);




}
// simple method to display output in a TextArea in a JPanel in a JFrame

    public static void DisplayTaxResult(ArrayList<Vehicle> inventory) {

        final String DASH = "-";

        // create the JTextArea and fill it with content
        JTextArea theText = new JTextArea(inventory.size() + 2, 25); //create the text area
        theText.setFont(new Font("monospaced", Font.BOLD, 20));
        theText.setForeground(Color.GREEN);
        theText.setBackground(Color.LIGHT_GRAY);

        // add specific text about inventory to JTextArea
        theText.append(String.format("%-12s%-10s%10s%n", "V. type", "V. tag", "Tax Due"));
        theText.append(String.format("%32s%n%n", DASH.repeat(32)));
        for (Vehicle myV : inventory) {
            theText.append(String.format("%-12s%-10s%,10.2f%n",
                    myV.getType(), myV.getTag(), myV.getTax()));
        }

        // create the JPanel and add the JTextArea to it
        JPanel mainPanel = new JPanel();
        mainPanel.add(theText); //add the text area to the panel

        // set up JFrame with a few members set and
        // add JPanel content to it
        final JFrame theFrame = new JFrame();
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setTitle("Vehicle Taxes Due\n");
        theFrame.setSize(500, 500);
        theFrame.setLocation(550, 400);
        theFrame.getContentPane().add(mainPanel);
        theFrame.pack();
        theFrame.setVisible(true);

    }

}



