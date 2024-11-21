public class thread_interrupt {
    public static void main(String[] args){
       Thread t1= new Thread(() -> {
            try {
                while(!Thread.currentThread().isInterrupted()){
                    System.out.println("BMS College of Engineering");
                    Thread.sleep(10000);
                }
            } catch(InterruptedException e){
                System.out.println("Thread1 interrupted and stopping");
            }
       }); 
       Thread t2= new Thread(() -> {
        try {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch(InterruptedException e){
            System.out.println("Thread2 interrupted and stopping");
        }   
        }); 
        System.out.println("Press any key to stop..");
        t1.start();
        t2.start();

        try{
            System.in.read();
        } catch(Exception e){
            e.printStackTrace();
        }
        t1.interrupt();
        t2.interrupt();
        System.out.println("Threads interrupted and program stopping...");
    }
}

// O/P:
// before key press :
Press any key to stop..
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
BMS College of Engineering
CSE
//after key press :
Thread2 interrupted and stopping
Thread1 interrupted and stopping
Threads interrupted and program stopping...
