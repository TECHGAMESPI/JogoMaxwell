package map.lista;

public class Node<T> {

    // atributos

    private T data;
    private Node<T> next;
    private Node<T> previous;

    // constructor

    public Node (T data) {
        this.data = data;
    }

    // getters

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    // setters

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

}
