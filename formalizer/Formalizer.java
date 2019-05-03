import java.io.*;
import IndonesianNLP.*;

public class Formalizer {

	public static void main(String[] args) throws IOException {
		File file = new File("tambahan_data_normalized.csv");
		IndonesianSentenceFormalization formalize = new IndonesianSentenceFormalization();
		BufferedReader in = new BufferedReader(new FileReader(file));
		String text = in.readLine();
		while(text != null) {
			String[] splittedText = text.split(",");
			String formalizedText = formalize.formalizeSentence(splittedText[2]);	
			System.out.println(splittedText[0] + "," + splittedText[1] + ",\"" + formalizedText + "\"," + splittedText[3]);
			text = in.readLine();
		}
	}
}