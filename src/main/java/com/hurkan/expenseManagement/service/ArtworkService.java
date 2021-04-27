package com.hurkan.expenseManagement.service;

import com.hurkan.expenseManagement.dao.ArtworkRepository;
import com.hurkan.expenseManagement.model.Artwork;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtworkService {

    private final ArtworkRepository artworkRepository;

    public ArtworkService(ArtworkRepository artworkRepository){
        this.artworkRepository = artworkRepository;
    }

    public List<Artwork> getArtworks() {
        return artworkRepository.findAll();
    }

    public void saveArtwork(Artwork artwork) {
        artworkRepository.save(artwork);
    }
}
