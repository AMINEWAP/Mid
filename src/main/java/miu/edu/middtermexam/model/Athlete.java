package miu.edu.middtermexam.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name="athletes")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long athleteId;
    @NotNull(message = "ssn is required")
    @Column(nullable = false,unique = true)
    private String ssn;
    @NotNull(message = "fullName is required")
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = true)
    private String phoneNumber;
    @NotNull(message = "date Of Birth is required")
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    @NotNull(message = "totalNumberOfMedalsWon is required")
    @Column(nullable = false)
    private Integer totalNumberOfMedalsWon;
    @NotNull(message = "monthly Salary is required")
    @Column(nullable = false)
    private String monthlySalary;
    @Column(nullable = true)
    private String emailAddress;
    @NotNull(message = "dateOfRegistration is required")
    @Column(nullable = false)
    private LocalDate dateOfRegistration;

    public Athlete() {
    }

    public Athlete(Long athleteId, String ssn, String fullName, String phoneNumber, LocalDate dateOfBirth,LocalDate dateOfRegistration, Integer totalNumberOfMedalsWon, String monthlySalary, String emailAddress) {
        this.athleteId = athleteId;
        this.ssn = ssn;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.dateOfRegistration=dateOfRegistration;
        this.totalNumberOfMedalsWon = totalNumberOfMedalsWon;
        this.monthlySalary = monthlySalary;
        this.emailAddress = emailAddress;
    }

    public Long getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(Long athleteId) {
        this.athleteId = athleteId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getTotalNumberOfMedalsWon() {
        return totalNumberOfMedalsWon;
    }

    public void setTotalNumberOfMedalsWon(Integer totalNumberOfMedalsWon) {
        this.totalNumberOfMedalsWon = totalNumberOfMedalsWon;
    }

    public String getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(String monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}
