package subway.controller.function;

import static subway.utils.Constant.*;
import static subway.utils.valitor.LineValidator.*;
import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Arrays;
import java.util.Scanner;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;

public enum LineFunction {
	REGISTER("1") {
		@Override
		void function(Scanner scanner) {
			String lineName = inputLineNameForLineRegister(scanner);
			validateIsExistLine(lineName);
			Station startStation = new Station(inputStartStationForLineRegister(scanner));
			Station endStation = new Station(inputEndStationForLineRegister(scanner));
			validateIsSameStartStationAndEndStation(startStation, endStation);
			LineRepository.addLine(new Line(lineName, startStation, endStation));
			printFinishLineRegister();
		}
	},
	DELETE("2") {
		@Override
		void function(Scanner scanner) {
			String lineName = inputLineNameForDeleteLine(scanner);
			LineRepository.deleteLineByName(lineName);
			validateIsNotExistLine(lineName);
			printFinishLineDelete();
		}
	},
	FIND("3") {
		@Override
		void function(Scanner scanner) {

		}
	},
	BACK("B") {
		@Override
		void function(Scanner scanner) {

		}
	},
	;

	private String command;
	abstract void function(Scanner scanner);

	LineFunction(String command) {
		this.command = command;
	}

	public static LineFunction findFunction(String command) {
		return Arrays.stream(values())
			.filter(function -> function.command.equals(command))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException(ERROR_MESSAGE_PREFIX + "입력한 기능은 메뉴에 없습니다."));
	}

	public void apply(Scanner scanner) {
		function(scanner);
	}
}
