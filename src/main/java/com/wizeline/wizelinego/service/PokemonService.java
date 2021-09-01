package com.wizeline.wizelinego.service;

import com.wizeline.wizelinego.repository.PokemonAPIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private PokemonAPIRepository pokemonAPIRepository;

    @Autowired
    public PokemonService(PokemonAPIRepository pokemonAPIRepository){
        this.pokemonAPIRepository = pokemonAPIRepository;
    }

    public ResponseEntity<String> getPokemons(int limit, int offset){
        return pokemonAPIRepository.getPokemons(limit, offset);
    }

    public ResponseEntity<String> getPokemon(String name){
        return pokemonAPIRepository.getPokemon(name);
    }

    public ResponseEntity<String> getPokemon(int pokemonId){
        return pokemonAPIRepository.getPokemon(pokemonId);
    }

    public ResponseEntity<String> getByAbility(int ability){
        return pokemonAPIRepository.getByAbility(ability);
    }

    public ResponseEntity<String> getByType(int type){
        return pokemonAPIRepository.getByType(type);
    }

}
