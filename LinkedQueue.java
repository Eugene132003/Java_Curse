import java.util.NoSuchElementException;

/*
1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
public class LinkedQueue<E> {
    private Lesson_04HW_02<E> head;
    private Lesson_04HW_02<E> tail;
    int size;

    public void enqueue(E item) {
        Lesson_04HW_02<E> oldTail = this.tail;
        Lesson_04HW_02<E> newTailnode = new Lesson_04HW_02<E>(item);
        if (oldTail != null) {
            oldTail.setNextNode(newTailnode);
            newTailnode.setNextNode(null);
            this.tail = newTailnode;

        } else {
            this.tail = newTailnode;
            this.head = newTailnode;
        }
        size++;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int length() {
        return size;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        E data = this.head.getData();
        this.head = this.head.getNextNode();
        size--;
        return data;
    }

    public E peek() {
        return this.head.getData();
    }

    public static void main(String[] args) {
        LinkedQueue<Double> queuelist = new LinkedQueue<Double>();
        queuelist.enqueue(60.0);
        queuelist.enqueue(12.0);
        queuelist.enqueue(16.4);
        queuelist.enqueue(26.5);

        queuelist.dequeue();
        System.out.println("queuelist.peek:" + queuelist.peek());

        queuelist.dequeue();
        System.out.println("queuelist.length:" + queuelist.length());
        System.out.println("queuelist.peek:" + queuelist.peek());
    }
}
