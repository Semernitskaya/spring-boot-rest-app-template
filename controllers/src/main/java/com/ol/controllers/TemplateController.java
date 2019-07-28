package com.ol.controllers;

/**
 * Created by Semernitskaya on 15.01.2019.
 */

import com.ol.DataObject;
import com.ol.TemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TemplateController {

    @Autowired
    private TemplateService service;

    @GetMapping(value = "/dataObject")
    public DataObject get(@RequestParam long id,
                          @RequestParam String description) {
        log.info("get data object id {}, description {}", id, description);
        var dataObject = service.createDataObject(id, "data " + description);
        return dataObject;
    }
}