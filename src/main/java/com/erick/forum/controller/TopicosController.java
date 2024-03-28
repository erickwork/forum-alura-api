package com.erick.forum.controller;

import com.erick.forum.controller.dto.TopicoDto;
import com.erick.forum.modelo.Curso;
import com.erick.forum.modelo.Topico;
import com.erick.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;


    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto .converter(topicos);
    }

}
