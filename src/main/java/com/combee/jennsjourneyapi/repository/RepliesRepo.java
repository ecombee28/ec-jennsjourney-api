package com.combee.jennsjourneyapi.repository;


import com.combee.jennsjourneyapi.model.entity.AddReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface RepliesRepo extends JpaRepository<AddReplyEntity, Long> {

    @Query(value = "select * from replies where post_id = :id", nativeQuery = true)
    List<AddReplyEntity> getRepliesByPostId(@Param("id") Long id);
}