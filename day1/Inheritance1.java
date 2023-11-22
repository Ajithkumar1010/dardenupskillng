package day1;

class FirstYear {
    int rollno;
    String FirstYearGrade;

    public void details() {
        System.out.println("rollno:" +rollno);
        System.out.println("FirstYear grade:" +FirstYearGrade);
    }
}
class SecondYear extends FirstYear  {
    String SecondYearGrade;

    public void display() {
        System.out.println("SecondYear grade:" +SecondYearGrade);
    }
    }

public class Inheritance1 {
    public static void main(String[] args) {


        SecondYear ob = new SecondYear();

        ob.rollno = 07;
        ob.FirstYearGrade="A";
        ob.SecondYearGrade="A";
        ob.details();
        ob.display();

    }
}

