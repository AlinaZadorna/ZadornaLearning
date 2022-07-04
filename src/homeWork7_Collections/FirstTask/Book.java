package homeWork7_Collections.FirstTask;

public class Book {

    private double price;
    private String title;
    private String coverType;
    private int quantityOfPages;

    public Book(double price, String title, String coverType, int quantityOfPages) {
        this.price = price;
        this.title = title;
        setCoverType(coverType);
        this.quantityOfPages = quantityOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCoverType(String coverType) {
        if (coverType.equals("hard") || coverType.equals("soft")) {
            this.coverType = coverType;
        } else {
            System.out.println("Cover Type is incorrect. It should be hard or soft");
        }
    }

    public String getCoverType() {
        return coverType;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public String toString(){
        return "This book title is: " +this.title + ", price: " + this.price
                + ", cover type: " + this.coverType + ", quantity of pages; "
                + this.quantityOfPages + ".";
    }

}
