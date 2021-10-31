package com.seph.state;

public class StateD extends State {

	public StateD(FSM sm) {
		super(sm);
		stateName = "D";
	}

	@Override
	public boolean transition1() {
		fsm.setState(new StateA(fsm));
		//execute logic D--1
		System.out.println("State "+stateName+" --> Action 1");
		return true;
	}

	@Override
	public boolean transition2() {
		fsm.setState(this); //this is actually redundant
		//execute logic D--3
		System.out.println("State "+stateName+" --> Action 2");
		return true;
	}
	
	@Override
	public boolean transition3() {
		fsm.setState(new StateE(fsm));
		//execute logic D--3
		System.out.println("State "+stateName+" --> Action 3");
		return true;
	}
}
