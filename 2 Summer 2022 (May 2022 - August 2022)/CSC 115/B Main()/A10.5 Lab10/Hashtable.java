public class Hashtable{

    private static final int TABLE_SZ = 7; // a prime number

    Student[] table;
    int count;  // number of Students in the table

    public Hashtable() {
        table = new Student[TABLE_SZ];
        count = 0;
    }


    /* MethodName: insertCollisions
     * Purpose: insert s into this Hashtable with no collision handling strategy
     * Parameters: Student - s
     * Throws:  TableFullException - if inserting into a full table
     *          CollisionException - if inserting a new key into table at index that is full
     * Returns: nothing
     */
    // TODO: complete this method
    public void insertCollisions(Student s) throws TableFullException, CollisionException {
        int hashcode = s.hashCode();
        int indexKey = (hashcode%TABLE_SZ);
        
        if (table[indexKey]!=null) {
            if (table[indexKey].equals(s)) {table[indexKey]=s;}
            else if (count>=TABLE_SZ) {throw new TableFullException();}
            else {throw new CollisionException();}
        } else {
            table[indexKey] = s;
            count++; 
        }
    }

    /* MethodName: getCollisions
     * Purpose: find Student with sid in this Hashtable with no collision handling and returns their grade
     * Parameters: String - sid
     * Throws:  KeyNotFoundException  - if Student with sid is not found in table
     * Returns: int - the grade of Student with sid
     */
    public int getCollisions (String SID) throws KeyNotFoundException {
        int hashcode = SID.hashCode();
        int indexKey = (hashcode%TABLE_SZ);

        if ((table[indexKey]==null)||(!table[indexKey].getSID().equals(SID))) {
            throw new KeyNotFoundException();
        } else {
            return table[indexKey].getGrade();
        }
    }

    /* MethodName: insertLinearProbing
     * Purpose: insert s into this Hashtable with Linear Probing to handle collisions
     * Parameters: Student - s
     * Throws: TableFullException  - if inserting into a full table
     * Returns: nothing
     */
    public void insertLinearProbing (Student s) throws TableFullException {
        int hashcode = s.hashCode();
        int indexKey = (hashcode%TABLE_SZ);
        
        if (table[indexKey]!=null) {
            if (table[indexKey].equals(s)) {table[indexKey]=s;}
            else if (count>=TABLE_SZ) {throw new TableFullException();}
            else {
                indexKey=insLinProbRec(s, ++indexKey);
                table[indexKey]=s;
                count++;
            }
        } else {
            table[indexKey] = s;
            count++; 
        }
    }
    
    private int insLinProbRec (Student s, int indexKey) {
        indexKey = (indexKey%TABLE_SZ);
        if ((indexKey<TABLE_SZ)&&(table[indexKey]!=null)) {
            if (table[indexKey].equals(s)) {table[indexKey]=s;}
            else {
                indexKey=insLinProbRec(s, ++indexKey);
            }
        } else if ((indexKey<TABLE_SZ)&&(table[indexKey]==null)) {
            table[indexKey] = s;
        }
        return indexKey;
    }

    /* getLinearProbing
     * Purpose: find Student with sid in this Hashtable that uses Linear Probing and returns their grade
     * Parameters: String - sid
     * Throws:  KeyNotFoundException  - if Student with sid is not found in table
     * Returns: int - the grade of Student with sid
     */
    public int getLinearProbing (String SID) throws KeyNotFoundException {
        int hashcode = SID.hashCode();
        int indexKey = (hashcode%TABLE_SZ);

        if ((table[indexKey]==null)) {
            throw new KeyNotFoundException();
        } else if (!table[indexKey].getSID().equals(SID)) {
            return getLinProbGrRec(SID, ++indexKey,0);
        } else {
            return table[indexKey].getGrade();
        }
    }

    private int getLinProbGrRec (String SID, int indexKey, int countIns) throws KeyNotFoundException {
        if ((indexKey>=TABLE_SZ)&&(countIns<TABLE_SZ)) {
            indexKey=(indexKey%TABLE_SZ);
            getLinProbGrRec(SID, indexKey,++countIns);
        } else if ((table[indexKey]!=null)&&(indexKey<TABLE_SZ)&&(table[indexKey].getSID().equals(SID))) {
            System.out.println(SID+"/"+indexKey+" | "+table[indexKey].getSID()+"->"+table[indexKey].getGrade());
            return table[indexKey].getGrade();
        } else if ((table[indexKey]==null)||(countIns>=TABLE_SZ)) {
            throw new KeyNotFoundException();
        } else if ((countIns<TABLE_SZ)&&(!table[indexKey].getSID().equals(SID))) {
            System.out.println(countIns);
            return getLinProbGrRec(SID, ++indexKey,++countIns);
        } 
        return table[indexKey].getGrade();
    }

    // public int getLinearProbing (String StudentSID) throws KeyNotFoundException {
    //     int hashcode = (StudentSID.hashCode());
    //     int indexKey = (hashcode%TABLE_SZ);
    //     if (count >= TABLE_SZ) {
    //         int temp = indexKey;
    //         while (table[indexKey].getSID() != StudentSID) {
    //             indexKey = (++indexKey) % TABLE_SZ;
    //             if (indexKey == temp) {throw new KeyNotFoundException();}
    //         } return table[indexKey].getGrade();
    //     } else {
    //         while (table[indexKey] != null && table[indexKey].getSID() != StudentSID) 
	// 		{indexKey = (++indexKey)%TABLE_SZ;}
            // if (table[indexKey]!=null) {return table[indexKey].getGrade();} 
	// 		else {throw new KeyNotFoundException();}
    //     }
    // }



    /*
     * Purpose: returns the number of elements in this Hashtable
     * Parameters: none
     * Returns: int - the number of elements
     */
    public int size() {
        return count;
    }

    /*
     * Purpose: returns a String reprensentation of elements
     *      in this Hashtable separated by newlines
     * Parameters: none
     * Returns: String - the representation
     */
    public String toString() {
        String s = "";

        for(int i=0; i<TABLE_SZ; i++)
            if (table[i] != null)
                s  += table[i] + "\n";

        return s;
    }

}
