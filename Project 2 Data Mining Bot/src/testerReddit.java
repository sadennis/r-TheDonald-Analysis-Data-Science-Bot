import java.util.Scanner;
import java.io.File;

public class testerReddit {

	public static void main(String[] args) {
		RedditReader myReader = new RedditReader();
		myReader.readHillary("redditPosts.txt");
		myReader.readRussia("redditPosts.txt");
	}

}
