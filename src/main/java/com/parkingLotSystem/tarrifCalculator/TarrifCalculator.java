package com.parkingLotSystem.tarrifCalculator;

import java.sql.Timestamp;

public interface TarrifCalculator {

    public Double calculateTarrif(Double time, String spotType);
}
