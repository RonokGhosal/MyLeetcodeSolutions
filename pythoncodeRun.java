import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class pythoncodeRun {
	final static String pythonexe = "/Users/manbaner/hello.py";
public static void main(String[] args) {
	ProcessBuilder processBuilder = new ProcessBuilder("python3", pythonexe);
     processBuilder.redirectErrorStream(true);
	try
	{
		Process process = processBuilder.start();
		final BufferedReader reader = new BufferedReader(
				new InputStreamReader(process.getInputStream()));
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	} catch (final Exception e) {
		e.printStackTrace();
	}

}

}
