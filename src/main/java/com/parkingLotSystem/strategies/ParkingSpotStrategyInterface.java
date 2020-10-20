package com.parkingLotSystem.strategies;

import com.parkingLotSystem.parkingSpots.ParkingSpot;
import com.parkingLotSystem.terminals.Terminal;

public interface ParkingSpotStrategyInterface {

    public ParkingSpot getParkingSpot(Terminal terminal);
    public void releaseParkingSpot(ParkingSpot parkingSpot);
}
