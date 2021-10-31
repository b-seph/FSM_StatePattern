package com.seph.state;

public class StateC extends State {
	public StateC(FSM sm) {
		super(sm);
		stateName = "C";
	}


	@Override
	public boolean transition2() {
		fsm.setState(new StateD(fsm));
		//execute logic C--2
		System.out.println("State "+stateName+" --> Action 2");
		return true;
	}
}
