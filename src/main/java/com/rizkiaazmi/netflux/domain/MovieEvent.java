package com.rizkiaazmi.netflux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
@Data
@AllArgsConstructor
public class MovieEvent {
    private String movieId;
    private Date movieDate;
}
