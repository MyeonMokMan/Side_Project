package com.side.project.repository.member;

import com.side.project.createForm.member.JoinMemberDTO;

public interface MemberRepository {

    /*
    * 회원 가입
    */
    Long save(JoinMemberDTO joinMemberDTO) throws Exception;
}
