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
    public String getType() {
        return "Truck";
    }

    //overrides vehicle get tax, checks weight and adds road fee
    public double getTax() {
        tax = super.getTax();

        if (Tweight > 2) {
            tax = Math.round(tax + (Tweight) * 100);

        }
        tax = tax + 50.75;
        return tax;
    }


   //3) override toString

    //another print statement that isn't used
   @Override
   public String toString() {

       return("The truck's tag is " + Vtag + ", its vin is " + Vvin + " and the tax on the truck is $"
               + getTax() + " because the vehicle was bought in " + Vpurchaseyear + " for $" + Vpurchaseprice
       + " and is " + Tweight + " tons.");
   }

}
