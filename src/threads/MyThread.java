/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Robert Palmer
 */
public class MyThread {
    public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		
		try {
			//Thread.sleep(3000);
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside main ...");
	}

}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run ...");
		go();
	}

	private void go() {
		System.out.println("Inside go ...");
		more();
	}
	
	private void more() {
		System.out.println("Inside more ...");
	
	}
}
