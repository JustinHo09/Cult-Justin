/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Esteban Parra
 * @version 0.1
 */
class Book{
    private String author;
    private String title;
    private double price;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    //Q2
    public Book(String bookTitle, String bookAuthor){
        author = bookAuthor;
        title = bookTitle;
        price = 12.99;
        pages = 340;
    }
    
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    
    public void setAuthor(String author){
        author = author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public double getPrice(){
        return price;
    }

    public void printBook(){
        //Q11
        String bookInfo = "The book called " + title + ", has " + pages + " pages... Please give the clerk $" + price + " moneys to read it";
        System.out.println(bookInfo);
    }
    
    public void sold(){
        price = price * 2;
    }
    
    //Q10
    public void gougePrice(double amount)
    {
        if ((amount >= 5.0) && ((amount * price) <= 1426.0))
        {   
            price = price * amount;
        }
    }
    
}
