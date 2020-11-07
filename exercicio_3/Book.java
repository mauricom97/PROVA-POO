public class Book
{
    private String name;
    private Author[] authors;
    private double price;
    private int quantity = 0;

    public Book(String name, Author[] authors, Double price, int quantity)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAuthor()
    {
        String authorInfo = "";
        for(Author author : this.authors)
        {
            authorInfo += author;
        }
        return authorInfo;
    }
   
    public Double getPrice()
    {
        return this.price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public int setquantity()
    {
        return this.quantity;
    }

    public String getAuthorsData()
    {
        String authorInfo = "";
        for(Author author : this.authors)
        {
            authorInfo += author;
        }
        return authorInfo;
    }

    public String toString()
    {
        String authorInfo = "";
        for(Author author : this.authors)
        {
            authorInfo += author;
        }

        return this.name + ", " + this.price + ", " + this.quantity + ", " + authorInfo;
    }
}
