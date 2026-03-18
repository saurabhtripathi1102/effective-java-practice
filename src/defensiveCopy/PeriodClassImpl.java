package defensiveCopy;

import java.time.Instant;
import java.util.Date;

public class PeriodClassImpl {

    public static void main(String[] args) {

        System.out.println("Date with defensive copy");
        defectiveCopy();
        System.out.println("======================");
        defectiveCopy_Fixed();
    }

    public static void defectiveCopy(){
        Date dt = new Date();
        PeriodClass pc = new PeriodClass("Saurabh",dt);

        dt.setTime(0);

        System.out.println(pc.getJoiningDate());

        dt.setTime(1000);

        System.out.println(pc.getJoiningDate());
    }

    public static void defectiveCopy_Fixed(){
        Date dt = new Date();
        PeriodClassFixed pc = new PeriodClassFixed("Saurabh", dt);

        dt.setTime(0);

        System.out.println("Employee Joining date"+pc.getJoiningDate());

        Date dt1 = pc.getJoiningDate();
        dt1.setTime(1000);

        System.out.println(" Emp joining Date after modification "+pc.getJoiningDate());
    }
}
