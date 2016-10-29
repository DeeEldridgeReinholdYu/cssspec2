
package printnumber;
public class PrintNumber {
static public void printNumbers(){
    for (int i=0; i<1000;i++){
        System.out.println(Thread.currentThread().getId()+": "+i);
    }
}
   
    public static void main(String[] args) {
      new Thread2().run();
    }
    
}
