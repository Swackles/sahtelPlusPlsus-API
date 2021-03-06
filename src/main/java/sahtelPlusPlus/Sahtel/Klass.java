package sahtelPlusPlus.Sahtel;

import java.util.Calendar;

public class Klass {
    private Calendar Date;
    private Calendar ClassStart;
    private Calendar ClassEnd;
    private String Group;
    private byte Course;
    private String Name;
    private String Code;
    private String Teacher;
    private String Room;
    private byte Amount;
    private String Description;

    Klass() {
        this.Date = Calendar.getInstance();
        this.ClassStart = Calendar.getInstance();
        this.ClassEnd = Calendar.getInstance();
        this.Group = "";
        this.Name = "";
        this.Code = "";
        this.Teacher = "";
        this.Description = "";

    }

    Klass(Klass klass) {
        this.Date = klass.Date;
        this.ClassStart = klass.ClassStart;
        this.ClassEnd = klass.ClassEnd;
        this.Group = klass.Group;
        this.Course = klass.Course;
        this.Name = klass.Name;
        this.Code = klass.Code;
        this.Teacher = klass.Teacher;
        this.Room = klass.Room;
        this.Amount = klass.Amount;
        this.Description = klass.Description;
    }
    public Calendar getDate() { return Date; }
    void setDate(int year, int month, int day) {
        Date.set(year, month, day);
    }

    public Calendar getClassStart() { return  ClassStart; }
    void setClassStart(int hour, int minute, int seconds) {
        ClassStart.set(Date.get(Calendar.YEAR), Date.get(Calendar.MONTH), Date.get(Calendar.DATE), hour, minute, seconds);
    }

    public Calendar getClassEnd() { return ClassEnd; }
    void setClassEnd(int hour, int minute, int seconds) {
        ClassStart.set(Date.get(Calendar.YEAR), Date.get(Calendar.MONTH), Date.get(Calendar.DATE), hour, minute, seconds);
    }

    public String getGroup() { return Group; }
    void setGroup(String group) {
        Group = group;
    }

    public byte getCourse() { return Course; }
    void setCourse(byte course) {
        Course = course;
    }

    public String getName() { return Name; }
    void setName(String name) {
        Name = name;
    }

    public String getCode() { return Code; }
    void setCode(String code) {
        Code = code;
    }

    public String getTeacher() { return Teacher; }
    void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public String getRoom() { return Room; }
    void setRoom(String room) {
        Room = room;
    }

    public byte getAmount() { return Amount; }
    void setAmount(byte amount) {
        Amount = amount;
    }

    public String getDescription() { return Description; }
    void setDescription(String description) {
        Description = description;
    }
}
