package com.podcasphere.controller;

import com.podcasphere.entity.ItunesResponse;
import com.podcasphere.entity.ItunesResponses;
import com.podcasphere.services.ItunesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@RestController
public class MainRestController {

    @Autowired
    private ItunesService itunesService;

    @CrossOrigin
    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public ResponseEntity<List<ItunesResponse>> restAction(@RequestParam(value = "name", required = false) String name) {

        Map<String, String> entry = new HashMap<>();
        ItunesResponses listResp = itunesService.searchContents(entry);
        List<ItunesResponse> itunesResponses = listResp.getResults();

        return new ResponseEntity<List<ItunesResponse>>(itunesResponses, HttpStatus.OK);
    }

}