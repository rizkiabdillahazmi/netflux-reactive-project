package com.rizkiaazmi.netflux.services;

import com.rizkiaazmi.netflux.domain.Movie;
import com.rizkiaazmi.netflux.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
public interface MovieService {
    Mono<Movie> getMovieById(String id);

    Flux<Movie> getAllMovies();

    Flux<MovieEvent> streamMovieEvents(String id);
}
