package com.sameer.search_information_service.service;

import com.sameer.search_information_service.dto.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public interface SearchService {

        public StudentDTO searchStudent(String name);
}
