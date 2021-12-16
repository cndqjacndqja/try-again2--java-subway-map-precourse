package subway.controller;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Scanner;

import subway.controller.function.LineFunction;

public class LineController {
	public void run(Scanner scanner) {
		printLineScreen();
		try{
			LineFunction lineFunction = LineFunction.findFunction(inputLineFunction(scanner));
			lineFunction.apply(scanner);
		}catch (IllegalArgumentException illegalArgumentException) {
			System.out.println(illegalArgumentException.getMessage());
			run(scanner);
		}
	}
}
