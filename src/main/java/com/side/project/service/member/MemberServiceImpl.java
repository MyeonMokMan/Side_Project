package com.side.project.service.member;

import com.side.project.createForm.member.CreateMemberDTO;
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
    public Long save(CreateMemberDTO createMemberDTO) throws Exception {
        return memberRepository.save(createMemberDTO);
    }
}
