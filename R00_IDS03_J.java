public class R00_IDS03_J {
    public static void main(String [] args){
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
}
