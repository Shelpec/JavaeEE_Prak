import org.graalvm.compiler.lir.LIRInstruction;

public class User {
    private String name;
    private int age;
    private String LastName;

    public User(){
        name = "dd";
        age = 18;
        LastName = "last name";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getLastName()
    {
        return LastName;
    }
}
