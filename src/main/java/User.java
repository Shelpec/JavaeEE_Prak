import org.graalvm.compiler.lir.LIRInstruction;

public class User {
    private String name;
    private int age;

    public User(){
        name = "dd";
        age = 18;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
