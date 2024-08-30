package model;

import java.util.Comparator;

public class ProcessingComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        if(o1.getProcessingSpeed()>o2.getProcessingSpeed()){
            return 1;
        }
        else if(o1.getProcessingSpeed()<o2.getProcessingSpeed()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
