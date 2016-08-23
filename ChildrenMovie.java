package Classes;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class ChildrenMovie implements Movie{
    private String _title;
    private int _points;
    public ChildrenMovie(String title) {
        _title = title;
        _points = 1;
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public int getPoints() {
        return _points;
    }

    public double calculateAmount(double days){
        double thisAmount = 1.5;
        if (days > 3)
            thisAmount += (days - 3) * 1.5;
        return thisAmount;
    }

}
