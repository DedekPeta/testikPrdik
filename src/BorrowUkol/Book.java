package BorrowUkol;

public class Book extends SchoolItem implements IBorrowable{
    private String author;
    private boolean borrowed;

    public Book(String code, String name, String author, boolean borrowed) {
        super(code, name);
        this.author = author;
        this.borrowed = borrowed;
    }


    @Override
    public String getDescription() {
        System.out.println(author);
        return super.getDescription();
    }

    public Book(String code, String name) {
        super(code, name);
    }

    @Override
    public boolean borrow() {
        if (borrowed) {
            borrowed = true;
            return false;
        }else
            return true;
    }

    @Override
    public void returnItem() {
        if (isBorrowed())  {
            borrowed = false;
        }

    }

    @Override
    public boolean isBorrowed() {
        return false;
    }

    @Override
    public int getMaxLoanDays() {
        return 30;
    }
}
