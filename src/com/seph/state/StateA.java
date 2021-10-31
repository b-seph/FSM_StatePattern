package com.seph.state;

public class StateA extends State {

	public StateA(FSM sm) {
		super(sm);
		stateName = "A";
	}

	@Override
	public boolean transition1() {
		fsm.setState(new StateB(fsm));
		//execute logic A--1
		System.out.println("State "+stateName+" --> Action 1");
		return true;
	}

	@Override
	public boolean transition2() {
		fsm.setState(new StateC(fsm));
		//execute logic A--2
		System.out.println("State "+stateName+" --> Action 2");
		return true;
	}
	
	

}
