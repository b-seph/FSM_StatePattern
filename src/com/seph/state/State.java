package com.seph.state;


public abstract class State {
	protected String stateName;
	protected FSM fsm;
	
	public State(FSM sm) {
		fsm = sm;
	}
	public boolean transition1() {return false;}
	public boolean transition2() {return false;}
	public boolean transition3() {return false;}


	public String getStateName() {return stateName;}	
	
}
