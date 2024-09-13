package com.side.project.service.member;

import com.side.project.createForm.member.CreateMemberDTO;

public interface MemberService {

    /*
    * 회원 가입
    */
    Long save(CreateMemberDTO createMemberDTO) throws Exception;
}
