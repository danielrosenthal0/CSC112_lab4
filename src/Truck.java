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
        tax = ((0.055 * Vpurchaseprice) * (2021 - Vpurchaseyear)) + 50.75;
        if (Tweight > 4000) {
            tax = tax + (Tweight/2000)*100;
        }
        return tax;
    }
   //3) override toString
   @Override
   public String toString() {

       return("The vehicle's tag is " + Vtag + ", its vin is " + Vvin + " and the tax on the vehicle is " + tax + "based on " +
               "the fact that the vehicle was bought in " + Vpurchaseyear);
   }

}
