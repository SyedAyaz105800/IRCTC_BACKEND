package com.irctc.irctc_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    private int trainNumber;
    private String name;
    private String source;
    private String destination;
    private int availableSeats;
}

