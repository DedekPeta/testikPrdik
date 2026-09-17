package BorrowUkol;

public class Laptop extends SchoolItem implements IBorrowable{
    private String assetTag = "sestsedm";
    private boolean borrowed;

    public Laptop(String code, String name, String assetTag, boolean borrowed) {
        super(code, name);
        this.assetTag = assetTag;
        this.borrowed = borrowed;
    }


    public void setAssetTag(String assetTag) {

        this.assetTag = assetTag;

    }

    public Laptop(String code, String name) {
        super(code, name);
    }

    @Override
    public boolean borrow() {
        return true;
    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isBorrowed() {
        return false;
    }

    @Override
    public int getMaxLoanDays() {
        return 7;
    }
}
