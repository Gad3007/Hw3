import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.addLinked("A");
        list1.addLinked("B");
        list1.addLinked("C");
        list1.addLinked("22");
        list1.addLinked("21");
        list1.addLinked("23");

        for (String item : list1){
            System.out.println(item);
        }
        list1.delLinked("C");
        for (String item : list1){
            System.out.println(item);
        }
        System.out.println("ЭЛЕМЕНТ ПО ИНДЕКСУ " + list1.showListElement(3));
        System.out.println(".................................................");



        Employee worker1 = new Employee("Artem", 22,2000);
        Employee worker2 = new Employee("Viktor", 16,10000);
        Employee worker3 = new Employee("Ruslan", 18,7000);

        if(worker1.compareTo(worker2) > 0) System.out.format("Возраст %s > Возраста %s", worker1.getName(),worker2.getName());
        else if (worker1.compareTo(worker2) < 0 ) System.out.format("Возраст %s < Возраста %s", worker1.getName(),worker2.getName());
        else System.out.format("Возраст %s = Возраста %s", worker1.getName(),worker2.getName());
        System.out.println();
        System.out.println("..............................................");

        ArrayList<Employee> List2 = new ArrayList<>();
        List2.add(worker1);
        List2.add(worker2);
        List2.add(worker3);

        Collections.sort(List2, new EmployeeSalaryComparator());

        for(Employee ZP : List2){
            System.out.println(ZP);
        }




    }
}