package immobilier.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maison extends Propriete {

    @Override
    public Map<String, String> attributsSpecifiques() {
        return new LinkedHashMap<>();
    }
}
