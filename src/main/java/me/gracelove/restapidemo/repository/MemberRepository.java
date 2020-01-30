package me.gracelove.restapidemo.repository;

import me.gracelove.restapidemo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
