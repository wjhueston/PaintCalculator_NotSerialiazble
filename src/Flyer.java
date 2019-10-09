public class Flyer implements Paintable{
    public Flyer(){
        System.out.println("Paint");
        System.out.println(getPremiumCost());
        System.out.println(getStandardCost());
    }

    public double getPremiumCost() {
        return PREMIUM_PAINT_COST_PER_GALLON;
    }

    public double getStandardCost() {
        return STANDARD_PAINT_COST_PER_GALLON;
    }
    public String toString(){
        return "Buy some Pint\n"+getPremiumCost()+"\n"+getStandardCost();
    }
}
