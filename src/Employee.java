public class Employee implements Comparable<Employee> {
    public String Name;
    public int age;
    public int salary;
    public Employee(String Name, int age, int salary){
        this.Name = Name;
        this.age = age;
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return Name;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("\nИмя: %s Возраст: %d З/П: %d", Name, age, salary);
    }
    @Override
    public int compareTo(Employee o) { return Integer.compare(this.age, o.getAge());}

}
