package kodlamaioDemos.core.concretes;

import kodlamaioDemos.core.abstracts.ILogger;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı: " + data);

	}

}
