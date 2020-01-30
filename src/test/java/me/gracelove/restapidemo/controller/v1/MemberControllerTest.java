package me.gracelove.restapidemo.controller.v1;

import me.gracelove.restapidemo.entity.Member;
import me.gracelove.restapidemo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MemberController.class)
class MemberControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    MemberService memberService;

    @Test
    void list() throws Exception {
        List<Member> list = getMockMembers();
        when(memberService.findAll()).thenReturn(list);

        mockMvc.perform(get("/v1/members"))
                .andExpect(status().isOk());
    }


    @Test
    void create() throws Exception {
        Member member = getMockMembers().get(0);
        when(memberService.create(member)).thenReturn(member);
        String memberString = "{\"name\":\"grace\",\"email\":\"govlmo91@gmail.com\"}";

        mockMvc.perform(post("/v1/members")
                    .content(memberString)
                    .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    private List<Member> getMockMembers() {
        Member member = Member.builder().email("govlmo91@gmail.com").name("grace").build();
        List<Member> list = new ArrayList<>();
        list.add(member);
        return list;
    }

}