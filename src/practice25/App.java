package practice25;

public class App {

    public static void main(String args[]){

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "4", "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(90,98,70, 76,72,25);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "4", "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(90,98,70, 76,72,25);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "4", "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(90,98,70, 76,72,25);
        s3.isPass();

    }

}

class Student {
    private Course history;
    private Course physics;
    private Course chemistry;
    private String name;
    private String studentNo;
    private String subjects;
    private double average;
    private boolean isPass;

    public Student(final String name, final String studentNo, final String subjects, final Course history, final Course physics, final Course chemistry){
        this.name = name;
        this.studentNo = studentNo;
        this.subjects = subjects;
        this.history = history;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = 0.0;
        boolean isPass = false;
    }

    public void addBulkExamNote(int tarihen, int fiziken, int kimyaen, double tarihpn, double fizikpn, double kimyapn){
        this.history.average(tarihpn, tarihen);
        this.physics.average(fizikpn, fiziken);
        this.chemistry.average(kimyapn, kimyaen);
    }

    void print_note(){
        System.out.println("___________________________");
        System.out.println("Öğrenci Adı:  " + name);
        System.out.println("Öğrenci No:  " + studentNo);
        System.out.println("Ders: " + history.getName() + " \tNot: " + history.getCode());
        System.out.println("Ders: " + physics.getName() + " \tNot: " + physics.getCode());
        System.out.println("Ders: " + chemistry.getName() + " \tNot: " + chemistry.getCode());
        System.out.println("Ortalamaniz: " + average);
    }

    public void isPass(){
        isPass = isCheckPass();
        print_note();
        average = (history.getNote() + physics.getNote() + chemistry.getNote()) / 3.0;

        if (isPass){
            System.out.println(name + " Sınıfı Geçtin!");
        }else{
            System.out.println(name + "Sınıfta Kaldın!");
        }

    }

    void calcAverage(){
        average = (history.getNote() + physics.getNote() + chemistry.getNote()) / 3.0;
    }

    boolean isCheckPass(){
        calcAverage();
        return average > 55;
    }
}

class Teacher {

    private String name;
    private String mpno;
    private String branch;

    public Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print(){
        System.out.println("Ad:  " + name);
        System.out.println("Telefon:  "+ mpno);
        System.out.println("Bülüm:  " + branch);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMobileNo(String mobileNo) {
        this.mpno = mobileNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

class Course {
    private Teacher teacher;
    private String name;
    private String code;
    private String prefix;
    private double note;
    private double examNote;
    private double presentationNote;

    public Course(final String name, final String code, final String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
    }


    public void average(final double presentationNote, final double examNote){

        if (presentationNote >= 0 && presentationNote <= 100 && examNote >= 0 && examNote <= 100){
            note = presentationNote * 0.20 + examNote * 0.60;
        }

    }

    public void addTeacher(final Teacher teacher){
        if (teacher.getBranch().equals(this.prefix)){
            this.teacher = teacher;
            System.out.println(teacher.getName() + " Adlı Öğretmen " + getClass() + " Dersine Eklendi! ");
        }else{
            System.out.println(name + " Dersi ile Öğretmen uyuşmuyor!");
        }
    }

    public void printTeacher(){
        if (teacher != null) {
            teacher.print();
        } else {
            System.out.println("İşlem Gerçekleşmedi!");
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getExamNote() {
        return examNote;
    }

    public void setExamNote(double examNote) {
        this.examNote = examNote;
    }

    public double getPresentationNote() {
        return presentationNote;
    }

    public void setPresentationNote(double presentationNote) {
        this.presentationNote = presentationNote;
    }
}
