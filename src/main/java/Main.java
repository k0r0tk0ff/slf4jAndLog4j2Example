import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    Logger log  = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Main main = new Main();

        try {
            main.work();
        } catch (Exception e) {
            main.exceptionHandler(e);
        }

    }

    void work() throws Exception {

        log.debug("run app");

        Support support = new Support();
        support.asdf();
    }

    void exceptionHandler (Exception e) {
        log.error(e.toString());
    }

}

