package Semester_2.Praktikum.Student;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlahInstansi = 0; // untuk menghitung banyak objek yang di instansiasi (no. 5)

    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlahInstansi++; // setiap kali objek di instansiasi, jumlahInstansi akan bertambah. Berlaku untuk semua constructor yang dipanggil
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlahInstansi++;
    }

    // menambahkan constructor dengan parameter math, english, dan science (no. 2)
    public Student(String n, String a, int ag, int m, int e, int s) {
        name = n;
        address = a;
        age = ag;
        mathGrade = m;
        englishGrade = e;
        scienceGrade = s;
        jumlahInstansi++;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("Beralamat di " + address);
        System.out.println("Berumur " + age);
        System.out.println("Mempunyai nilai rata-rata " + getAverage());
        System.out.println("Status Kelulusan: " + (statusAkhir() ? "Lulus" : "Remidi"));
    }

    // menambahkan method statusAkhir (no. 3)
    public boolean statusAkhir() {
        return getAverage() > 60;
    }
    
    // menambahkan method jumlahObjek (no. 5)
    public void jumlahObjek() {
        System.out.println("Jumlah objek: " + jumlahInstansi);
    }
}
