package com.combee.jennsjourneyapi.model.response;

import com.combee.jennsjourneyapi.model.entity.AddReplyEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetRepliesResponse {


    @NotNull
    @Value("Success")
    private String status = "Success";

    @NotNull
    private List<AddReplyEntity> repliesList = null;
}