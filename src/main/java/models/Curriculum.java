package models;
import java.util.ArrayList;
import java.util.List;

public class Curriculum {
    private int id;
    private String academicYear;
    private String speciality;
    private String qualification;
    private String formEducation;
    private String nameCurriculum;
    private int course;

    private List<Discipline> disciplineList = new ArrayList<>();

    public void addDiscipline(Discipline discipline) {
        disciplineList.add(discipline);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getFormEducation() {
        return formEducation;
    }

    public void setFormEducation(String formEducation) {
        this.formEducation = formEducation;
    }

    public String getNameCurriculum() {
        return nameCurriculum;
    }

    public void setNameCurriculum(String nameCurriculum) {
        this.nameCurriculum = nameCurriculum;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
