package com.hurkan.expenseManagement.config;

import com.hurkan.expenseManagement.dao.ArtworkRepository;
import com.hurkan.expenseManagement.model.Artwork;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ArtworkConfig {

    @Bean
    CommandLineRunner commandLineRunner(ArtworkRepository repository){
        return args ->{
            Artwork artwork1 = new Artwork(
                    "BSTR",
                    "Henrik Olesen",
                    "Untitled, 2003/2008",
                    "Computer Collage",
                    "19 x 14 cm (framed 33 x 24 cm)",
                    "Galerie Buchholz, Köln",
                    LocalDate.of(
                            2011,
                            Month.NOVEMBER,
                            28
                    ),
                    1121.5,
                    78.5,
                    0.0,
                    0.0,
                    "Dropbox Link"
            );
            Artwork artwork2 = new Artwork(
                    "BSTR",
                    "Ding Yi",
                    "Appearance of Crosses, 2008",
                    "Edition 26/30",
                    "57 x 76 cm",
                    "ShanghART Gallery, Shanghai",
                    LocalDate.of(
                            2011,
                            Month.APRIL,
                            12
                    ),
                    1002.25,
                    0.0,
                    0.0,
                    0.0,
                    "Dropbox Link"
            );
            Artwork artwork3 = new Artwork(
                    "BSTR",
                    "Ralph Gelbert",
                    "Polarnacht",
                    "Ditychon signed reverso 2 pieces",
                    "24 x 60 cm",
                    "Atelierhaus Königsbach, Neustadt",
                    LocalDate.of(
                            2011,
                            Month.DECEMBER,
                            11
                    ),
                    1308.48,
                    91.58,
                    0.0,
                    0.0,
                    "Dropbox Link"
            );
            repository.saveAll(
              List.of(artwork1, artwork2, artwork3)
            );
        };
    }
}
