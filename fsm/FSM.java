package fsm;

import state.State;

// 1. Create a "wrapper" class that models the state machine
public class FSM {
	// 2. states
	private State[] states;

	private int currentState;

	public FSM(int initialState, State[] states) {
		this.states = states;
		this.currentState = initialState;
	}

	public String getOutput(String input) {
		StringBuilder builder = new StringBuilder();
		System.out.println("Input is " + input);
		System.out.println("Initial state is " + states[currentState].getStateName());
		for (char c : input.toCharArray()) {
			System.out.println("For input: " + c);
			switch (currentState) {
			case 0:
				if(c == 'a') {
					builder.append('0');
					currentState = 1;
				} else {
					builder.append('1');
				}
				break;
			case 1:
				if(c == 'a') {
					builder.append('0');
				} else {
					builder.append('1');
					currentState = 3;
				}
				break;
			case 2:
				if(c == 'a') {
					builder.append('1');
				} else {
					builder.append('0');
					currentState = 0;
				}
				break;
			case 3:
				if(c == 'a') {
					currentState = 4;
				}
				builder.append('0');
				break;
			case 4:
				if(c == 'a') {
					builder.append('0');
					currentState = 2;
				} else {
					builder.append('1');
				}
				break;
			}
			System.out.println("Current state is " + states[currentState].getStateName());
		}
		return builder.toString();
	}

}