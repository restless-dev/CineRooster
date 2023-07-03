package com.reviewrooster.CineRooster;

// (OPTIONAL FOR LOGGING)
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movies")
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String trailerLink;
    private String cover;
    private List<String> backdrops;

    public Movie(String imdbId, String title, String trailerLink, String cover, List<String> backdrops) {
        this.imdbId = imdbId;
        this.title = title;
        this.trailerLink = trailerLink;
        this.cover = cover;
        this.backdrops = backdrops;
    }
}

