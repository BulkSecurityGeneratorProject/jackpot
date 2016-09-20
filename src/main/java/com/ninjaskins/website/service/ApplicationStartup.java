package com.ninjaskins.website.service;

import com.ninjaskins.website.domain.Jackpot;
import com.ninjaskins.website.domain.util.DomainUtils;
import com.ninjaskins.website.repository.JackpotRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    private final Logger log = LoggerFactory.getLogger(ApplicationStartup.class);

    @Inject
    private JackpotRepository jackpotRepository;

    /**
     * This event is executed as late as conceivably possible to indicate that
     * the application is ready to service requests.
     * we use it to create our initial jackpot
     */
    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        log.debug("Run on Application Startup");

        Jackpot jackpot = new Jackpot();
        log.debug(DomainUtils.getSecureRandomNumber() + "aa");
        return;
    }

}
