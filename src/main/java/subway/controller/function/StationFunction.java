package subway.controller.function;

import java.util.Arrays;

public enum StationFunction {
	REGISTER("1") {
		@Override
		void function() {

		}
	},
	DELETE("2") {
		@Override
		void function() {

		}
	},
	FIND("3") {
		@Override
		void function() {

		}
	},
	BACK("B") {
		@Override
		void function() {

		}
	},
	;

	private String command;

	abstract void function();

	StationFunction(String command) {
		this.command = command;
	}

	public StationFunction findFunction(String command) {
		return Arrays.stream(values())
			.filter(function -> function.command.equals(command))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("입력한 기능은 메뉴에 없습니다."));
	}
}
