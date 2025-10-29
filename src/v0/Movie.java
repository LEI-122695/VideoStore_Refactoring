package v0;

public class Movie {

    public enum Code {REGULAR, CHILDRENS, NEW_RELEASE};

    private String _title;
    private v6.Movie.Code _priceCode;

    public Movie(String title, v6.Movie.Code priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public v6.Movie.Code getPriceCode() {
        return _priceCode;
    }
}