package com.example.msvc_clients.clients;

import com.example.msvc_clients.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "msvc-users")
public interface UserFeignClient {
    @GetMapping("/api/users")
    List<User> findAll();
}