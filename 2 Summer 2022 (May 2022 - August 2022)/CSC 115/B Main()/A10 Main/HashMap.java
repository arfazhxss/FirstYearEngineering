import java.util.*;

public class HashMap<K extends Comparable<K>, V> implements Map<K,V> {

    private long			getLoops;
    private long			putLoops;
    private int         tableSize;

    private List< List<Entry<K,V>> > 	table;                                      // IMPORTANT!
    private int			count;

    public HashMap() {
        tableSize = 1000003; // prime number
        table = new ArrayList<List<Entry<K,V>>>(tableSize);

        // initializes table as a list of empty lists
        for (int i = 0; i < tableSize; i++)
            table.add(new LinkedList<Entry<K,V>>());
        count = 0;

        resetGetLoops();
        resetPutLoops();
    }

    public long getGetLoopCount() {
        return getLoops;
    }

    public long getPutLoopCount() {
        return putLoops;
    }

    public void resetGetLoops() {
        getLoops = 0;
    }
    public void resetPutLoops() {
        putLoops = 0;
    }

    public boolean containsKey(K key) {
        // gets the index in the table this key should be in
        int index = Math.abs(key.hashCode()) % tableSize;

        // Tip: use Java's List and Iterator operations to go through a chain at a specific index

        Iterator<Entry<K,V>> secondListIterator = table.get(index).iterator();              // Goes to the (firstList or table) index and iterates through the (secondList) list
                                                                                            // in order to find the value suposed to be at that index ((key)-mod-(total_size_of_the_table))
        
        // Not Accounting for the first element in the table/firstList?
        // Answer: https://stackoverflow.com/questions/5162383/how-do-i-refer-to-the-current-object-in-an-iterator
        // @StephenC oh yes, I implemented it and it is not skipping the first object, seems like iterator points to nothing at first and then next objects on it.next(); – 
        // Srujan Barai
        // Mar 30, 2017 at 5:50

        while (secondListIterator.hasNext()) {
            Entry<K,V> curEntry = secondListIterator.next();
            if (curEntry.getKey().equals(key)) {
                return true;
            }
        } return false;
    }

    public V get (K key) throws KeyNotFoundException {
        // gets the index in the table this key should be in
        int index = Math.abs(key.hashCode()) % tableSize;
        // TODO... complete this method
        // Tip: use Java's List and Iterator operations to go through a chain at a specific index

        Iterator<Entry<K,V>> secondListIterator = table.get(index).iterator();              // Goes to the (firstList or table) index and iterates through the (secondList) list
                                                                                            // in order to find the value suposed to be at that index ((key)-mod-(total_size_of_the_table))
        
        // Not Accounting for the first element in the table/firstList?
        // Answer: https://stackoverflow.com/questions/5162383/how-do-i-refer-to-the-current-object-in-an-iterator
        // @StephenC oh yes, I implemented it and it is not skipping the first object, seems like iterator points to nothing at first and then next objects on it.next(); – 
        // Srujan Barai
        // Mar 30, 2017 at 5:50

        while (secondListIterator.hasNext()) {
            getLoops++;
            Entry<K,V> curEntry = secondListIterator.next();
            // System.out.println(curEntry.getKey()+"->"+curEntry.getValue());
            if (curEntry.getKey().equals(key)) {
                return curEntry.getValue();
            }
        } throw new KeyNotFoundException();

    }

    public List<Entry<K,V>> entryList() {
        List <Entry<K,V>> l = new LinkedList<Entry<K,V>>();
        // TODO... complete this method
        // Tip: use Java's List and Iterator operations to go through every index in the table
        //      use a second Iterator to go through each element in a chain at a specific index
        //      and add each element to l
        Iterator<List<Entry<K,V>>> tableIterator = table.iterator();

        // Not Accounting for the first element in the table/firstList?
        // Answer: https://stackoverflow.com/questions/5162383/how-do-i-refer-to-the-current-object-in-an-iterator
        // @StephenC oh yes, I implemented it and it is not skipping the first object, seems like iterator points to nothing at first and then next objects on it.next(); – 
        // Srujan Barai
        // Mar 30, 2017 at 5:50

        while (tableIterator.hasNext()) {
            Iterator<Entry<K,V>> secondListIterator = tableIterator.next().iterator();
            while (secondListIterator.hasNext()) {
                Entry<K,V> curEntry = secondListIterator.next();
                l.add(curEntry);
            }
        }
        return l;
    }

    public void put (K key, V value){
        // gets the index in the table this key should be in
        int index = Math.abs(key.hashCode())%tableSize;

        // TODO... complete this method
        // Tip: use Java's List and Iterator operations to go through a chain at a specific index
        //  if key is found, update value.  if key is not found add a new Entry with key,value
        // The tester expects that you will add the newest Entry to the END of the list
        
        Iterator<Entry<K,V>> secondListIterator = table.get(index).iterator();              // Goes to the (firstList or table) index and iterates through the (secondList) list
                                                                                            // in order to find the value suposed to be at that index ((key)-mod-(total_size_of_the_table))
        while (secondListIterator.hasNext()) {
            putLoops++;
            Entry<K,V> curEntry = secondListIterator.next();
            if (curEntry.getKey().equals(key)) {
                curEntry.setValue(value);
                return;
            }
        }

        table.get(index).add(new Entry<K,V>(key, value));
        count++;
    }

    public int size() {
        return count;
    }

    public void clear() {
        table.clear();
        count = 0;
    }

}
