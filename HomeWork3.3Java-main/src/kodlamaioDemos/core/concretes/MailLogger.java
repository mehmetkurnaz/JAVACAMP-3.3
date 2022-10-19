package kodlamaioDemos.core.concretes;

import kodlamaioDemos.core.abstracts.ILogger;

public class MailLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Mail loglandı : " + data);

	}

}
