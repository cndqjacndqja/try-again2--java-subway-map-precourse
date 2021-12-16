package subway.utils.valitor;

import static subway.utils.Constant.*;

import subway.domain.LineRepository;
import subway.domain.Station;

public class LineValidator {
	public static void validateIsExistLine(String lineName) {
		if (LineRepository.isExistByName(lineName)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_PREFIX + "중복된 노선의 이름이 있습니다.");
		}
	}

	public static void validateIsSameStartStationAndEndStation(Station startStation, Station endStation) {
		if (startStation.equals(endStation)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_PREFIX + "상행점 역과 하행점 역이 같습니다.");
		}
	}
}
