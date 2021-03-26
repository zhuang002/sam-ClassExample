
public class LTETerminator implements Terminator, Comparable<Terminator> {
	public String name="LTE";

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("LTE broadcast a message: "+message);
	}

	@Override
	public String receiveMessage() {
		// TODO Auto-generated method stub
		return "LTE: cannot receive message";
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int compareTo(Terminator o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
	}
}
