package state;

// 6. Create a state base class that makes the concrete states interchangeable
// 7. The State base class specifies default behavior
public class State {
    private String stateName;
    
    public State(String stateName) {
    	this.stateName = stateName;
    }

	public String getStateName() {
		return stateName;
	}
}