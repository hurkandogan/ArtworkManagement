package com.hurkan.expenseManagement.dao;

import com.hurkan.expenseManagement.model.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {
}
