package com.podcasphere.services.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.podcasphere.entity.ItunesResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Convert ITunes responses to ItunesResponse object .
 */
@Service
public class ItunesServiceAdapter {

    @Autowired
    private ObjectMapper mapper;

    private static final Logger log = LoggerFactory.getLogger(ItunesServiceAdapter.class);

    public ItunesServiceAdapter(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public ItunesResponses handle(String response) throws IOException {

        //JSON from String to Object
        ItunesResponses itunesResponses = mapper.readValue(response, ItunesResponses.class);

        log.info("Nb retours = " + itunesResponses.getResultCount());

        return itunesResponses;
    }
}
