package view;

import controller.ThreadId;

public class Main {

	public static void main(String[] args) {
		
		ThreadId threadId1 = new ThreadId();
		ThreadId threadId2 = new ThreadId();
		ThreadId threadId3 = new ThreadId();
		ThreadId threadId4 = new ThreadId();
		ThreadId threadId5 = new ThreadId();
		
		threadId1.start();
		threadId2.start();
		threadId3.start();
		threadId4.start();
		threadId5.start();

	}

}
