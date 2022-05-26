package kpo.lab6;

public class Main {

    public static void main(String[] args) {
        PatientValidator.validate("src/main/java/kpo/lab6/Patients.xml", "src/main/java/kpo/lab6/PatientCheck.xsd");
    }
}
