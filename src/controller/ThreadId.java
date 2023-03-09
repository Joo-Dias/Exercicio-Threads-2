package controller;

public class ThreadId extends Thread{

	public ThreadId() {
		
	}
	
	public void run() {
		int id = (int) getId();
		
		System.out.println("O ID da Thread é " +id+ ".");
	}

}
