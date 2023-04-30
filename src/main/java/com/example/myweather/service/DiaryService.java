package com.example.myweather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DiaryService {

    @Value("${openweathermap.key}")
    String apiKey;

    public void createDiary(LocalDateTime date, String text) {

    }

    private void getWeatherString() {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?p=seoul&appid=" + apiKey;
        System.out.println(apiUrl);
    }
}
