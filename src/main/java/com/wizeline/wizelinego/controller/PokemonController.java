package com.wizeline.wizelinego.controller;

import com.wizeline.wizelinego.model.Customer;
import com.wizeline.wizelinego.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping(value="/pokemons/limit/{limit}/offset/{offset}")
    public ResponseEntity<String> findAll(@PathVariable("limit") int limit,@PathVariable("offset") int offset ){
        return pokemonService.getPokemons(limit, offset);
    }

    @GetMapping(value="/pokemon/{name}")
    public ResponseEntity<String> pokemon(@PathVariable String name){
        return pokemonService.getPokemon(name);
    }

    @GetMapping(value="/pokemon/pokemonId/{pokemonId}")
    public ResponseEntity<String> pokemon(@PathVariable int pokemonId){
        return pokemonService.getPokemon(pokemonId);
    }

    @GetMapping(value="/ability/{ability}")
    public ResponseEntity<String> ability(@PathVariable("ability") int ability){
        return pokemonService.getByAbility(ability);
    }

    @GetMapping(value="/type/{type}")
    public ResponseEntity<String> type(@PathVariable("type") int type){
        return pokemonService.getByType(type);
    }
}
