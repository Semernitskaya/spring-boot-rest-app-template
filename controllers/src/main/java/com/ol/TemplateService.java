package com.ol;

import org.springframework.stereotype.Service;

/**
 * Created by Semernitskaya on 7/10/19.
 */
@Service
public class TemplateService {

    public DataObject createDataObject(long id, String description) {
        return new DataObject(id, description);
    }
}
