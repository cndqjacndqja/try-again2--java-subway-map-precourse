package subway.utils.valitor;

import static subway.utils.Constant.*;

import subway.domain.LineRepository;

public class LineValidator {
	public static void validateIsExistLine(String lineName) {
		if (LineRepository.isExistByName(lineName)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_PREFIX + "중복된 노선의 이름이 있습니다.");
		}
	}
}
