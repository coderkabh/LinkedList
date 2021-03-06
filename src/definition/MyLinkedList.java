/*
 * Created by IntelliJ IDEA.
 * User: kanishk
 * Date: 23/01/20
 * Time: 10:52 AM
 */
package definition;

import ADT.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    private Node<E> head = null;
    private int size = 0;

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
        }

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    @Override
    public void add(int index, Object item) {

    }
}
