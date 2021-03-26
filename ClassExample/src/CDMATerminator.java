
public class CDMATerminator implements Terminator, Comparable<Terminator> {
	String name="CDMA";

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("CDMA: Sending message..."+message);
	}

	@Override
	public String receiveMessage() {
		// TODO Auto-generated method stub
		return("CDMA: received message bulabula");
	}

	@Override
	public int compareTo(Terminator o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
