package com.side.project.repository.member;

import com.side.project.createForm.member.JoinMemberDTO;
import com.side.project.entity.member.Member;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Log4j2
public class MemberRepositoryImpl implements MemberRepository {

    private final EntityManager em;

    /*
     * 회원 가입
     */
    @Override
    public Long save(Member member) throws Exception {
        // 회원 엔티티 저장
        em.persist(member);
        // 회원 공통 필드 등록 아이디 변경
        return member.getMemberId();
    }
}
