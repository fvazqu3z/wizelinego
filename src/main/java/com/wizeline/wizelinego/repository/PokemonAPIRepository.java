package com.wizeline.wizelinego.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class PokemonAPIRepository {

    @Autowired
    private RestTemplate restTemplate;
    private final String server = "https://pokeapi.co/api/v2";

    public ResponseEntity<String> getPokemons(int limit, int offset){
        ResponseEntity<String> result =
                restTemplate.getForEntity(
                        server + "/pokemon?limit=" + limit + "&offset=" + offset,
                        String.class);
        return result;
    }

    public ResponseEntity<String> getPokemon(String name){
        ResponseEntity<String> result =
                restTemplate.getForEntity(
                        server + "/pokemon/" + name,
                        String.class);
        return result;
    }

    public ResponseEntity<String> getPokemon(int pokemonId){
        ResponseEntity<String> result =
                restTemplate.getForEntity(
                        server + "/pokemon/" + pokemonId,
                        String.class);
        return result;
    }


    public ResponseEntity<String> getByType(int type){
        ResponseEntity<String> result =
                restTemplate.getForEntity(
                        server + "/type/" + type,
                        String.class);
        return result;
    }


    public ResponseEntity<String> getByAbility(int ability){
        ResponseEntity<String> result =
                restTemplate.getForEntity(
                        server + "/ability/" + ability,
                        String.class);
        return result;
    }
}
