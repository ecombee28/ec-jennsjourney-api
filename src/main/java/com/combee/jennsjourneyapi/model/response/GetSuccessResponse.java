package com.combee.jennsjourneyapi.model.response;

import com.combee.jennsjourneyapi.model.entity.AddCommentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Service
public class GetSuccessResponse {


    @NotNull
    @Value("Success")
    private String status = null;
    //    @NotNull
    //    @Value("Message sent successfully")
    //    private String message = null;
    @NotNull
    private List<AddCommentEntity> entityList = null;
}