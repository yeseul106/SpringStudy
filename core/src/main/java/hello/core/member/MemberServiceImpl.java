package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //실제 할당하는 부분이 추상화에도 의존하고, 구현체에도 의존 (MemberRepository,MemoryMemberRepository 둘다 의존)
    //DIP 위반 !
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
