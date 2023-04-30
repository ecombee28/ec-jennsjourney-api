package com.combee.jennsjourneyapi.model.response;


import com.combee.jennsjourneyapi.model.entity.AddCommentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetCommentResponse {

    @NotNull
    @Value("Success")
    private String status = "Success";

    @NotNull
    private List<AddCommentEntity> commentsList = null;
}