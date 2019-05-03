import java.io.*;
import IndonesianNLP.*;

public class FormalizerTester {

	public static void main(String[] args) throws IOException {
		File file = new File("tester_data_normalized.csv");
		IndonesianSentenceFormalization formalize = new IndonesianSentenceFormalization();
		BufferedReader in = new BufferedReader(new FileReader(file));
		String text = in.readLine();
		while(text != null) {
			String[] splittedText = text.split(",");
			String formalizedText = formalize.formalizeSentence(splittedText[1]);	
			System.out.println(splittedText[0] + ",\"" + formalizedText + "\"," + splittedText[2]);
			text = in.readLine();
		}
	}
}	