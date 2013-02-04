/**
* MyAbstractList is an example of an abstract
*/
public abstract class MyAbstractList<E> implements MyList<E>
{
    protected int listSize = 0;
    
    // add, remove, get to be defined in concrete class
    public abstract void add(E element);
    public abstract void remove(int index);
    public abstract E get(int index);
    
    public int size()
    {
        return listSize;
    }
    public String toString()
    {
        String toReturn = "";
        for (int i = 0; i < listSize; i++)
        {
            toReturn += this.get(i).toString();
        }
        return toReturn;
    }
}