package com.seph.state;

//The FSM is the State context
public class FSM {
	private State state;

	public FSM() {
		state = new StateA(this);
	}
	
	
	public void setState(State s) {state = s;}

	
	//Delegating operations to the state object
	public boolean transition1() {return state.transition1();}
	public boolean transition2() {return state.transition2();}
	public boolean transition3() {return state.transition3();}
	
	public String getStateName() {return state.getStateName();}
	
}
