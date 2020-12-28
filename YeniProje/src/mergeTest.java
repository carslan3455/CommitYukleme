public class mergeTest {

    private String name;
    private String surname;
    private int number;

    public mergeTest(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        System.out.println("aaa");
        this.name = name2;
        // incoming changes
        System.out.println("bbb");
        System.out.println(name2);
        System.out.println(surname);
    }

    @Override
    public String toString() {
        return "mergeTest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
