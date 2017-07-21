package demo.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 齐琪 on 2017/7/20.
 */
public class Log4jTest {

    private static Logger logger = LoggerFactory.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.trace("trace...");
        logger.debug("debug...");
        logger.info("info...");
        logger.warn("warn...");
        logger.error("error...");
    }
}
