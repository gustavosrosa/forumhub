package br.com.alura.forumweb.service.topic;

import br.com.alura.forumweb.dto.topic.NewTopicDTO;
import br.com.alura.forumweb.model.Topic;
import br.com.alura.forumweb.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateNewTopicService {

    @Autowired
    private TopicRepository topicRepository;

    public void execute(NewTopicDTO newTopicDTO) {

        Topic topicEntity = new Topic();

        topicEntity.setTitle(newTopicDTO.title());
        topicEntity.setMessage(newTopicDTO.message());

        topicRepository.save(topicEntity);

    }
}
