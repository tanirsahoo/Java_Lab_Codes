package Multithreading;

class newthread implements Runnable{
    Thread t ;
    newthread(){
        t = new Thread(this , "Demo Thread") ;
        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run(){
        try{
            for(int i = 5 ; i > 5 ; i --){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500) ;
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Thread Interrupt");
        }
        System.out.println("Exiting Child Thread");
    }
}
public class child_thread {
    public static void main(String[] args) {
        new newthread() ;
        try{
            for(int n = 5 ; n > 0 ; n --){
                System.out.println("Main thread: " + n);
                Thread.sleep(1000) ;
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}
