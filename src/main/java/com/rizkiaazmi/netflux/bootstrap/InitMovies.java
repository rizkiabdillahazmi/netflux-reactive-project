package com.rizkiaazmi.netflux.bootstrap;

import com.rizkiaazmi.netflux.domain.Movie;
import com.rizkiaazmi.netflux.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
@RequiredArgsConstructor
@Component
public class InitMovies implements CommandLineRunner {
    private final MovieRepository movieRepository;
    @Override
    public void run(String... args) throws Exception {
        movieRepository.deleteAll()
                .thenMany(Flux.just("Silence of The Lambdas", "AEon Flux", "Enter The Mono<Void>", "The Fluxinator",
                        "Back to The future", "Meet the Fluxes")
                        .map(Movie::new)
                        .flatMap(movieRepository::save)
                ).subscribe(null, null, ()->{
                    movieRepository.findAll().subscribe(System.out::println);
                });
    }
}
