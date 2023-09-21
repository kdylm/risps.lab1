package models;

import javafx.application.Application;
import javafx.stage.Stage;
import models.Curriculum;
import models.Discipline;
import models.Chair;
import models.Faculty;

public class CurriculumApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Curriculum curriculum = new Curriculum();
        Discipline discipline = new Discipline();
        Chair chair = new Chair();
        Faculty faculty = new Faculty();

        curriculum.addDiscipline(new Discipline() {
            {
                setIdCurriculum(curriculum.getId());
                setNameDiscipline("Новая дисциплина");
                setCourse(1);
                setSemester(1);
                setLecture(10);
                setLaboratory(5);
                setPractical(8);
                setExamen(true);
                setSetOff(false);
            }
        });

        primaryStage.close();
    }
}