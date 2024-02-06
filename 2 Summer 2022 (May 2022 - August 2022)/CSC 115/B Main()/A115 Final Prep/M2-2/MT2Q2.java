class MT2Q2 {
    public static void bar (int x) throws MTException {
         System.out.println("Q");
         if (x > 2) {
              throw new MTException();
         }
         System.out.println("S");
    }
    public static void foo (int x) throws MTException {
         System.out.println("T");
         bar(x);
         System.out.println("A");
    }
    public static void main (String[] args) {
         try {
              System.out.println("D");
              foo(8);
              System.out.println("F");
         } catch (MTException e) {
              System.out.println("Z");
}
         System.out.println("P");
    }
}