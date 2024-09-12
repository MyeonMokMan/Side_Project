package com.side.project.createForm.member;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateMemberForm {

    private String loginId;
    private String password;
    private String name;
    private String zoneCode;
    private String address;
    private String daddress;

}
