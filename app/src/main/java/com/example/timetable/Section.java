package com.example.timetable;

public class Section {
    int sectionn_id;
    String Abrev_fr;


    public Section(int sectionn_id, String abrev_fr) {
        this.sectionn_id = sectionn_id;
        Abrev_fr = abrev_fr;
    }

    public int getSectionn_id() {
        return sectionn_id;
    }

    public void setSectionn_id(int sectionn_id) {
        this.sectionn_id = sectionn_id;
    }

    public String getAbrev_fr() {
        return Abrev_fr;
    }

    public void setAbrev_fr(String abrev_fr) {
        Abrev_fr = abrev_fr;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionn_id=" + sectionn_id +
                ", Abrev_fr='" + Abrev_fr + '\'' +
                '}';
    }
}
