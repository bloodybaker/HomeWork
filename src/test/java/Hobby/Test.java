package Hobby;
import org.apache.log4j.Logger;
public class Test {
    public static void main(String[] args) {
        Hobby hobby = new Hobby(Boolean.parseBoolean("True"), Double.parseDouble("0.138"));
        hobby.tellAboutHobby();
        log.debug(hobby.getAge());
        log.error(hobby.getAverageWinRate());
        log.info(hobby.isFullStamina());
    }
    public static final Logger log = Logger.getLogger(Hobby.class);
}
