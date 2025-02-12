import javax.speech.Central;
import javax.speech.recognition.*;
import java.util.Locale;

public class SpeechRecognition {
    public void startListening() {
        try {
            Recognizer recognizer = Central.createRecognizer(new Locale("en", "US"));
            recognizer.allocate();
            System.out.println("Listening for commands...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}