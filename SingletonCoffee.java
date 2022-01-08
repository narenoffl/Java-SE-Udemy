class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my = null;

    private CoffeeMachine(){
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }

    public void fillSugar(float qty){
        sugarQty = qty;
    }

    public float getCoffee(){
        return 0.15f;
    }

    static CoffeeMachine getInstance(){
        if(my==null) {
            my = new CoffeeMachine();

        }
        return my;

    }

}

public class SingletonCoffee {
    public static void main(String[] args) {
        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        CoffeeMachine cm2 = CoffeeMachine.getInstance();
        CoffeeMachine cm3 = CoffeeMachine.getInstance();

        System.out.println(cm1+" "+cm2+" "+cm3);

        if(cm1==cm2 && cm1==cm3)
            System.out.println("Same");
    }
}
