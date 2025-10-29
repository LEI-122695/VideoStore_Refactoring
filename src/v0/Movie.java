package v0;

import v9.Price;

public class Movie {

    private String _title;
    private v9.Price _price;

    public Movie(String title, v9.Price price) {
        _title = title;
        _price = price;
    }

    public String getTitle() {
        return _title;
    }

    public Price getPrice()
    {
        return _price;
    }
}
