package com.podzirei.springboottutorialmasterclass;

public class Doctor implements Staff{

    private String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }
//    private Nurse nurse;
//
//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void assist(){
        System.out.println("doctor assists");
    }
}
