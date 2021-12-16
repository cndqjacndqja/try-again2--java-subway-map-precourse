package subway.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Line {
    private String name;
    private List<Station> stationList = new LinkedList<>();

    public Line(String name, Station startStation, Station endStation) {
        this.name = name;
        stationList.add(startStation);
        stationList.add(endStation);
    }

    public String getName() {
        return name;
    }


    public void addSection(Station station, int sequenceNumber) {
        stationList.add(sequenceNumber, station);
    }

    public boolean isSameName(String lineName) {
        return name.equals(lineName);
    }

    public void deleteSection(Station station) {
        stationList.remove(station);
    }
}
