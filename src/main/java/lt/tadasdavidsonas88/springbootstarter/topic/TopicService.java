package lt.tadasdavidsonas88.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Business service which is created like Singleton in Spring container
 */
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<> ( Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();  // Lambda expression to compare
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
}
