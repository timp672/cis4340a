public class R13_FIO05_J {
    
    final class Wrap {
      private char[] dataArray;
     
      public Wrap() {
        dataArray = new char[10];
        // Initialize
      }
     
      public CharBuffer getBufferCopy() {
        return CharBuffer.wrap(dataArray).asReadOnlyBuffer();
      }
    }
    
}
