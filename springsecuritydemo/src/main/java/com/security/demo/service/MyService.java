package com.security.demo.service;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class MyService {

    private final Random random = new Random();

    @CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "fallbackResponse")
    @Retry(name = "myRetry")
    @RateLimiter(name = "myRateLimiter")
    public String fetchData() {
        if (random.nextBoolean()) {
            throw new RuntimeException("Simulated failure");
        }
        return "Success response";
    }

    public String fallbackResponse(Throwable t) {
        return "Fallback response due to: " + t.getMessage();
    }
}
