package model;

import java.util.Arrays;
import java.util.Comparator;

public class ComputerSale {

    public Computer[] comps;

    public ProcessingComparator pc;

    public ComputerSale() {
        this.pc = new ProcessingComparator();
        this.comps = new Computer[10];
        comps[0] = new Computer("Dell",8,16,5.8,'W');
        comps[1] = new Computer("HP",16,8,6.3,'W');
        comps[2] = new Computer("Lenovo",4,12,3.3,'W');
        comps[3] = new Computer("Apple",4,8,14.5,'I');
        comps[4] = new Computer("HP",16,4,16.9,'W');
        comps[5] = new Computer("AlienWare",64,32,2.0,'W');
        comps[6] = new Computer("ASUS",32,64,3.3,'W');
        comps[7] = new Computer("Apple",2,16,20.0,'I');
        comps[8] = new Computer("Lenovo",6,128,18.2,'W');
        comps[9] = new Computer("Dell",16,64,5.8,'W');
    }

    public Computer[] getComps() {
        return comps;
    }

    public void addComputer(String brand, int ram, int processors, double processingSpeed, char operatingSystem){
        Computer comp = new Computer(brand, ram, processors, processingSpeed, operatingSystem);
        boolean flag = false;
        for(int i=0; i<comps.length && flag==false; i++){
            if(comps[i]==null){
                comps[i] = comp;
                flag = true;
            }
        }
    }

    public void sortByBrand(){
        for(int i=1; i<comps.length;i++){
            int j = i-1;
            while( j>=0 && (comps[j].compareTo(comps[i]) == 1)){
                comps[j+1] = comps[j];
                j = j-1;
            }
            comps[j+1]=comps[i];
        }
    }

    public void sortByRam(){
        Arrays.sort(comps,computerComparator);
    }

    Comparator<Computer> computerComparator = new Comparator<Computer>() {
        @Override
        public int compare(Computer o1, Computer o2) {
            if(o1.getRam()>o2.getRam()){
                return 1;
            }
            else if(o1.getRam()<o2.getRam()){
                return -1;
            }
            else{
                return 0;
            }
        }
    };

    public void sortByProcessing(){
        Arrays.sort(comps,pc);
    }

    public String showBrands(){
        String msg = "";
        for (int i = 0; i < comps.length; i++) {
            msg += comps[i].getBrand() + "\n";
        }
        return msg;
    }

    public String showRam(){
        String msg = "";
        for (int i = 0; i < comps.length; i++) {
            msg += comps[i].getRam() + "\n";
        }
        return msg;
    }

    public String showProcessing(){
        String msg = "";
        for (int i = 0; i < comps.length; i++) {
            msg += comps[i].getProcessingSpeed() + "\n";
        }
        return msg;
    }
}
