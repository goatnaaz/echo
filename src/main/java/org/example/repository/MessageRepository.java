package org.example.repository;

import org.example.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository  extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
