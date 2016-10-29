
package printnumber;

public class Thread2 implements Runnable {
    @Override
    public void run(){
        System.out.println("Thread2 ThreadId: " +  Thread.currentThread().getId());
        //do our thing
        PrintNumber.printNumbers();
        // the super doesn't anything,
        //but just for the courtesy and good practice
       
    }
    
}
