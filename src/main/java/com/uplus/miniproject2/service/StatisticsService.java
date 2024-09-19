package com.uplus.miniproject2.service;

import com.uplus.miniproject2.entity.hobby.Hobby;
import com.uplus.miniproject2.entity.proflie.MBTI;
import com.uplus.miniproject2.entity.proflie.Profile;
import com.uplus.miniproject2.repository.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StatisticsService {

    @Autowired
    private StatisticsRepository statisticsRepository;

    public Map<MBTI, Long> getMbtiCounts() {
        return statisticsRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(Profile::getMbti, Collectors.counting()));
    }
}