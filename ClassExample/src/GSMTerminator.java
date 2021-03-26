
public class GSMTerminator implements Terminator, Comparable<Terminator> {
	String name="GSM";

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("GSM is sending: "+message);
	}

	@Override
	public String receiveMessage() {
		// TODO Auto-generated method stub
		return "GSM received message";
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
