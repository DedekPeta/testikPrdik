package BorrowUkol;

public interface IBorrowable {
        boolean borrow();
        void returnItem();
        boolean isBorrowed();
        int getMaxLoanDays();
}
