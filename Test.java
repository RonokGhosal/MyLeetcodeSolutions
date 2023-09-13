import java.io.File;
import java.nio.file.Files;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[]args ) {

		File file = new File("target/TELEMETRY/TELEMETRY.zip");
		System.out.println(file.getParent());
	}
}
