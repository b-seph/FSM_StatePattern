package com.seph;

import java.util.Scanner;

import com.seph.state.FSM;

public class Main {
	private static FSM fsm;

	public static void main(String[] args) {

		fsm = new FSM();
		System.out.println("Starting state = " + fsm.getStateName());
		System.out.println("Input a series of transitions (string with legal characters '1', '2' and '3'.");
		System.out.println("(Example: input '1122321' explores states A-B-A-C-D-E-D-A)");
		System.out.print("Transition string: ");
		
		
		Scanner scan = new Scanner(System.in);
		String transitions = scan.nextLine();
		scan.close();

		boolean result = executeTransitions(transitions);
		if(result) System.out.println("OK. Reached state = " + fsm.getStateName());
		else System.out.println("Invalid transition sequence. Last state reached: " + fsm.getStateName());
		
		
	}

	private static boolean executeTransitions(String transitions) {
		for (char c : transitions.toCharArray()) {
			boolean result = false;
			switch (c) {
			case '1':
				result = fsm.transition1();
				break;
			case '2':
				result = fsm.transition2();
				break;
			case '3':
				result = fsm.transition3();
				break;
			default:
				result = false;
				break;
			}
			if(!result) return false;		
		}
		return true;
	}

}
