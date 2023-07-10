package br.com.andersonchoren.car_location.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @GetMapping
    public List<ClientDto> findAll(){
        return null;
    }

    @PostMapping
    public ClientDto insert(@RequestBody ClientDto client){
        return null;
    }

    @PutMapping
    public ClientDto update(@RequestBody ClientDto client){
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int codigo){
        return null;
    }

    @GetMapping("/{id}")
    public ClientDto findById(@PathVariable("id") int codigo){
        return null;
    }
}
