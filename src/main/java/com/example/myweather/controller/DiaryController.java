package com.example.myweather.controller;

import com.example.myweather.domain.Diary;
import com.example.myweather.service.DiaryService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @PostMapping("/diary")
    void createDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
                     @RequestBody String text) {
        diaryService.saveDiary(date, text);

    }

    @GetMapping("/diary")
    List<Diary> readDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return diaryService.readDiary(date);
    }

    @GetMapping("/diaries")
    List<Diary> readDiary(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                          @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return diaryService.readDiary(startDate, endDate);
    }

    @PostMapping("/diary/{id}")
    void createDiary(@PathVariable Integer id,
                     @RequestBody String text) {
        diaryService.saveDiary(id, text);
    }

    @DeleteMapping("/diary/{id}")
    void deleteDiary(@PathVariable Integer id) {
        diaryService.deleteDiary(id);
    }
}
