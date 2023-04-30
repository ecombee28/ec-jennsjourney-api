package com.combee.jennsjourneyapi.controller;

import com.combee.jennsjourneyapi.model.entity.AddCommentEntity;
import com.combee.jennsjourneyapi.model.entity.AddReplyEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("jennsjourney/api/v1/")
public interface JennsAPI {

    @PostMapping(value = "addComment", consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity<?> addComment(@Valid @RequestBody AddCommentEntity body);

    @GetMapping(value = "getAllComments", consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity<?> getAllComments();

    @GetMapping(value = "getAllCommentsBySlug", consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity<?> getAllCommentsBySlug(@RequestParam("slug") Long slug);


    @PostMapping(value = "addReply", consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity<?> addReply(@Valid @RequestBody AddReplyEntity body);

    @GetMapping(value = "getReplyByPostId", consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity<?> getReplyByPostId(@RequestParam("postid") Long postId);

    @GetMapping(value = "getAllReplies", consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity<?> getAllReplies();
}