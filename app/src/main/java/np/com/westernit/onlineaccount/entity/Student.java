package np.com.westernit.onlineaccount.entity;

public class Student {
    private Integer roll;
    private String name;
    private String email;

    public Student(Integer roll, String name) {
        this.roll = roll;
        this.name = name;

    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
