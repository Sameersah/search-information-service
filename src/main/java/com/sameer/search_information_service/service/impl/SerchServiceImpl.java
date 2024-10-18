package com.sameer.search_information_service.service.impl;

import com.sameer.search_information_service.dto.StudentDTO;
import com.sameer.search_information_service.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SerchServiceImpl implements SearchService {


    private static final Logger log = LoggerFactory.getLogger(SerchServiceImpl.class);

    public StudentDTO searchStudent(String name) {
        //TODO: Implement this method
        log.info("Searching student");
        return null;
    }
}
