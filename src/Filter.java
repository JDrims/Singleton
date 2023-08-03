import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = source.stream()
                .peek(x -> logger.log("Элемент " + x + ((x >= this.treshold) ? " проходит" : " не проходит")))
                .filter(x -> x >= this.treshold)
                .collect(Collectors.toList());
        return result;
    }
}