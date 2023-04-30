package com.combee.jennsjourneyapi.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Service
public class PostSuccessResponse {

    @NotNull
    @Value("Success")
    private String status = null;


    @NotNull
    @Value("User saved successfully")
    private String message = null;

}