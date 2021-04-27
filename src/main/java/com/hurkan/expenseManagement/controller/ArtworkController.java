package com.hurkan.expenseManagement.controller;

import com.hurkan.expenseManagement.model.Artwork;
import com.hurkan.expenseManagement.service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/artwork")
public class ArtworkController {

    private final ArtworkService artworkService;

    @Autowired
    public ArtworkController(ArtworkService artworkService){
        this.artworkService = artworkService;
    }

    @GetMapping//Return all Artworks
    public List<Artwork> getArtworks(){
        return artworkService.getArtworks();
    }

    @PostMapping
    public void saveArtwork(Artwork artwork){
        artworkService.saveArtwork(artwork);
    }
}
