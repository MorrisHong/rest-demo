package me.gracelove.restapidemo.service;

import lombok.RequiredArgsConstructor;
import me.gracelove.restapidemo.entity.Member;
import me.gracelove.restapidemo.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member create(Member member) {
        return memberRepository.save(member);
    }
}
