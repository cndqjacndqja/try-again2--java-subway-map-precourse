package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    static {
        lines.add(new Line("2호선", new Station("교대역"), new Station("역삼역")));
        lines.add(new Line("3호선", new Station("교대역"), new Station("매봉역")));
        lines.add(new Line("신분당선", new Station("강남역"), new Station("양재시민의숲역")));

        addSection("2호선", new Station("강남역"), 1);
        addSection("3호선", new Station("남부터미널역"), 1);
        addSection("3호선", new Station("양재역"), 2);
        addSection("신분당선", new Station("양재역"), 1);
    }

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static void addSection(String lineName, Station station, int sequenceNumber) {
        Line line = findLineByName(lineName);
        line.addSection(station, sequenceNumber);
    }

    private static Line findLineByName(String lineName) {
        return lines.stream()
            .filter(lineOfLines -> lineOfLines.isSameName(lineName))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("노선의 이름이 존재하지 않습니다."));
    }

    public static void deleteSection(String lineName, Station station) {
        Line line = findLineByName(lineName);
        line.deleteSection(station);
    }

    public static boolean isExistByName(String lineName) {
        for (Line line: lines) {
            if (line.isSameName(lineName)) {
                return true;
            }
        }
        return false;
    }

    public static String getToString() {
        StringBuilder stringBuilder = new StringBuilder();
        lines().forEach(line -> stringBuilder.append(line.toString()));
        return stringBuilder.toString();
    }
}
