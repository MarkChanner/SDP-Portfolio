package question04abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class LondonFeedbackXMLParser implements XMLParser {

    @Override
    public String parse() {
        String message = "London Parsing feedback XML...\n" +
                "London Feedback XML Message";
        return message;
    }
}
