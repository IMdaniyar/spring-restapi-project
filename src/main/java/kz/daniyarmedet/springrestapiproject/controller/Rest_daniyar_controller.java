package kz.daniyarmedet.springrestapiproject.controller;


import kz.daniyarmedet.springrestapiproject.model.Daniyar;
import kz.daniyarmedet.springrestapiproject.repository.DaniyarRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restapidaniyar")
public class Rest_daniyar_controller
{
    private final DaniyarRepository repository;

    public Rest_daniyar_controller(DaniyarRepository repository )
    {
        this.repository = repository;
    }

    @GetMapping
    public List<Daniyar> findALL()
    {
        return repository.findAll();
    }

}
