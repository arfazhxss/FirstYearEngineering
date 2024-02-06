import java.util.*;

public class BSTMap<K extends Comparable<K>, V > implements  Map<K, V>  {

    BinarySearchTree<K,V> bst;

    public BSTMap () {
        bst = new BinarySearchTree<K,V>();
    }

    public boolean containsKey(K key) {
        if (this.bst.root==null) {return false;}
        else {
            return containsKeyRec(this.bst.root,key,false);
        }
    }
    private boolean containsKeyRec (BSTNode<K,V> curr, K key, boolean cond) {
        // boolean cond = false;
        if ((cond!=true)&&(curr!=null)) {
            if (key.compareTo(curr.getKey())<0) {
                cond=containsKeyRec(curr.getLeft(),key,cond);
            } else if (key.compareTo(curr.getKey())>0) {
                cond=containsKeyRec(curr.getRight(), key, cond);
            } else if (key.compareTo(curr.getKey())==0) {
                return true;
            }
        } else if ((cond!=true)&&(curr==null)) {
            return false;
        }
        return false;
    }

    public V get (K key) throws KeyNotFoundException {
        return this.bst.find(key);
    }

    public List<Entry<K,V>> entryList() {
        return this.bst.entryList(3);
    }

    public void put (K key, V value) {
        this.bst.insert(key, value);
    }

    public int size() {
        System.out.println("\t\t\t\tpositive size:\t"+this.bst.size());
        return this.bst.size();
    }

    public void clear() {
        this.bst.clear();
    }

}
