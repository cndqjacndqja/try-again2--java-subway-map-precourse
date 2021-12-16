package subway.controller.function;

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
			Station startStation = new Station(inputStartStationForLineRegister(scanner));
			Station endStation = new Station(inputEndStationForLineRegister(scanner));
			LineRepository.addLine(new Line(lineName, startStation, endStation));
			printFinishLineRegister();
		}
	},
	DELETE("2") {
		@Override
		void function(Scanner scanner) {
			LineRepository.deleteLineByName(inputLineNameForDeleteLine(scanner));
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
			.orElseThrow(() -> new IllegalArgumentException("입력한 기능은 메뉴에 없습니다."));
	}

	public void apply(Scanner scanner) {
		function(scanner);
	}
}
