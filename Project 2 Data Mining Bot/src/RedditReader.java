import java.io.*;

public class RedditReader {
	File redditPosts = new File("redditPosts.txt");
	String fileToAnalyze;

	boolean detectRussia(String linetoAnalyze)
	{
		String lineToAnalyzeLowerCase=linetoAnalyze.toLowerCase();
		//if ((lineToAnalyzeLowerCase.contains("russia")||lineToAnalyzeLowerCase.contains("putin")||lineToAnalyzeLowerCase.contains("crimea"))&&(lineToAnalyzeLowerCase.contains("good ")||lineToAnalyzeLowerCase.contains("pro russia")||lineToAnalyzeLowerCase.contains("pro-russia")||lineToAnalyzeLowerCase.contains("great")||lineToAnalyzeLowerCase.contains(" best")||lineToAnalyzeLowerCase.contains("alliance")||lineToAnalyzeLowerCase.contains(" love")))
		if (lineToAnalyzeLowerCase.contains("russia")||lineToAnalyzeLowerCase.contains("putin")||lineToAnalyzeLowerCase.contains("crimea"))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	boolean detectHillary(String linetoAnalyze)
	{
		String lineToAnalyzeLowerCase=linetoAnalyze.toLowerCase();
		if (lineToAnalyzeLowerCase.contains("hillary")||lineToAnalyzeLowerCase.contains("clinton")||lineToAnalyzeLowerCase.contains("killary"))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
boolean detectProHillary(String linetoAnalyze)
	{
		String lineToAnalyzeLowerCase=linetoAnalyze.toLowerCase();
		if ((lineToAnalyzeLowerCase.contains("hillary")||lineToAnalyzeLowerCase.contains("clinton")) && (lineToAnalyzeLowerCase.contains("good") || lineToAnalyzeLowerCase.contains("great") || lineToAnalyzeLowerCase.contains("best")||lineToAnalyzeLowerCase.contains("pro hillary")||lineToAnalyzeLowerCase.contains("pro-hillary")||lineToAnalyzeLowerCase.contains("gain")||lineToAnalyzeLowerCase.contains("growth")))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

boolean detectAntiHillary(String linetoAnalyze)
	{
		String lineToAnalyzeLowerCase=linetoAnalyze.toLowerCase();
		if ((lineToAnalyzeLowerCase.contains("hillary")||lineToAnalyzeLowerCase.contains("killary")||lineToAnalyzeLowerCase.contains("clinton")) && (lineToAnalyzeLowerCase.contains("bad") || lineToAnalyzeLowerCase.contains("cuck") || lineToAnalyzeLowerCase.contains("killary")||lineToAnalyzeLowerCase.contains("anti")||lineToAnalyzeLowerCase.contains("libtard")||lineToAnalyzeLowerCase.contains("idiot")||lineToAnalyzeLowerCase.contains("benghazi")||lineToAnalyzeLowerCase.contains("email")||lineToAnalyzeLowerCase.contains("racist")||lineToAnalyzeLowerCase.contains("podesta")||lineToAnalyzeLowerCase.contains("crooked")||lineToAnalyzeLowerCase.contains("fraud")))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	void readRussia(String fileToRead) {
		System.out.println("Ready to read "+fileToRead+"!");
		int russiaCounter = 0;
		try {
			FileReader myFileReader = new FileReader(redditPosts);
			System.out.println("The file was opened!");
			BufferedReader myBufferedReader = new BufferedReader(myFileReader);
			System.out.println("Ready to buffer!");
			System.out.println("Detecting posts relating to Russia!");
			String line = null;
			while ((line=myBufferedReader.readLine()) !=null) {
				if (detectRussia(line) == true) {
				russiaCounter++;
				System.out.println("Russia Post "+russiaCounter+": "+line);
				}
			}
		} catch(Exception e) {
			System.out.println("The file could not be read.");
			System.exit(0);
			}
		System.out.println("Total Russia-related posts detected: "+russiaCounter);
		}
		
		void readHillary(String fileToRead) {
			System.out.println("Ready to read "+fileToRead+"!");
			int hillaryCounter = 0;
			int proHillaryCounter = 0;
			int antiHillaryCounter = 0;
			try {
				FileReader myFileReader = new FileReader(redditPosts);
				System.out.println("The file was opened!");
				BufferedReader myBufferedReader = new BufferedReader(myFileReader);
				System.out.println("Ready to buffer!");
				System.out.println("Detecting Hillary Clinton-related posts!");
				String line = null;
				while ((line=myBufferedReader.readLine()) !=null) {
					if (detectHillary(line) == true) {
						hillaryCounter++;
						System.out.println("Hillary Post "+hillaryCounter+": "+line);
					}
					if (detectProHillary(line) == true) {
						proHillaryCounter++;
						System.out.println("Pro-Hillary Post "+proHillaryCounter+": "+line);
					}
					else if (detectAntiHillary(line) == true) {
						antiHillaryCounter++;
						System.out.println("Anti-Hillary Post "+antiHillaryCounter+": "+line);
					}
				}
			} catch(Exception e) {
				System.out.println("The file could not be read.");
				System.exit(0);
			}
			System.out.println("Total Hillary-related posts detected: "+hillaryCounter);
			System.out.println("Total Pro-Hillary posts detected: "+proHillaryCounter);
			System.out.println("Total Anti-Hillary posts detected: "+antiHillaryCounter);
	}
		
}
