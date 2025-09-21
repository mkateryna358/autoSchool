package com.task7.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class LoggingPractice {

    private static final Logger logger = LogManager.getLogger(LoggingPractice.class);

    private int number1() {
        logger.info("private method called");
        Random random = new Random();
        int secretNumber = random.nextInt(10 + 1);
        return secretNumber;
    }

    public int summa(int number2) {
        logger.info("public method called");
        return number1() + number2;

    }
}
