package me.gracelove.restapidemo.controller.v1;

import lombok.RequiredArgsConstructor;
import me.gracelove.restapidemo.entity.Member;
import me.gracelove.restapidemo.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members")
    public List<Member> findAllMembers() {
        return memberService.findAll();
    }

    @PostMapping("/members")
    public Member save(@RequestBody Member member) {
        return memberService.create(member);
    }

}
