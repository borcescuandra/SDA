package lab5;

public class StudentDetails {

    private String name;
    private String lastName;
    private double mathGrade;
    private double roGrade;

    public StudentDetails(String name, String lastName, double mathGrade, double roGrade) {
        this.name = name;
        this.lastName = lastName;
        this.mathGrade = mathGrade;
        this.roGrade = roGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getRoGrade() {
        return roGrade;
    }

    public void setRoGrade(double roGrade) {
        this.roGrade = roGrade;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Last name: " + lastName + "\n" +
                "Math Grade: " + mathGrade + "\n" + "Ro grade: " + roGrade + "\n";
    }

}
