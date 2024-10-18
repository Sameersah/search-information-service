package com.sameer.search_information_service.controller;

import com.sameer.search_information_service.dto.StudentDTO;
import com.sameer.search_information_service.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/student/{name}")
    public StudentDTO searchStudent(@PathVariable String name) {
        return searchService.searchStudent(name);
    }
}
