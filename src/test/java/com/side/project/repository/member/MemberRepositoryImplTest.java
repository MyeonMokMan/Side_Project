package com.side.project.repository.member;

import com.side.project.createForm.member.JoinMemberDTO;
import com.side.project.entity.member.Member;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Log4j2
@Transactional
class MemberRepositoryImplTest {

    @Autowired
    private MemberRepositoryImpl memberRepository;

    @Test
    @Rollback(false)
    void 회원가입() throws Exception {

        Member joinMember = Member.builder()
                .loginId("oniic")
                .pwd("1234")
                .name("신인철")
                .build();

        Long memberId = memberRepository.save(joinMember);
        Assertions.assertEquals(memberId, 1L);
    }

}