package com.irctc.irctc_backend.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irctc.irctc_backend.model.Train;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrainDAO {
    private static final String TRAIN_FILE = "trains.json";
    private ObjectMapper objectMapper = new ObjectMapper();

    // Fetch all trains
    public List<Train> getAllTrains() {
        File file = new File(TRAIN_FILE);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>(); // Return empty list if file is missing or empty
        }

        try {
            return objectMapper.readValue(file, new TypeReference<List<Train>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Save all trains to file
    public void saveAllTrains(List<Train> trains) {
        try {
            objectMapper.writeValue(new File(TRAIN_FILE), trains);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Add a new train
    public void addTrain(Train train) {
        List<Train> trains = getAllTrains();
        trains.add(train);
        saveAllTrains(trains);
    }
}
