/**
 * Sequence ADT
 * The Sequence ADT is the union of the Vector(IndexList) and List ADTs
 */

public interface Sequence<E> extends Deque<E>, IndexList<E>, PositionList<E> {

    /** Returns the position at a given rank r. */
    public Position<E> atIndex(int r) throws BoundaryViolationException;

    /** Returns the rank of a given position p. */
    public int indexOf(Position<E> p) throws InvalidPositionException;
}
