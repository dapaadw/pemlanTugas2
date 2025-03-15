package Semester_2.Praktikum.Student;

public class MainStudent {
    public static void main(String[] args) {
        // membuat student array untuk jumlah siswa (no. 4)
        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].setName("Anna");
        students[0].setAddress("Malang");
        students[0].setAge(20);
        students[0].setMath(100);
        students[0].setScience(89);
        students[0].setEnglish(80);
        students[0].displayMessage();

        // menggunakan constructor lain
        System.out.println("=====================================");
        students[1] = new Student("Chris", "Kediri", 21);
        students[1].setMath(70);
        students[1].setScience(60);
        students[1].setEnglish(90);
        students[1].displayMessage();

        // siswa dengan nama Anna (student[0]) dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("=====================================");
        students[0] = new Student("Anna", "Batu", 18);
        // perlu ditambahkan nilai matematika, science, dan english melalui method (no. 1)
        students[0].setMath(100);
        students[0].setScience(89);
        students[0].setEnglish(80);
        students[0].displayMessage();

        // siswa dengan nama Chris (Student[1]) dirubah informasi alamat dan umurnya melalui method
        System.out.println("=====================================");
        students[1].setAddress("Surabaya");
        students[1].setAge(22);
        students[1].displayMessage();

        // menggunakan constructor dengan nilai (no. 2)
        System.out.println("=====================================");
        students[2] = new Student("Bintang", "Jakarta", 19, 80, 80, 70);
        students[2].displayMessage();
        
        System.out.println("=====================================");
        // menampilkan jumlah objek student (no. 5)
        students[0].jumlahObjek();
    }
}
