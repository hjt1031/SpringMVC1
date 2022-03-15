package hello.servlet.basic;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloData {

    private String username;
    private int age;

    /* 롬북 @Getter @Setter 를 이용하면 쓸 필요 없음.
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
}