package BorrowUkol;

public class SchoolItem {
    private String code;
    private String name;

    public SchoolItem(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return code + " " + name;
    }

}
