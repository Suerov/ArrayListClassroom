public class Student{
    private String name;
    private int age;


    public Student(String name, int age) throws Excepitonss {
        this.name= name;
        if (age<=0){
            throw new Excepitonss("WRONG!");
        }else{
        this.age = age;
        }
    }
    public Student(String s) {
        super();
    }

    public Student(int i) {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", age=" + age +super.toString();
    }
}
