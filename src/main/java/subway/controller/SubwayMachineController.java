package subway.controller;

import static subway.view.input.InputView.*;
import static subway.view.output.OutputView.*;

import java.util.Scanner;

import subway.controller.function.SubwayMachineFunction;

public class SubwayMachineController {
	public void run(Scanner scanner) {
		printMainScreen();
		try{
			SubwayMachineFunction subwayMachineFunction = SubwayMachineFunction.findFunction(inputSubwayMainFunction(scanner));
			subwayMachineFunction.apply(scanner);
			if (!subwayMachineFunction.isQuit()) {
				run(scanner);
			}
		}catch (IllegalArgumentException illegalArgumentException) {
			System.out.println(illegalArgumentException.getMessage());
			run(scanner);
		}


	}
}
