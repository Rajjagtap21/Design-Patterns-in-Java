
public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		BasicUser user1 = new BasicUser("user1", chatMediator);
		PremiumUser raj = new PremiumUser("RAJ", chatMediator);
		PremiumUser user2 = new PremiumUser("user2", chatMediator);
		// chatMediator.AddUser(user1);
		chatMediator.addUser(raj);
		chatMediator.addUser(user2);
		String name = user1.getName();

		user1.sendMessage(name, "Hi All");
	}
}
