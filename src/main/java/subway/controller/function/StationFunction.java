package subway.controller.function;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Arrays;
import java.util.Scanner;

import subway.domain.Station;
import subway.domain.StationRepository;

public enum StationFunction {
	REGISTER("1") {
		@Override
		void function(Scanner scanner) {
			StationRepository.addStation(new Station(inputRegisterStation(scanner)));
			finishRegisterStation();
		}
	},
	DELETE("2") {
		@Override
		void function(Scanner scanner) {

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

	StationFunction(String command) {
		this.command = command;
	}

	public static StationFunction findFunction(String command) {
		return Arrays.stream(values())
			.filter(function -> function.command.equals(command))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("입력한 기능은 메뉴에 없습니다."));
	}

	public void apply(Scanner scanner) {
		function(scanner);
	}
}
