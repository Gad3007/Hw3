import java.util.*;

// Напишите методы добавления, удаления и получения элементов из списка в классе MyLinkedList.
public class MyLinkedList implements Iterable<String> {

    private LinkedList<String> items = new LinkedList<>();

    public void addLinked(String item){
        this.items.add(item);

    }
    public void delLinked(String item){
        this.items.remove(item);

    }
    public String showListElement(int index){
        return items.get(index);

    }
    private class TestList implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public String next() {
            return items.get(index++);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return this.items.iterator();
    }
}







