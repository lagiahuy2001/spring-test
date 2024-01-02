package com.example.demo.controller;


import com.example.demo.NQueenSolver;
import com.example.demo.dto.NQueenDTO;
import com.example.demo.repository.NQueenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class NQueenController {
    @Autowired
    private NQueenRepository nQueenRepository;

    @PostMapping("/nqueen-p1")
    @ResponseBody
    public NQueenDTO nQueenP1(@RequestBody NQueenDTO nQueenDTO) {
        long startTime = System.currentTimeMillis();
        NQueenDTO response = new NQueenDTO();

        // Tạo Class với tham số khởi tạo là kích thước bàn cờ
        NQueenSolver solver = new NQueenSolver(nQueenDTO.getSize());
        solver.solveNQueens();
        // Lấy giá trị bàn cờ
        String result = solver.getResult();
        System.out.println(result);
        // Số lượng quân hậu 
        Integer count = solver.getQueenCount();
        System.out.println(count);

        response.setResult(result);
        response.setCount(count);
        response.setStatus("success");
        long endTime = System.currentTimeMillis();
        long timer = endTime - startTime;
        response.setTimer(timer);
        System.out.println(timer);
        return response;
    }
}
