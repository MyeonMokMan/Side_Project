package com.side.project.repository.member;

import com.side.project.createForm.member.JoinMemberDTO;
import com.side.project.entity.member.Member;

public interface MemberRepository {

    /*
    * 회원 가입
    */
    Long save(Member member) throws Exception;
}
