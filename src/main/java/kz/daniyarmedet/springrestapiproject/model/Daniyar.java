package kz.daniyarmedet.springrestapiproject.model;

import java.time.LocalDateTime;

public record Daniyar(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate )
{
}
