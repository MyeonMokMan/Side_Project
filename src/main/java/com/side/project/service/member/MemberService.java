package com.side.project.service.member;

import com.side.project.createForm.member.JoinMemberDTO;

public interface MemberService {

    /*
    * 회원 가입
    */
    Long save(JoinMemberDTO joinMemberDTO) throws Exception;
}
