package subway.controller.function;

import java.util.Scanner;

public enum SectionFunction {
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
