package Classes;

/**
 * Created by AngelaValdez on 8/23/2016.
 */
public class ReleaseMovie implements Movie {
    private String _title;
    private int _points;

    public ReleaseMovie(String title) {
        _title = title;
        _points = 1;
    }

    @Override
    public int getPoints() {
        return _points;
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public double calculateAmount(double days) {
        return days * 3;
    }
}
