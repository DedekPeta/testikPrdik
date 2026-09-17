package StudentResultsUkol;

import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.add;

public class StudentResult {


    private String studentName;
    private ArrayList<Integer> znamky =  new ArrayList<>();

    public StudentResult(String studentName) {
        this.studentName = studentName;
    }

    public StudentResult(ArrayList<Integer> znamky) {
        this.znamky = znamky;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Integer> getZnamky() {
        return znamky;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setZnamky(ArrayList<Integer> znamky) {
        this.znamky = znamky;
    }

    public void addScore(int score) {
        znamky.add(score);
    }



}
