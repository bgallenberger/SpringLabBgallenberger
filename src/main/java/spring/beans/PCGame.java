package spring.beans;

import spring.iface.*;


public class PCGame implements IGame{

    private String name;
    private Double price;
    private String genre;
    private String description;

    private IConsole console;

    public PCGame() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setConsole(IConsole console) {
        this.console = console;
    }

    @Override
    public String getReview() {
        return "Gaming is great!";
    }

    @Override
    public String getConsole() {
        return console.getConsole();
    }
}
