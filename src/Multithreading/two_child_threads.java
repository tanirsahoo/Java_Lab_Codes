package Multithreading;

class two_thread implements Runnable{
//    String name ;
    Thread t;
    two_thread(String name){
        t = new Thread(this , name) ;
        System.out.println("Child Thread started");
        t.start();
    }
    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread Creation interrupted");
        }
        System.out.println("Successfully Excited from the thread");
    }
}
public class two_child_threads {
    public static void main(String[] args) {
        new two_thread("One") ;
        new two_thread("Two") ;
        new two_thread("Three") ;
        try{
            for(int i = 5 ; i > 0 ; i --){
                System.out.println("Main Thread: " + i);
                Thread.sleep(500) ;
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Exiting main thread") ;
    }
}
