package mx.edu.utez.EstructurasDeDatos;

public class Node<E> {
    E data;
    Node<E> next;  //en todas las linked list sera llamada next


    //Constructor
    public Node(E data){
        this.data = data;
        this.next = null; //siempre sera el nuevo nodo en null, estara al final
    }

}
