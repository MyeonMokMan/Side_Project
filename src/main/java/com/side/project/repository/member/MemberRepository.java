package com.side.project.repository.member;

import com.side.project.createForm.member.CreateMemberDTO;

public interface MemberRepository {

    /*
    * 회원 가입
    */
    Long save(CreateMemberDTO createMemberDTO) throws Exception;
}
