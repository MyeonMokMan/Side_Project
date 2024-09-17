package com.side.project.createForm.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinMemberDTO {

    private String loginId;
    private String password;
    private String name;
    private String zoneCode;
    private String address;
    private String daddress;

}
