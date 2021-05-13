package hay.foundation.mhfa.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sun.istack.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AidForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-13T11:49:38.839Z[GMT]")


public class AidForm   {
    @JsonProperty("email")
    private String email = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("age")
    private Integer age = null;

    @JsonProperty("gender")
    private String gender = null;

    @JsonProperty("phoneNumber")
    private String phoneNumber = null;

    @JsonProperty("whatsAppNumber")
    private String whatsAppNumber = null;

    @JsonProperty("homeAddress")
    private String homeAddress = null;

    @JsonProperty("occupation")
    private String occupation = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("emergencyContact")
    private String emergencyContact = null;

    public AidForm email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     **/
    @Schema(example = "kevin.silver@gmail.com", required = true, description = "")
    @NotNull

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AidForm lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     * @return lastName
     **/
    @Schema(example = "Silver", required = true, description = "")
    @NotNull

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AidForm firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     * @return firstName
     **/
    @Schema(example = "Kevin", required = true, description = "")
    @NotNull

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public AidForm age(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * Get age
     * @return age
     **/
    @Schema(example = "24", required = true, description = "")
    @NotNull

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AidForm gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get gender
     * @return gender
     **/
    @Schema(example = "male", required = true, description = "")
    @NotNull

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AidForm phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     * @return phoneNumber
     **/
    @Schema(example = "+233507888654", required = true, description = "")
    @NotNull

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AidForm whatsAppNumber(String whatsAppNumber) {
        this.whatsAppNumber = whatsAppNumber;
        return this;
    }

    /**
     * Get whatsAppNumber
     * @return whatsAppNumber
     **/
    @Schema(example = "+233507888654", required = true, description = "")
    @NotNull

    public String getWhatsAppNumber() {
        return whatsAppNumber;
    }

    public void setWhatsAppNumber(String whatsAppNumber) {
        this.whatsAppNumber = whatsAppNumber;
    }

    public AidForm homeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    /**
     * Get homeAddress
     * @return homeAddress
     **/
    @Schema(example = "P.O Box 100", required = true, description = "")
    @NotNull

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public AidForm occupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    /**
     * Get occupation
     * @return occupation
     **/
    @Schema(example = "Teacher", required = true, description = "")
    @NotNull

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public AidForm reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     **/
    @Schema(example = "I dont know what to do with myself?", required = true, description = "")
    @NotNull

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AidForm emergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
        return this;
    }

    /**
     * Get emergencyContact
     * @return emergencyContact
     **/
    @Schema(example = "Mr. Smith: 0206666754", required = true, description = "")
    @NotNull

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AidForm aidForm = (AidForm) o;
        return Objects.equals(this.email, aidForm.email) &&
                Objects.equals(this.lastName, aidForm.lastName) &&
                Objects.equals(this.firstName, aidForm.firstName) &&
                Objects.equals(this.age, aidForm.age) &&
                Objects.equals(this.gender, aidForm.gender) &&
                Objects.equals(this.phoneNumber, aidForm.phoneNumber) &&
                Objects.equals(this.whatsAppNumber, aidForm.whatsAppNumber) &&
                Objects.equals(this.homeAddress, aidForm.homeAddress) &&
                Objects.equals(this.occupation, aidForm.occupation) &&
                Objects.equals(this.reason, aidForm.reason) &&
                Objects.equals(this.emergencyContact, aidForm.emergencyContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, lastName, firstName, age, gender, phoneNumber, whatsAppNumber, homeAddress, occupation, reason, emergencyContact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AidForm {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    whatsAppNumber: ").append(toIndentedString(whatsAppNumber)).append("\n");
        sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
        sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    emergencyContact: ").append(toIndentedString(emergencyContact)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
