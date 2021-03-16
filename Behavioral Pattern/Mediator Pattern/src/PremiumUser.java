
public class PremiumUser implements IUser {

	private IChatMediator chatMediator;
	private String name;

	public PremiumUser(String name, ChatMediator mediator) {
		this.name = name;
		this.chatMediator = mediator;
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println(this.name + " received msg: " + msg);
	}

	@Override
	public void sendMessage(String name, String msg) {
		System.out.println(name + " sending msg: " + msg);
		chatMediator.sendMessage(name, msg, this);
	}

}
