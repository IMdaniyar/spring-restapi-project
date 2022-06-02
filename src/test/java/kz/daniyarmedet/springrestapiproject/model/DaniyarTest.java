package kz.daniyarmedet.springrestapiproject.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class DaniyarTest
{
   @Test
    void create_new_multable_stream()
   {
       MutableDaniyar stream = new MutableDaniyar();
       stream.setId(UUID.randomUUID().toString());
       stream.setTitle("Building RESTAPIs with Spring Boot");
       stream.setDescription("Potom napishu");
       stream.setUrl("https://github.com/imdaniyar/");
       stream.setStartDate(LocalDateTime.of(2022,5,31,2,11));
       stream.setEndDate(LocalDateTime.of(2022,6,1,2,22));

       assertNotNull(stream);
       assertEquals("Building RESTAPIs with Spring Boot", stream.getTitle(), "hello");

   }

   @Test
   void create_new_immultable_stream()
   {
       ImmutableDaniyar stream = new ImmutableDaniyar(
       UUID.randomUUID().toString(),
       "Building RESTAPIs with Spring Boot",
       "Potom napishu",
       "https://github.com/imdaniyar/",
       LocalDateTime.of(2022,5,31,2,11),
       LocalDateTime.of(2022,6,1,2,22));

       assertNotNull(stream);
       assertEquals("Building RESTAPIs with Spring Boot", stream.getTitle(), "hello");

   }

   @Test
   void create_new_record_live_stream()
   {
       Daniyar stream = new Daniyar(
               UUID.randomUUID().toString(),
               "Building RESTAPIs with Spring Boot",
               "Potom napishu",
               "https://github.com/imdaniyar/",
               LocalDateTime.of(2022,5,31,2,11),
               LocalDateTime.of(2022,6,1,2,22));

       assertNotNull(stream);
       assertEquals("Building RESTAPIs with Spring Boot", stream.title());
       assertTrue(stream.getClass().isRecord());
       assertEquals(6, stream.getClass().getRecordComponents().length);

   }


}
