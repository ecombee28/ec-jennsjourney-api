package com.combee.jennsjourneyapi.controller;

import com.combee.jennsjourneyapi.model.entity.AddCommentEntity;
import com.combee.jennsjourneyapi.model.entity.AddReplyEntity;
import com.combee.jennsjourneyapi.model.response.FailedResponse;
import com.combee.jennsjourneyapi.model.response.GetCommentResponse;
import com.combee.jennsjourneyapi.model.response.GetRepliesResponse;
import com.combee.jennsjourneyapi.model.response.GetSuccessResponse;
import com.combee.jennsjourneyapi.services.CommentService;
import com.combee.jennsjourneyapi.services.RepilesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JennsController implements JennsAPI {


    private static final Logger LOGGER = LoggerFactory.getLogger(JennsController.class);
    @Autowired
    private GetSuccessResponse getSuccessResponse;

    @Autowired
    private FailedResponse failedResponse;


    @Autowired
    private CommentService commentService;

    @Autowired
    private RepilesService repilesService;


    @Override
    public ResponseEntity<?> addComment(AddCommentEntity body) {

        try {
            commentService.addComment(body);
            LOGGER.info("All users retrieved successfully");
            return new ResponseEntity<>(getSuccessResponse, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(failedResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @Override
    public ResponseEntity<?> getAllComments() {

        GetCommentResponse getCommentResponse = new GetCommentResponse();

        try {
            List<AddCommentEntity> allCommentsList = commentService.getAllComments();

            if (!allCommentsList.isEmpty()) {
                getCommentResponse.setCommentsList(allCommentsList);
            }

            LOGGER.info("All comments retrieved successfully");
            return new ResponseEntity<>(getCommentResponse, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(failedResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @Override
    public ResponseEntity<?> getAllCommentsBySlug(Long slug) {


        GetCommentResponse getCommentResponse = new GetCommentResponse();

        try {
            List<AddCommentEntity> allCommentsList = commentService.getCommentsBySlug(slug);

            if (!allCommentsList.isEmpty()) {
                getCommentResponse.setCommentsList(allCommentsList);
            }

            LOGGER.info("All comments retrieved successfully for slug " + slug);
            return new ResponseEntity<>(getCommentResponse, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(failedResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> addReply(AddReplyEntity body) {

        try {
            repilesService.addReplies(body);

            LOGGER.info("Replies saved");
            return new ResponseEntity<>(getSuccessResponse, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(failedResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> getReplyByPostId(Long postId) {
        GetRepliesResponse getRepliesResponse = new GetRepliesResponse();

        try {
            List<AddReplyEntity> allRepliesList = repilesService.getRepliesById(postId);

            if (!allRepliesList.isEmpty()) {
                getRepliesResponse.setRepliesList(allRepliesList);
            }

            LOGGER.info("All replies retrieved successfully for postId " + postId);
            return new ResponseEntity<>(getRepliesResponse, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(failedResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> getAllReplies() {
        GetRepliesResponse getRepliesResponse = new GetRepliesResponse();

        try {
            List<AddReplyEntity> allRepliesList = repilesService.getAllReplies();

            if (!allRepliesList.isEmpty()) {
                getRepliesResponse.setRepliesList(allRepliesList);
            }

            LOGGER.info("All replies retrieved successfully");
            return new ResponseEntity<>(getRepliesResponse, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(failedResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}