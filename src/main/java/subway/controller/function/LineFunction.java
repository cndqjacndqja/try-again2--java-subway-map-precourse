package subway.controller.function;

import java.util.Arrays;
import java.util.Scanner;

public enum LineFunction {
	REGISTER("1") {
		@Override
		void function(Scanner scanner) {

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
