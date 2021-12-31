package src.com.fightright.config.common;

import java.util.concurrent.ThreadLocalRandom;

public class CommonUtility {

	public static String getmyFrUUID() {
		String uuid = "UUID";
		int min = 1000;
		int max = 9999;
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return uuid + randomNum;
	}
}
