package defensiveCopy;

import java.util.Date;

public class PeriodClass {


    private String name;

    private Date joiningDate;

    public PeriodClass(String name, Date joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }

    public String getName(){
        return name;
    }
    public Date getJoiningDate() {
        return joiningDate;
    }

}
