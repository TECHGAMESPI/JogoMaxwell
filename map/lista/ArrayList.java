package map.lista;

public class ArrayList<T> {
    // atributos

    private Node<T> head;
    private Node<T> tail;
    private int size;

    // getters

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    // Methods

    public void add (T data) {
        Node<T> node = new Node<T>(data);
        this.size++;

        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
            return;
        }

        this.tail.setNext(node);
        this.tail.getNext().setPrevious(this.getTail());
        this.tail = node;
    }

    public T get (int position) {
        Node<T> assistant = this.head;

        for (int x = 1; x < position; x++) {
            assistant = assistant.getNext();
        }

        return assistant.getData();
    }

}
