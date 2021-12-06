package com.selfGood.musicMeet.model;

import com.selfGood.musicMeet.model.userStatus.FamilyStatus;
import com.selfGood.musicMeet.model.userStatus.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users_info")
@Data
class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String surname;
    private Date birthDay;
    private char age;
    private Gender userGender;
    private FamilyStatus familyStatus;
    private String aboutSelf;
}
