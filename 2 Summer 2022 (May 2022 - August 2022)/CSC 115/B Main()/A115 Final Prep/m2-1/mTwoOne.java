public class mTwoOne {
    public static void m1 (int x, int y, int z) {
        try {
            m2(x,y);
            m3(y,z);
        } catch (ExceptionA e) {
            System.out.println("cought A in m1");
        } catch (ExceptionB e) {
            System.out.println("cought B in m1");
        } catch (ExceptionC e) {
            System.out.println("cought C in m1");
        }
    }
    public static void m2 (int h, int i) throws ExceptionA, ExceptionC {
        if (h>i) {
            throw new ExceptionA();
        }
        try {
            m3(h,i);
        } catch (ExceptionB e) {
            System.out.println("cought B in m2");
        } 
    }
    public static void m3 (int j, int k) throws ExceptionB, ExceptionC {
        if (j==k) {throw new ExceptionB();}
        if (k==0) {throw new ExceptionC();}
    }
    public static void main(String[] args) {
        m1(-1,-1,2);
    }
}