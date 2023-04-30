package com.combee.jennsjourneyapi.model.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity(name = "comments")
public class AddCommentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id = null;

    @JsonProperty("publishedDate")
    @NotNull
    @Column(name = "published_date")
    private Timestamp publishedDate = null;

    @JsonProperty("slug")
    @NotNull
    @Column(name = "slug")
    private Long slug = null;

    @JsonProperty("name")
    @NotNull
    @Column(name = "name")
    private String name = null;

    @JsonProperty("comment")
    @NotNull
    @Column(name = "comment")
    private String comment = null;


}