package subway.controller.function;

import static subway.view.input.InputView.*;

import java.util.Scanner;

import subway.domain.LineRepository;
import subway.domain.Station;

public enum SectionFunction {
	REGISTER("1") {
		@Override
		void function(Scanner scanner) {
			String lineName = inputLineNameForSectionRegister(scanner);
			String stationName = inputStationNameForSectionRegister(scanner);
			int sequenceNumber = inputSequenceNumberForSectionRegister(scanner);
			LineRepository.addSection(lineName, new Station(stationName), sequenceNumber);

		}
	},
	DELETE("2") {
		@Override
		void function(Scanner scanner) {

		}
	},
	BACK("BACK") {
		@Override
		void function(Scanner scanner) {

		}
	};

	private String command;
	abstract void function(Scanner scanner);

	SectionFunction(String command) {
		this.command = command;
	}
}
