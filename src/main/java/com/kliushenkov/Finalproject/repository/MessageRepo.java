package com.kliushenkov.Finalproject.repository;

import com.kliushenkov.Finalproject.entities.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);
}
