package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member Save(Member member); //회원이 저장소에 저장되는 기능

    Optional<Member> findById(Long id); // id로 회원을 찾는 기능

    Optional<Member> findByName(String name); // name 으로 회원을 찾는 기능

    List<Member> findAll(); // 지금까지 저장된 회원리스트를 다 반환하는 기능


}
