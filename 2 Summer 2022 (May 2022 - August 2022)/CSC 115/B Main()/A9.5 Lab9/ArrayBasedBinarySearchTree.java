public class ArrayBasedBinarySearchTree extends ArrayBasedBinaryTree {

    public void insert(Integer value) {
        insert(root, value);
    }

    private void insert (int t, Integer value) {
        if (t<data.length && data[t] == null) {
            data[t] = value;
            size++;
        } else {
            if (t>=data.length) {
                expandAndCopy();
                insert(t, value);
            } else if (value.compareTo(data[t]) == 0) {
                data[t] = value; 
            } else if (value.compareTo(data[t]) < 0) {
                insert(getLeft(t), value);
            } else {
                insert(getRight(t), value);
            }
        }
    }
    
    public Integer sum() {
        return sum(0);
    }
    private Integer sum(Integer t) {
        if ((t>=data.length)||(data[t] == null)) {
            return 0;
        } else {
            return (data[t]+sum(getRight(t))+sum(getLeft(t)));
        }
    }

    public boolean contains(Integer toFind) {
        try {
            for (int i=0; i<data.length; i++) {
                if (data[i]==toFind) {
                    return true;
                }
            }
        } catch (Exception See) {
            System.out.print("Exception at Contain() :BT");
        }
        return false;
    }

    protected void expandAndCopy() {
        Integer[] newData = new Integer[data.length*2];
        for(int i=0; i<data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }


    public void preOrder() {
        preOrder(root);
        System.out.println();
    }
    private void preOrder(int t) {
        if (t>=data.length || data[t]==null) {
            return;
        }
        System.out.print(data[t] + " ");
        preOrder(getLeft(t));
        preOrder(getRight(t));
    }


    public void postOrder() {
        postOrder(root);
        System.out.println();
    }
    private void postOrder(int t) {
        if (t>=data.length || data[t]==null) {
            return;
        }
        postOrder(getLeft(t));
        postOrder(getRight(t));
        System.out.print(data[t] + " ");
    }


    protected int getLeft(int t) {
        return 2*t+1;
    }

    protected int getRight(int t) {
        return 2*t+2;
    }

    public int height() {
        return height(root);
    }

    private int height(int t) {
        if (t>=data.length || data[t] == null) {
            return 0;
        } else if ((height(getLeft(t)))>=(height(getRight(t)))) {
            return (1+height(getLeft(t)));
        } else if ((height(getLeft(t)))<(height(getRight(t)))) {
            return (1+height(getRight(t)));
        }
        return -1;
    }

    public String toString() {
        return toString(root);
    }

    private String toString(int t) {
        if (t>=data.length || data[t] == null) {
            return "";
        }
        String s = "";
        s += toString(getLeft(t));
        s += data[t] + " ";
        s += toString(getRight(t));

        return s;
    }

}
