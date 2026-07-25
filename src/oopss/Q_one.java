package oopss;

class Pasrson {
    String name;
    int weight;
}

class Studente extends Pasrson {
    int rollNum;
    String schoolName;
}

class Student {
    String name;
    int marks;
}

//inheritance
class vehicalee {
    void print() {
        System.out.println("base cls (vehicale)");
    }
}

class car extends vehicalee {
    @Override
    void print() {
        System.out.println(" base cls (car)");
    }
}

public class Q_one {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.name = "aditya";
//        s.marks = 100;
//        System.out.println(s.name + " " + s.marks);
//
//        Studente d =new Studente();
//        d.name= "ADITYA";
//        d.weight=48;
//        d.rollNum=07;
//        d.schoolName="rr";
//        System.out.println(d.name+" "+d.schoolName+" "+d.rollNum+" "+ d.weight);
        //inheritance
        vehicalee obj2 = new car();
        obj2.print();
        vehicalee obj1 = new vehicalee();
        obj1.print();

    }
}
