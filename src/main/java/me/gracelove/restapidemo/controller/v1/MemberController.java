package me.gracelove.restapidemo.controller.v1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.gracelove.restapidemo.entity.Member;
import me.gracelove.restapidemo.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"1. Member"})
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class MemberController {

    private final MemberService memberService;

    @ApiOperation(value = "회원조회", notes = "모든 회원 조회.")
    @GetMapping("/members")
    public List<Member> findAllMembers() {
        return memberService.findAll();
    }

    @ApiOperation(value = "회원가입", notes = "회원가입")
    @PostMapping("/members")
    public Member save(@RequestBody Member member) {
        return memberService.create(member);
    }

}
