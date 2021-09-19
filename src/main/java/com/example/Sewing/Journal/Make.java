package com.example.Sewing.Journal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Make {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String date;
    private String designer;
    private String pattern;
    private String style;
    private String size;
    private String bust;
    private String waist;
    private String hips;
    private String notes;

    public Make() {}

    public Make( String date, String designer, String pattern, String style, String size, String bust, String waist, String hips, String notes) {
        this.date = date;
        this.designer = designer;
        this.pattern = pattern;
        this.style = style;
        this.size = size;
        this.bust = bust;
        this.waist = waist;
        this.hips = hips;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBust() {
        return bust;
    }

    public void setBust(String bust) {
        this.bust = bust;
    }

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getHips() {
        return hips;
    }

    public void setHips(String hips) {
        this.hips = hips;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


}
