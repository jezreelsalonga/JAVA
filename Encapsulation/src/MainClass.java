public class MainClass {
	public static void main(String[] args) {
     User user1 = new User("StathisJCG", "JavaCodeGeeks", "myemail", "Stathis", "Maneas");
     System.out.println("User: " + user1.toString() + "\n");

     user1.setUsername("JCG");
     System.out.println("My new username is: " + user1.getUsername() + "\n");

     System.out.println("My password is: " + user1.getPassword());
     System.out.println("I am about to change my password...\n");

     user1.setPassword("JavaCodeGeeks!");
     System.out.println("My new password is: " + user1.getPassword());
}
}