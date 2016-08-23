import Classes.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
//        Creator aCreator;
//        aCreator = new ConcreteCreator();
//        Product producto = aCreator.factoryMethod();
//        producto.operacion();
        customer.addRental(new Rental(new ReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
       // customer.addRental(new Rental(new ChildrenMovie("Terminator"), 2));
        System.out.println(customer.printVoucher());
    }
}
