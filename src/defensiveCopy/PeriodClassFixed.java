package defensiveCopy;

import java.util.Date;

public class PeriodClassFixed {
    private String name;

    private Date joiningDate;

    public PeriodClassFixed(String name, Date joiningDate) {
        this.name = name;
        this.joiningDate = new Date(joiningDate.getTime());
    }

    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }

    public String getName(){
        return name;
    }
}
