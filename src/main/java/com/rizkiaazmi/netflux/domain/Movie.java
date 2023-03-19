package com.rizkiaazmi.netflux.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    private String id;
    @NonNull
    private String title;
}
