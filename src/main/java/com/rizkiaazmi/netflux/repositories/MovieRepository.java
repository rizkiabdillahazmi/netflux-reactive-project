package com.rizkiaazmi.netflux.repositories;

import com.rizkiaazmi.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {

}
