package br.com.alura.forumweb.facade.topic;

import br.com.alura.forumweb.dto.topic.NewTopicDTO;
import br.com.alura.forumweb.service.topic.CreateNewTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateNewTopicFacade {

    @Autowired
    private CreateNewTopicService createNewTopicService;

    public void handle(NewTopicDTO newTopicDTO) {
        createNewTopicService.execute(newTopicDTO);
    }
}
