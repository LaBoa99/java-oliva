import date.MyDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MyDate MyBirthday = new MyDate(32, -2, 2026);
        System.out.println(MyBirthday.toString());

        MyDate SomeoneBirthday = new MyDate();
        SomeoneBirthday.setAnio(2026);
        SomeoneBirthday.setDia(99999999);
        SomeoneBirthday.setMes(13);

        SomeoneBirthday.setAnio(2002);
        SomeoneBirthday.setDia(10);
        SomeoneBirthday.setMes(4);
        System.out.println(SomeoneBirthday.toString());
    }
}
