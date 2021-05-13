package hay.foundation.mhfa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SupportAid {

    public SupportAid(@JsonProperty("id") Integer id,
                      @JsonProperty("name") String name,
                      @JsonProperty("email") String email,
                      @JsonProperty("gender") String gender,
                      @JsonProperty("age") Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public SupportAid(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="gender")
    private String gender;
    @Column(name="age")
    private Integer age;
}
