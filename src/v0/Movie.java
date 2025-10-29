package v0;

public class Movie {

    public enum Code {REGULAR, CHILDRENS, NEW_RELEASE};

    private String _title;
    private v3.Movie.Code _priceCode;

    public Movie(String title, v3.Movie.Code priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public v3.Movie.Code getPriceCode() {
        return _priceCode;
    }
}
