package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private ArrayList<HealthcareServiceable> team ;

    public HealthcareWorkerTeam() {
        this.team = new ArrayList<HealthcareServiceable>();
    }

    public void addMember(HealthcareServiceable worker){
        team.add(worker);
    }
    public  void  removeMember(HealthcareWorker worker){
        team.remove(worker);
    }

    @Override
    public void service(){
        for (HealthcareServiceable w: team) {
            w.service();
        }
    }
    @Override
    public double getPrice(){
        double sum =0;
        for (HealthcareServiceable w:  team) {
            sum += w.getPrice();
        }
        return  sum;
    }
}
