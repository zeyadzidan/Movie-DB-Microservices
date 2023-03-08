package com.example.ratingsservice.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
public class Rating {
    private String movieId;
    private int rating;
}