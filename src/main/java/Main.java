import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final static Logger LOG  = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        LOG.info("Start main() method from Main class");

        Main main = new Main();

        try {
            main.work();
        } catch (Exception e) {
            LOG.info("Intercept exception:");
            main.exceptionHandler(e);
        }

    }

    void work() throws Exception {

        LOG.debug("run app");

        Support support = new Support();
        support.asdf();
    }

    void exceptionHandler (Exception e) {
        LOG.error(e.toString());
    }

}

