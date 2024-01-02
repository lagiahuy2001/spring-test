package com.example.demo.controller;

import com.example.demo.dto.ProcessImageDTO;
import com.example.demo.repository.ProcessImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class ProcessImageController {
    @Autowired
    private ProcessImageRepository processImageRepository;

    @PostMapping("/processimage-p1")
    @ResponseBody
    public ProcessImageDTO nQueenP1(@RequestBody ProcessImageDTO processImageDTO) {
        ProcessImageDTO response = new ProcessImageDTO();
        response.setStatus("success");
        return response;
    }
}
