//Name: HealthTracker
//Description: Contains the main function and the list of accounts. Also contains all the menus in this iteration.

import java.util.*;
import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;


public class HealthTracker {
	/*
	 * Main Function
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						
						UserAccountList listOfAccounts = new UserAccountList();
						
					
						FrameController fc = new FrameController(listOfAccounts);
						fc.openChooseFrame();
						
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
