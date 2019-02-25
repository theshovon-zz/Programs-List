public interface ArrayList<E> {
	int size();

	/* return the # of objects in this list */
	boolean isEmpty();

	/* return true if the list is empty */
	E get(int k) throws IndexOutOfBoundsException;

	/* return the element at rank k without removing it */
	/* error if k<0 or k≥size()=n – current # of elements */
	E set(int k, E e) throws IndexOutOfBoundsException;

	/* replace with e elem. at rank k; return replaced element */
	/* error if k<0 or k≥size()=n – current # of elements */
	void add(int k, E e) throws IndexOutOfBoundsException;

	/* insert a new element e into list at rank k */
	/* error if k<0 or k>size()=n – current # of elements */
	/* rank of all subsequent elements will increase! */
	E remove(int k) throws IndexOutOfBoundsException;
	/* remove and return the element at rank k */
	/* error if k<0 or k≥size()=n – current # of elements */
	/* rank of all subsequent elements will decrease! */
}