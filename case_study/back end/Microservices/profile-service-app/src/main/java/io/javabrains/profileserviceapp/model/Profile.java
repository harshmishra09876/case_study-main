package io.javabrains.profileserviceapp.model;

//import lombok.AllArgsConstructor;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Profile {

    @Id
    private int profileId;
    private String fullName;
    private String image;
    private String emailId;
    private String mobileNumber;
    private String about;
    private String gender;
    private String role;
    private String password;

    public Profile(int profileId, String fullName, String image, String emailId, String mobileNumber,
                   String about, String gender, String role, String password) {
        this.profileId = profileId;
        this.fullName = fullName;
        this.image = image;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.about = about;
        this.gender = gender;
        this.role = role;
        this.password = password;
    }

    public Profile() {
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
