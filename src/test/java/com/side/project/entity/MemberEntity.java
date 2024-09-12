package com.side.project.entity;

import com.side.project.entity.member.Member;
import jakarta.persistence.EntityManager;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Log4j2
@Transactional
public class MemberEntity {

    @Autowired
    EntityManager em;

    @Test
    @Rollback(value = false)
    void 회원_엔티티_생성() throws Exception {

        Member member = Member.builder()
                .loginId("oniic")
                .pwd("1234")
                .name("신인철")
                .build();

        em.persist(member);
    }
}
