package br.com.poo.balanco;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Util {

	private static Logger logger = Logger.getLogger(Util.class.getName());

	private Util() {
		throw new IllegalStateException(Util.class.getName());
	}

	public static Logger setupLogger() {
		logger.setUseParentHandlers(false);

		ConsoleHandler customHandler = new ConsoleHandler();

		customHandler.setFormatter(new Formatter() {
			@Override
			public String format(LogRecord rec) {
				return rec.getMessage() + "\n";
			}
		});

		logger.addHandler(customHandler);

		return logger;
	}

	public static void customizer() {
		if (logger.getHandlers().length > 1) {
			for (Handler log : logger.getHandlers()) {
				logger.removeHandler(log);
				if (logger.getHandlers().length == 1) {
					break;
				}
			}
		}
	}
}
