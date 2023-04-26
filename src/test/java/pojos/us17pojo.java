package pojos;

import java.util.LinkedHashMap;
import java.util.Map;

public class us17pojo {
    /*
    object": {
        "id": 2,
        "midtermExam": 55.0,
        "finalExam": 65.0,
        "absentee": 5,
        "infoNote": "iyi gidiyorsun",
        "lessonName": "yeniapideneme",
        "creditScore": 3,
        "educationTerm": "SPRING_SEMESTER",
        "average": 61.0,
        "studentResponse": {
            "userId": 1,
            "username": "idil03",
            "name": "idil",
            "surname": "Bksgn",
            "birthDay": "2007-01-01",
            "birthPlace": "istanbul",
            "phoneNumber": "532-123-5500",
            "gender": "FEMALE",
            "studentNumber": 1000,
            "motherName": "Nihal",
            "fatherName": "hakan",
            "email": "idil@hotmail.com",
            "active": true
        },
        "compulsory": true,
        "note": "CC"
    },
    "message": "Student Info updated Successfully",
    "httpStatus": "CREATED"
}
     */


    private Integer id;
    private Double midtermExam;
    private Double finalExam;
    private Integer absentee;
    private String infoNote;
    private String lessonName;
    private Integer creditScore;
    private String educationTerm;
    private Double average;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public us17pojo() {
    }

    public us17pojo(int i, int i1, int i2, String derslerine_cok_calismali, int i3, int i4, int i5) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(Double midtermExam) {
        this.midtermExam = midtermExam;
    }

    public Double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(Double finalExam) {
        this.finalExam = finalExam;
    }

    public Integer getAbsentee() {
        return absentee;
    }

    public void setAbsentee(Integer absentee) {
        this.absentee = absentee;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getEducationTerm() {
        return educationTerm;
    }

    public void setEducationTerm(String educationTerm) {
        this.educationTerm = educationTerm;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "us17{" +
                "id=" + id +
                ", midtermExam=" + midtermExam +
                ", finalExam=" + finalExam +
                ", absentee=" + absentee +
                ", infoNote='" + infoNote + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", educationTerm='" + educationTerm + '\'' +
                ", average=" + average +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
