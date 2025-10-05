package com.example.msvc_clients.service;

import com.example.msvc_clients.clients.UserFeignClient;
import com.example.msvc_clients.models.Client;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ClientService {
    private final UserFeignClient userFeignClient;
    private final Random random = new Random();

    public ClientService(UserFeignClient userFeignClient){
        this.userFeignClient = userFeignClient;
    }

    public List<Client> findAll(){
        return userFeignClient.findAll().stream()
                .map(u -> new Client(
                        u.getId(),
                        u.getDni(),
                        u.getNombres(),
                        u.getApellidos(),
                        u.getNombres().toLowerCase() + "." + u.getApellidos().toLowerCase(),
                        "pass" + (1000 + random.nextInt(9000)),
                        u.getPort()
                ))
                .collect(Collectors.toList());
    }
}