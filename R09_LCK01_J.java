public class R09_LCK01_J {
    
    private int count = 0;
    private final Integer Lock = new Integer(count);
     
    public void doSomething() {
      synchronized (Lock) {
        count++;
        // ...
      }
    }
    
}
