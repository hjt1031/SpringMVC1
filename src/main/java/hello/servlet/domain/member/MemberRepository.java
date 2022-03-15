package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 */
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    // 1씩 증가
    private static long sequence = 0L;
    // 싱글톤
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }
    // 생성자 막기
    private MemberRepository() {

    }

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id){
        return store.get(id);
    }

    public List<Member> findAll(){
        // store 에 있는 값을 arraylist 로 담애서 넘겨 줌 why? 값을 넣거나 데이터를 조작해도 store 에있는 values 를 건드리기 싫어서.(보호하기위해서)
        return new ArrayList<>(store.values());
    }
    public void clearStore(){
        store.clear();
    }
}
