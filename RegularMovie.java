package Classes;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class RegularMovie implements Movie {
    private String _title;
    private int _points;

    public RegularMovie(String title) {
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

    @Override
    public double calculateAmount(double days) {
        double thisAmount = 2;
                if (days > 2)
                    thisAmount += (days - 2) * 1.5;
        return thisAmount;
    }
}
