package subway.controller;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Scanner;

import subway.controller.function.SectionFunction;

public class SectionController {
	public void run(Scanner scanner) {
		printSectionScreen();
		try{
			SectionFunction sectionFunction = SectionFunction.findFunction(inputLineFunction(scanner));
			sectionFunction.apply(scanner);
		}catch (IllegalArgumentException illegalArgumentException) {
			System.out.println(illegalArgumentException.getMessage());
			run(scanner);
		}
	}
}
