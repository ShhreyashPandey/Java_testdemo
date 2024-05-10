//Shhreyash Pandey
//AIML-B2
//22070126105

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running.");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has completed.");
        }, "MyThread");

        // Start the thread
        thread.start();

        // Check if the thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is alive.");
        } else {
            System.out.println("Thread is not alive.");
        }

        // Get the name of the thread
        System.out.println("Thread name: " + thread.getName());

        // Set the name of the thread
        thread.setName("NewThread");
        System.out.println("New thread name: " + thread.getName());

        // Get the priority of the thread
        System.out.println("Thread priority: " + thread.getPriority());

        // Set the priority of the thread
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("New thread priority: " + thread.getPriority());

        try {
            // Join the thread
            thread.join();
            System.out.println("Thread joined.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive after joining
        if (thread.isAlive()) {
            System.out.println("Thread is alive.");
        } else {
            System.out.println("Thread is not alive.");
        }

        // Get and set the thread priority
        System.out.println(thread.getName() + " priority: " + thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getName() + " priority after setting to MAX_PRIORITY: " + thread.getPriority());
    }
}


// https://github.com/ShhreyashPandey/Java_testdemo/upload/main/Thread