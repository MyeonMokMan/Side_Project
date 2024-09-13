package com.side.project.service.member;

import com.side.project.createForm.member.CreateMemberDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
@Transactional
class MemberServiceImplTest {

    @Autowired
    private MemberService memberService;

    @Test
    @Rollback(false)
    void 회원가입() throws Exception {
        CreateMemberDTO createMemberDTO = CreateMemberDTO.builder()
                .loginId("oniiccc")
                .password("1234")
                .name("신인철")
                .build();

        Long memberId = memberService.save(createMemberDTO);
        Assertions.assertEquals(memberId, 1L);
    }

}