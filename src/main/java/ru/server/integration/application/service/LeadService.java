package ru.server.integration.application.service;

import lombok.NonNull;
import ru.server.integration.application.domain.Lead;

/**
 * @author Alvin
 **/

public interface LeadService {

    Lead create(@NonNull Lead lead);

}
