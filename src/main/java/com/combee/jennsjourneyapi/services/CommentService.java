package com.combee.jennsjourneyapi.services;

import com.combee.jennsjourneyapi.model.entity.AddCommentEntity;
import com.combee.jennsjourneyapi.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;


    public void addComment(AddCommentEntity body) {
        commentRepo.saveAndFlush(body);
    }

    public List<AddCommentEntity> getAllComments() {
        return commentRepo.findAll();
    }

    public List<AddCommentEntity> getCommentsBySlug(Long slug) {
        return commentRepo.getCommentsBySlug(slug);
    }

}