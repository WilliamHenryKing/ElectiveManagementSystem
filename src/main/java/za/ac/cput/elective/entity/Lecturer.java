package za.ac.cput.elective.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author @WilliamHenryKing
 * Desc: Entity for Lecturer
 * Date: 2020/07/05
 **/

@Entity
public class Lecturer {

    @Id
    private long lecturerID;

    private String lecturerLName;
    private String lecturerFName;
    private Gender gender;

    protected Lecturer() {}

    private Lecturer(Builder builder) {
        this.lecturerID = builder.lecturerID;
        this.lecturerLName = builder.lecturerLName;
        this.lecturerFName = builder.lecturerFName;
        this.gender = builder.gender;
    }

    public long getLecturerID() {
        return lecturerID;
    }

    public String getLecturerLName() {
        return lecturerLName;
    }

    public String getLecturerFName() {
        return lecturerFName;
    }

    public Gender getGender() {
        return gender;
    }


    public static class Builder {
        private long lecturerID;
        private String lecturerLName;
        private String lecturerFName;
        private Gender gender;

        public Builder setLecturerID(long lecturerID) {
            this.lecturerID = lecturerID;
            return this;
        }

        public Builder setLecturerLName(String lecturerLName) {
            this.lecturerLName = lecturerLName;
            return this;
        }

        public Builder setLecturerFName(String lecturerFName) {
            this.lecturerFName = lecturerFName;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder copy(Lecturer lecturer) {
            this.lecturerID = lecturer.lecturerID;
            this.lecturerLName = lecturer.lecturerLName;
            this.lecturerFName = lecturer.lecturerFName;
            this.gender = lecturer.gender;
            return this;
        }

        public Lecturer build() {
            return new Lecturer(this);
        }
    }

    @Override
    public String toString() {
        return "Lecturer" +
                "\nLecturerID: " + lecturerID +
                "\nLecturerLName: " + lecturerLName +
                "\nLecturerFName: " + lecturerFName
                + "\nGender: " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecturer lecturer = (Lecturer) o;
        return lecturerID == lecturer.lecturerID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lecturerID);
    }
}
