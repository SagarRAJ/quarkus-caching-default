package org.self;

import io.quarkus.cache.CacheInvalidate;
import io.quarkus.cache.CacheInvalidateAll;
import io.quarkus.cache.CacheResult;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    @CacheResult(cacheName = "greetings-cache")
    public String getGreeting(String name) {
        System.out.println("Fetching greeting for " + name); // called only once
        return "Hello, " + name + "!";
    }

    @CacheInvalidate(cacheName = "greetings-cache")
    public void clearGreeting(String name) {
        System.out.println("Cache cleared for " + name);
    }

    @CacheInvalidateAll(cacheName = "greetings-cache")
    public void clearAllGreetings() {
        System.out.println("All cache entries cleared");
    }

}
