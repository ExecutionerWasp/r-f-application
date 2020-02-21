package ru.server.integration.application.service.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;
import ru.server.integration.application.domain.Lead;
import ru.server.integration.application.exception.LeadNotFoundException;
import ru.server.integration.application.service.LeadService;

/**
 * @author Alvin
 **/

@Log4j2
@Service
@RequiredArgsConstructor
public class LeadServiceImpl implements LeadService {
    @Override
    public Lead create(@NonNull Lead lead) {
        log.info("Creating lead : {}", lead);
        final String URL = "https://bazzaro.ru/api/lead/create/";
        log.info("Request with URL : {}", URL);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<Lead> response = rest.getForEntity(URL, Lead.class);
        log.info("Response : {}", response);
        if (response.hasBody()) {
            return response.getBody();
        }
        throw new LeadNotFoundException();
    }
}
