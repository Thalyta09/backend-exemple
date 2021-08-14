package io.oniasfilho.userapi.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity(name = "user_data")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String cpf;
    private String rg;
    private LocalDate birth_date;
    private String gender;
    private String zodiac_sign;
    private String mother_name;
    private String father_name;
    private String email;
    private String password;
    private String zip_code;
    private String address;
    private Integer house_number;
    //bairro
    private String district;
    private String city;
    private String state;
    private String home_phone;
    private String cellphone;
    //altura
    private String height;
    //peso
    private Integer weight;
    private String blood_type;
    private String color;
}
