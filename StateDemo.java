import fsm.FSM;
import state.State;

// TODO implement demon star FSM and
// create parse tests for 2 different states with a certain input ($1 2 abaab)
// show outputs -- and a message if there are different results
public class StateDemo {
	public static void main(String[] args) {
		FSM fsm = new FSM(Integer.parseInt(args[0]),
				new State[] { new State("S1"), new State("S2"), new State("S3"), new State("S4"), new State("S5") });
		
		FSM fsm1 = new FSM(Integer.parseInt(args[1]),
				new State[] { new State("S1"), new State("S2"), new State("S3"), new State("S4"), new State("S5") });
		
		System.out.println(fsm.getOutput(args[2]));
		System.out.println();
		System.out.println(fsm1.getOutput(args[2]));
	}
}