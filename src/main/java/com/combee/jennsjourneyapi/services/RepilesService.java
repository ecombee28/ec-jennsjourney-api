package com.combee.jennsjourneyapi.services;


import com.combee.jennsjourneyapi.model.entity.AddReplyEntity;
import com.combee.jennsjourneyapi.repository.RepliesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepilesService {

    @Autowired
    private RepliesRepo repliesRepo;

    public void addReplies(AddReplyEntity body) {
        repliesRepo.saveAndFlush(body);
    }

    public List<AddReplyEntity> getRepliesById(Long id) {
        return repliesRepo.getRepliesByPostId(id);
    }

    public List<AddReplyEntity> getAllReplies() {
        return repliesRepo.findAll();
    }
}