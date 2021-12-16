package subway.domain;

import java.util.LinkedList;
import java.util.List;

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

    // 추가 기능 구현
}
