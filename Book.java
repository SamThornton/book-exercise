/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author  Sam Thornton
 * @version 2017.09.19
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = true;
        
    }

    // Add the methods here ...
        //2.83 
    public String getAuthor()
    {
        return author;
    }
        //2.83
    public String getTitle()
    {
        return title;
    }
        //2.85
    public int getPages()
    {
        return pages;
    }
        //2.88
    public String getRefNumber()
    {
        return refNumber;
    }
        //2.91
    public int getBorrowed()
    {
        return borrowed;
    }
        //2.84
    public void printAuthor()
    {
        System.out.println(author);
    }
        //2.84
    public void printTitle()
    {
        System.out.println(title);
    }
        //2.88, updated in 2.90
    public void setRefNumber(String ref)
    {
        if (refNumber.length() > 0)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Reference Number must be at least three characters in length.");
            refNumber = "";
        }
    }
        //2.91
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
        //2.92
    public boolean isCourseText()
    {
        return courseText;
    }
        //2.87, updated in 2.89, and again in 2.91
    public void printDetails()
    {
        if (refNumber.length() > 0)
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference: " + refNumber 
            + ", Book has been borrowed " + borrowed + " times.");
        }
        else
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference: " + "ZZZ" 
            + ", Book has been borrowed " + borrowed + " times."); 
        }
    }
}