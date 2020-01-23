/*
 * Created by IntelliJ IDEA.
 * User: kanishk
 * Date: 23/01/20
 * Time: 10:52 AM
 */
package definition;

import ADT.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    private static class Node<E> {
        private E data;
        private Node<E> next;
    }

    @Override
    public void add(int index, Object item) {

    }
}
