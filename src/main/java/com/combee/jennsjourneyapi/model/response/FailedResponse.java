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
public class FailedResponse {

    @NotNull
    @Value("UNSUCCESS")
    private String status = null;
    @NotNull
    @Value("Error sending message!")
    private String message = null;
}