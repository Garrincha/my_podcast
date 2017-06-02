package com.podcasphere.services;

import com.podcasphere.entity.ItunesResponses;
import com.podcasphere.services.adapter.ItunesServiceAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;

/**
 * Service client iTunes
 */
@Service
public class ItunesServiceImpl implements ItunesService {

    private static final String ITUNES_SEARCH = "https://itunes.apple.com/search?";

    private static final Logger log = LoggerFactory.getLogger(ItunesServiceImpl.class);

    @Autowired
    private ItunesServiceAdapter adapter;

    public ItunesServiceImpl(ItunesServiceAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public ItunesResponses searchContents(Map<String, String> entry) {
        log.info("searchContents");
        RestTemplate restTemplate = new RestTemplate();

        String media = "podcast";
        String collectionName = "2 Heures De Perdues";

        String response = restTemplate.getForObject(ITUNES_SEARCH + "media="+media+"&term="+collectionName, String.class);
        log.info(response);

        ItunesResponses itunesResponses = null;
        try {
            itunesResponses = adapter.handle(response);
        } catch (IOException e) {
            log.error(e.getMessage());
        }

        log.info(itunesResponses.toString());

        return itunesResponses;
    }

    @Override
    public String searchSpecificContent(String key, String value) {
        return null;
    }
}
