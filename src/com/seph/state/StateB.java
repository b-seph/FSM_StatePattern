package com.seph.state;

public class StateB extends State {
	public StateB(FSM sm) {
		super(sm);
		stateName = "B";
	}

	@Override
	public boolean transition1() {
		fsm.setState(new StateA(fsm));
		//execute logic B--1
		System.out.println("State "+stateName+" --> Action 1");
		return true;
	}

	@Override
	public boolean transition2() {
		fsm.setState(new StateD(fsm));
		//execute logic B--2
		System.out.println("State "+stateName+" --> Action 2");
		return true;
	}
}
