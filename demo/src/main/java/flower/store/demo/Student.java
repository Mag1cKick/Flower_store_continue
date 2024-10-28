import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Table
@Entity
public class Student {
    long id;
    String name;
    String gender;

    int age;

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
