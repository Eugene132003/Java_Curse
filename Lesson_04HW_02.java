import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Lesson_04HW_02<E> {
    private E data;
    private Lesson_04HW_02<E> nextNode;
    private Lesson_04HW_02<E> previousNode;

    public Lesson_04HW_02(E data) {
        this.data = data;
    }
    public E getData() {
        return data;
    }
    public Lesson_04HW_02<E> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Lesson_04HW_02<E> nextNode) {
        this.nextNode = nextNode;
    }

    public Lesson_04HW_02<E> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Lesson_04HW_02<E> prevNode) {
        this.previousNode = prevNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}