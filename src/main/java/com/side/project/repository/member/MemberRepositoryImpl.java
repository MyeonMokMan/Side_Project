package com.side.project.repository.member;

import com.side.project.createForm.member.CreateMemberDTO;
import com.side.project.entity.member.Member;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
@Log4j2
public class MemberRepositoryImpl implements MemberRepository {

    private final EntityManager em;

    @Override
    public Long save(CreateMemberDTO createMemberDTO) throws Exception {

        Member member = Member.builder()
                .loginId(createMemberDTO.getLoginId())
                .pwd(createMemberDTO.getPassword())
                .name(createMemberDTO.getName())
                .zoneCode(createMemberDTO.getZoneCode())
                .address(createMemberDTO.getAddress())
                .daddress(createMemberDTO.getDaddress())
                .build();

        em.persist(member);

        // 등록 아이디 변경
        member.setCreateId(member.getMemberId());

        return member.getMemberId();
    }
}
