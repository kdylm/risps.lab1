package models;

public class Faculty {
    private int id;
    private String nameFaculty;
    private String shortNameFaculty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getShortNameFaculty() {
        return shortNameFaculty;
    }

    public void setShortNameFaculty(String shortNameFaculty) {
        this.shortNameFaculty = shortNameFaculty;
    }
}