package com.seph.state;

public class StateE extends State {
	public StateE(FSM sm) {
		super(sm);
		stateName = "E";
	}


	@Override
	public boolean transition2() {
		fsm.setState(new StateD(fsm));
		//execute logic E--2
		System.out.println("State "+stateName+" --> Action 2");
		return true;
	}
}
