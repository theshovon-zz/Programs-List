
public class DLLNode<E> {

	private E e;
	private DLLNode<E> next;
	private DLLNode<E> prev;

	public DLLNode() {
		this.e=null;
		next = null;
		prev = null;
	}
	public DLLNode(E e, DLLNode<E> p, DLLNode<E> n) {
		this.e = e;
		prev = p;
		next = n;
	}

	public E getElement() {
		return e;
	}

	public DLLNode<E> getPrev() {
		return prev;
	}

	public DLLNode<E> getNext() {
		return next;
	}

	public void setPrev(DLLNode<E> p) {
		prev = p;
	}

	public void setNext(DLLNode<E> n) {
		next = n;
	}

}
