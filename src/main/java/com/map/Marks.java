package com.map;

public class Marks {
    private Integer theMark;
    private String subject;
    private String typeOfMark;

    Marks(Integer theMark, String subject, String typeOfMark) {
        this.theMark = theMark;
        this.subject = subject;
        this.typeOfMark = typeOfMark;
    }

    public Integer getTheMark() {
        return theMark;
    }

    public String getSubject() {
        return subject;
    }

    public String getTypeOfMark() {
        return typeOfMark;
    }
}