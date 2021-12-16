package subway.controller.function;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

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
			printFinishSectionRegister();
		}
	},
	DELETE("2") {
		@Override
		void function(Scanner scanner) {
			String lineName = inputLineNameForDeleteSection(scanner);
			String stationName = inputStationNameForDeleteSection(scanner);
			LineRepository.deleteSection(lineName, new Station(stationName));
			printFinishDeleteSection();
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
