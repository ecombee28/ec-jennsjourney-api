package com.combee.jennsjourneyapi.repository;


import com.combee.jennsjourneyapi.model.entity.AddCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CommentRepo extends JpaRepository<AddCommentEntity, Long> {

    @Query(value = "select * from comments where slug = :slug", nativeQuery = true)
    List<AddCommentEntity> getCommentsBySlug(@Param("slug") Long slug);
}