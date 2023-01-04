package sapsan0401.family_example;

public class Mother {
    private String firstName;
    private String surname;
    private int age;
    private int monthlyExpenses;

    public Mother() {
    }

    public Mother(String firstName, String surname, int age, int monthlyExpenses) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.monthlyExpenses = monthlyExpenses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(int monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    @Override
    public String toString() {
        return "Mother{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", monthlyExpenses=" + monthlyExpenses +
                '}';
    }
}
