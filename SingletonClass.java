/******************************************************************************

    Singleton class Implementation.

*******************************************************************************/

class Singleton{
    
    // To make use of single object.
    private static Singleton singleton;
    
    String s="Not Implemented";
    // To create single class 
    private Singleton(){
    }
    
    // To return instance of the Singleton
    static Singleton getInstance(){
        if(singleton==null)
            singleton=new Singleton();
        return singleton;
    }
    
    // displayMessage of the class 
    void displayMessage(){
        if(s.equals("Not Implemented")){
            System.out.println("Singleton class Implemented");
            s="Implemented";
        }else 
            System.out.println("Singleton class is already Implemented");
    }
    
}

public class SingletonClass
{
	public static void main(String[] args) {
	    
	// instance call 1st
	Singleton singleton=Singleton.getInstance();
	singleton.displayMessage();
	
	// instance call 2nd to prove class object created once
	singleton=Singleton.getInstance();
	singleton.displayMessage();
	}
}
