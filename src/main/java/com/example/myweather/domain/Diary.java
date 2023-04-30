package com.example.myweather.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Diary {
    @Id
    private int id;
    private String weather;
    private String icon;
    private double temperature;
    private String text;

    private LocalDate date;

}
