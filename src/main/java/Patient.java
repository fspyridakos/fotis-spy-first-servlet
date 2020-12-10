import java.io.Serializable;

public class Patient implements Serializable {
    protected String name;
    protected String id;
    protected String phoneNumber;

    public Patient(String name, String id, String phoneNumber){
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public void details(){
        System.out.println("Patient Name: " + name + "\nPatient id: " + id + "\nPatient Phone number: " + phoneNumber);
    }
}
