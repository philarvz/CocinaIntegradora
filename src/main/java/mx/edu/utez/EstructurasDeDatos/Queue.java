package mx.edu.utez.EstructurasDeDatos;

public class Queue<E>{
    //clase dentro de clase
    private static class Node<E>{
        public E data;
        public Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    //atributos de clase
    private Node<E> front;
    private Node<E> rear; //siempre se vuelve el ultimo
    private int size;

    //metodos de la cola

    //offer  //meter cosas dentro de la estrctura de cola
    public boolean offer(E data){
        Node<E> newNode = new Node<>(data);
        if(rear != null){ //que si hay un ultimo
            rear.next = newNode; //el siguente del ultimo es igual a new nodo
        }
        rear = newNode;
        //cuando se forme alguien y no habia nadie en la fila
        if(front == null){ //la cola estaba vacia
            front = rear;
        }
        size++;
        return true;
    }

    //peek - siempre esta al frente de la fila
    public E peek(){
        return (front != null) ? front.data : null; //si hay algo formado en la cola se regresa el dato y si no regresa un null
    }

    //isEmpty
    public boolean isEmpty(){
        return size == 0;//si el tamano de la cola es 0 o null significa que esta vacia
    }

    //size
    public int size(){
        return size;
    }

    //poll = remove = pop = delete
    public E poll(){
        //checa si la cola esta vacia
        if(isEmpty()){
            return null;
        }
        E data = front.data; //voy a guardar en varible data lo que tenia en el frente
        front = front.next; // frente seconvierte en el que estaba atras de frente, para que ya no sea el frente pues
        if(front == null){ //si frente es nulo
            rear = front;
        }
        size--;
        return data;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Node<E> current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    //hay otros tipos de colas? Sí, pero las importantes son esta y la de prioridad

}