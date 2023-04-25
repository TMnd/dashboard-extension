package amaral.pt.speeddial.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
    List<Dial> dialList;

    public Result() {
        this.dialList = new ArrayList<>();
    }

    public Result(List<Dial> dialList) {
        this.dialList = dialList;
    }

    public List<Dial> getDialList() {
        return dialList;
    }

    public void setDialList(List<Dial> dialList) {
        this.dialList = dialList;
    }
}
