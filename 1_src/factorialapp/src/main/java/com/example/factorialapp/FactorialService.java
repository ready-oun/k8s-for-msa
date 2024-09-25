package com.example.factorialapp;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.stream.IntStream;

@Service
public class FactorialService {

    public BigDecimal calculate(int n) {
        // 1부터 n까지의 숫자를 곱하는 연산을 Stream API로 처리
        return IntStream.rangeClosed(1, n) // 1부터 n까지 스트림 생성
                .mapToObj(BigDecimal::valueOf) // 각 숫자를 BigDecimal로 변환
                .reduce(BigDecimal.ONE, BigDecimal::multiply); // 누적 곱셈 수행
    }

//    // n이 1보다 클 때까지 반복
//        for (int i = 2; i <= n; i++) {
//        result = result.multiply(new BigDecimal(i)); // result에 i를 곱함
//    }
//
//        return result; // 최종 결과 반환
}
