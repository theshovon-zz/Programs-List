
public class Deque<E> {

	private DLLNode<E> header;
	private DLLNode<E> trailer;
	private int size = 0;

	public Deque() {
		header = new DLLNode<>(null, null, null);
		trailer = new DLLNode<>(null, header, null);
		header.setNext(trailer);
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;

	} // is the deque empty

	public int size() {

		return this.size;
	}

	public void addFirst(E item) {

		addBetween(item, header, header.getNext());

	}

	public void addLast(E item) {

		addBetween(item, trailer.getPrev(), trailer);

	}

	private void addBetween(E e, DLLNode<E> previous, DLLNode<E> next) {

		//DLLNode<E> newest = new DLLNode<>(e, previous, next);
		DLLNode<E> newest = new DLLNode<>();
		newest.setNext(next);
		newest.setPrev(previous);
		previous.setNext(newest);
		next.setPrev(newest);
		size++;

	}

	public E removeFirst() {
		if (isEmpty()) {
			return null;
		}
		return remove(header.getNext());
	}

	public E removeLast() {
		if (isEmpty()) {
			return null;
		}
		return remove(trailer.getPrev());
	}

	private E remove(DLLNode<E> node) {
		DLLNode<E> previous = node.getPrev();
		DLLNode<E> next = node.getNext();
		previous.setNext(next);
		next.setPrev(previous);
		size--;
		return node.getElement();
	}

	public E first() {
		return  header.getNext().getElement();
	}

	public E last() {

		return trailer.getPrev().getElement();
	}

	public void printOutContent() {
		if (isEmpty()) {
			System.out.println("null");
		}
		DLLNode<E> counter = header.getNext();
		while (counter.getNext() != null) {

			System.out.println(counter.getElement());

			counter= counter.getNext();
		}
	}

}
