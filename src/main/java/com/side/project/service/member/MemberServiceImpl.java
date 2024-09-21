package com.side.project.service.member;

import com.side.project.createForm.member.JoinMemberDTO;
import com.side.project.entity.member.Member;
import com.side.project.repository.member.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
@Log4j2
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    /*
    * 회원 저장
    */
    @Override
    public Long save(JoinMemberDTO joinMemberDTO) throws Exception {

        Member member = Member.builder()
                .loginId(joinMemberDTO.getLoginId())
                .pwd(joinMemberDTO.getPassword())
                .name(joinMemberDTO.getName())
                .zoneCode(joinMemberDTO.getZoneCode())
                .address(joinMemberDTO.getAddress())
                .daddress(joinMemberDTO.getDaddress())
                .build();


        return memberRepository.save(member);
    }
}
