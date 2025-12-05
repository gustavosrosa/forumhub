package br.com.alura.forumweb.dto.topic;

import java.util.List;

public record NewTopicDTO(
        String title,
        String message,
        String status,
        Long author_id,
        Long course_id,
        List<Long> answer_id
) {
}
