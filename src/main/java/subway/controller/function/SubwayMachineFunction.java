package subway.controller.function;

import java.util.Arrays;
import java.util.Scanner;

import subway.controller.LineController;
import subway.controller.SectionController;
import subway.controller.StationController;

public enum SubwayMachineFunction {
	STATION_MANAGEMENT("1") {
		@Override
		void function(Scanner scanner) {
			StationController stationController = new StationController();
			stationController.run(scanner);
		}
	},
	LINE_MANAGEMENT("2") {
		@Override
		void function(Scanner scanner) {
			LineController lineController = new LineController();
			lineController.run(scanner);
		}
	},
	SECTION_MANAGEMENT("3") {
		@Override
		void function(Scanner scanner) {
			SectionController sectionController = new SectionController();
			sectionController.run(scanner);
		}
	},
	PRINT_SUBWAY_MAP("4") {
		@Override
		void function(Scanner scanner) {

		}
	},
	QUIT("Q") {
		@Override
		void function(Scanner scanner) {

		}
	},
	;

	private String command;
	abstract void function(Scanner scanner);

	SubwayMachineFunction(String command) {
		this.command = command;
	}

	public static SubwayMachineFunction findFunction(String command) {
		return Arrays.stream(values())
			.filter(function -> function.command.equals(command))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("입력한 기능은 메뉴에 없습니다."));
	}

	public void apply(Scanner scanner) {
		function(scanner);
	}

	public boolean isQuit() {
		return this == QUIT;
	}
}
