package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    //* 생성자 주입
    // 생성자를 통해서 의존관계를 주입함 (추상화에만 의존할 수 있도록)
    // 이렇게 하면 MemberRepository 인터페이스에만 의존할 수 있음 !

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
