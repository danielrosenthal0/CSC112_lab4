public class Truck extends Vehicle {

    private double Tweight;

    //1) create a parameterized constructor
    //1.1) call Vehicle constructor
    public Truck(String tag, String vin, double pprice, int pyear,
                 double Tweight) {
        super(tag, vin, pprice, pyear);
        this.Tweight = Tweight;
    }
    //2) override getType and getTax to compute tax for Truck as described in the project description
    public double getTax() {
        double tax = 0.0;
        tax = Math.round(((0.055 * Vpurchaseprice) * (2021 - Vpurchaseyear)) + 50.75);
        if (Tweight > 2) {
            tax = Math.round(tax + (Tweight)*100);

        }
        return tax;
    }
   //3) override toString
   @Override
   public String toString() {

       return("The truck's tag is " + Vtag + ", its vin is " + Vvin + " and the tax on the truck is $"
               + getTax() + " based on the fact that the vehicle was bought in " + Vpurchaseyear + " and is " +
               Tweight + " tons.");
   }

}
