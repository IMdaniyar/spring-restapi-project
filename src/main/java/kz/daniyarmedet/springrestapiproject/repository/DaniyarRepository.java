package kz.daniyarmedet.springrestapiproject.repository;

import kz.daniyarmedet.springrestapiproject.controller.Rest_daniyar_controller;
import kz.daniyarmedet.springrestapiproject.model.Daniyar;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class DaniyarRepository
{
   List <Daniyar> daniyars = new ArrayList<>();

   public DaniyarRepository()
   {
      daniyars.add(new Daniyar(
              UUID.randomUUID().toString(),
              "Building REST API with Spring Boot",
              "Building REST API with Spring Boot",
              "https://github.com/imdaniyar/",
              LocalDateTime.of(2022,6,2,11,5),
              LocalDateTime.of(2022, 6,2,13,6)

      ));

   }
   public Daniyar findByAll(String id)
   {
      return daniyars.stream().filter();
   }



}
