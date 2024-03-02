public class R10_THI03_J {
    
    synchronized (object) {
        if (<condition does not hold>) {
        object.wait();
        }
        // Proceed when condition holds
    }
    
}