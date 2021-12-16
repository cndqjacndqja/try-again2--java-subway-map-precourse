package subway.controller.function;

import java.util.Arrays;

public enum SubwayMachineFunction {
	STATION_MANAGEMENT("1") {
		@Override
		void function() {

		}
	},
	LINE_MANAGEMENT("2") {
		@Override
		void function() {

		}
	},
	SECTION_MANAGEMENT("3") {
		@Override
		void function() {

		}
	},
	PRINT_SUBWAY_MAP("4") {
		@Override
		void function() {

		}
	},
	QUIT("Q") {
		@Override
		void function() {

		}
	},
	;

	private String command;
	abstract void function();

	SubwayMachineFunction(String command) {
		this.command = command;
	}

	public SubwayMachineFunction findFunction(String command) {
		return Arrays.stream(values())
			.filter(function -> function.command.equals(command))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("입력한 기능은 메뉴에 없습니다."));
	}
}
