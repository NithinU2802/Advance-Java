/******************************************************************************

    Understanding the usage of printStackTrace.
    
printStackTrace - to return the location where the error occur in the console
without generate or consider it as error.

*******************************************************************************/
public class PrintStackTrace {
    public static void main(String[] args) {
        try {
            int div=3/0;
        } catch (Exception e) {
            // normal printing e 
            System.out.println(e);
            
            // with printStackTrace
            e.printStackTrace();
        }
    }
}
