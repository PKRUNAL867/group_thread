
/*public class ThreadGroupTest {

	public static void main(String[] args) {
		// Start three threads first. They should belong 
		// to a same Threads Group.
		new SimpleThread("Boston").start();
		new SimpleThread("New York").start();
		new SimpleThread ("Seoul").start();
		
		// Get ThreadGroup of the Current thread and dispaly 
		//the number of active threads threads that belong to the 
		//ThreadGroup.
		
		
		ThreadGroup group =
	Thread.currentThread().getThreadGroup();
		System.out.println("Number of active threads in this thread group=" +group.activeCount());
		//Display the names of the threads in the current 
		//ThreadGroup
		Thread[] tarray =new Thread[10];
		int actualSize =group.enumerate(tarray);
		for(int i=0;i<actualSize;i++)
		{
			System.out.println("Thread"+tarray[i].getName() +"int thread group"+group.getName());
			
			
		}
		

	}

}
*/