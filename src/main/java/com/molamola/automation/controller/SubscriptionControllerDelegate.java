package com.molamola.automation.controller;
import com.molamola.automation.SubscriptionControllerApiDelegate;
import com.molamola.automation.helper.IBHelper;
import com.molamola.automation.model.SubscriptionRequest;
import com.molamola.automation.model.SubscriptionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Slf4j

public class SubscriptionControllerDelegate implements SubscriptionControllerApiDelegate {

    @Autowired
    private IBHelper ibHelper;

    @Override
    public ResponseEntity<SubscriptionResponse> subscribe (SubscriptionRequest request){
        log.info(ibHelper.GetStatus());
        log.info("called");
        return ResponseEntity.ok().build();
    }

}
