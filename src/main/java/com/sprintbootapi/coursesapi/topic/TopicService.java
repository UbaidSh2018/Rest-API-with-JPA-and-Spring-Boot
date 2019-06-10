package com.sprintbootapi.coursesapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    private TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    Topic getTopicById(String topicID){
      return topicRepository.findById(topicID).get();
    }

    void saveOrUpdate(Topic topic){
       topicRepository.save(topic);
    }

    void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
