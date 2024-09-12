package com.side.project.entity.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Builder
public class Member {

    public Member() {}

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "login_id", nullable = false)
    private String loginId;

    @Column(name = "pwd", nullable = false)
    private String pwd;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "zcode")
    private String zoneCode;

    @Column(name = "address")
    private String address;

    @Column(name = "daddress")
    private String daddress;


}
