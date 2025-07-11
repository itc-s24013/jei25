public class D51Ensyu {
    public static void main(String[] args) {
        D51Student student = new D51Student(args[0], args[1]);
        System.out.println("学生番号:" + student.getId());
        System.out.println("氏名:" + student.getName());
    }
}
