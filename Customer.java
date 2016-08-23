package Classes;


public class Customer {
    private String _name;
    private TotalRental _rentals;

    public Customer(String name) {
        _name = name;
        _rentals = new TotalRental();
    }

    public void addRental(Rental rental) {
        _rentals.addRental(rental);
    }

    public String getName() {
        return _name;
    }

    public String printVoucher() {
        String result = "Classes.Rental Record for " + getName() + "\n";
        result+=_rentals.printTotal();
        return result;
    }

}
