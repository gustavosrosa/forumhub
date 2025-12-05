package br.com.alura.forumweb.controller.topic;

import br.com.alura.forumweb.dto.topic.NewTopicDTO;
import br.com.alura.forumweb.facade.topic.CreateNewTopicFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class CreateNewTopicController {
	
	@Autowired
	private CreateNewTopicFacade createNewTopicFacade;

    @PostMapping
    public void createNewTopic(@RequestBody NewTopicDTO newTopicDTO) {
        createNewTopicFacade.handle(newTopicDTO);
    }

}
