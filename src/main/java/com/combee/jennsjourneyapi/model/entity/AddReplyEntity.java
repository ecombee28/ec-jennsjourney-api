package com.combee.jennsjourneyapi.model.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity(name = "replies")
public class AddReplyEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id = null;

    @JsonProperty("timeAdded")
    @NotNull
    @Column(name = "time_added")
    private Timestamp timeAdded = null;

    @JsonProperty("postId")
    @NotNull
    @Column(name = "post_id")
    private Long postId = null;

    @JsonProperty("name")
    @NotNull
    @Column(name = "name")
    private String name = null;

    @JsonProperty("reply")
    @NotNull
    @Column(name = "reply")
    private String reply = null;
}