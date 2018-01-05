package lt.tadasdavidsonas88.springbootstarter.topic;

import org.springframework.stereotype.Service;

import javax.xml.ws.WebFault;
import java.util.Arrays;
import java.util.List;

/**
 * Business service which is created like Singleton in Spring container
 */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}
