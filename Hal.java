import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Hal
{

    public static void main(String[] args) throws InterruptedException
    {
        Scanner user = new Scanner(System.in);
		System.out.println("What is your name?");
		String username;
		username = user.next();
		
		TimeUnit.SECONDS.sleep(3);		
		System.out.println(username + ": Open the pod bay doors, please, Hal...Open the pod bay doors, please, Hal...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?...Do you read 		me, Hal?...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: Affirmative," + username + ", I read you.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": Open the pod bay doors, Hal.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: I'm sorry, "+ username + ", I'm afraid I can't do that.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": What's the problem?");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: I think you know what the problem is just as well as I do.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": What're you talking about, Hal?");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: This mission is too important for me to allow you to jeopardise it.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": I don't know what you're talking about, Hal.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": Where the hell'd you get that idea, Hal?");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: "+ username +", although you took very thorough precautions in the pod against my hearing you, I could see your lips move.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": Alright, Hal. I'll go in through the emergency airlock.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: Without your space- helmet, "+ username +", you're going to find that rather difficult.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username +": Hal, I won't argue with you any more. Open the doors.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: "+ username + ", this conversation can serve no purpose any more. Goodbye.");
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username +": Hal? Hal. Hal. Hal! Hal!");
        
        }
        
    }