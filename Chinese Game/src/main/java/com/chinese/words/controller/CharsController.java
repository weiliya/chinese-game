package com.chinese.words.controller;

import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import com.chinese.words.repository.HanziRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*") // UI port and backend port are enabled for RestController
@RequestMapping("/api/v1/chars")
public class CharsController {

    @Autowired
    private HanziRepository hanziRepository;


    @GetMapping
    public List<Hanzi> list(){
        return hanziRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Hanzi hanzi){
        hanziRepository.save(hanzi);
    }

    @GetMapping("/{id}")
    public List<Word> get(@PathVariable("id") Integer id) {

        return hanziRepository.getOne(id).getWords();
    }
}
