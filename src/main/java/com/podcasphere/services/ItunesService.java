package com.podcasphere.services;

import com.podcasphere.entity.ItunesResponses;

import java.util.Map;

/**
 * Interface du service client iTunes
 */
public interface ItunesService {

    ItunesResponses searchContents(Map<String, String> entry);

    String searchSpecificContent(String key, String value);
}
