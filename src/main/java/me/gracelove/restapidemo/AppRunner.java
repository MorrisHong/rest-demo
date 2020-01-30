package me.gracelove.restapidemo;

import lombok.RequiredArgsConstructor;
import me.gracelove.restapidemo.entity.Member;
import me.gracelove.restapidemo.repository.MemberRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppRunner implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Member mem = Member.builder()
                .name("grace")
                .email("govlmo91@gmail.com").build();

        memberRepository.save(mem);
    }
}
