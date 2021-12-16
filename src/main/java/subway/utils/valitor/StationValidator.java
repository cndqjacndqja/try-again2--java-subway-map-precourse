package subway.utils.valitor;

import static subway.utils.Constant.*;

import subway.domain.Station;
import subway.domain.StationRepository;

public class StationValidator {
	public static void validateIsExistStation(Station station) {
		if (!StationRepository.isExist(station)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_PREFIX + "해당 역이 존재하지 않습니다.");
		}
	}
}
