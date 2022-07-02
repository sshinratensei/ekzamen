package Project2;

public class Person {
    private String surname;

    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        if (name.equals(that.name)) return true;
        if (age == that.age) return true;
        if (surname.equals(that.surname)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = surname == null ? 0 : surname.hashCode();
        result = 31 * result + age;
        return result;
    }
}
