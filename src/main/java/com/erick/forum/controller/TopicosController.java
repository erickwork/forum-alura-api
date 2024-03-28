package com.erick.forum.controller;

import com.erick.forum.controller.dto.TopicoDto;
import com.erick.forum.modelo.Curso;
import com.erick.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Duvida", "Duvida com spring", new Curso("Spring", "Programação"));
        return TopicoDto .converter(Arrays.asList(topico, topico, topico));
    }

}
