package Practicum7;

public class VervangProces implements OpmaakProces {
    private String oud;
    private String nieuw;

    public VervangProces(String oud, String nieuw){
        this.oud = oud;
        this.nieuw = nieuw;
    }

    public String maakOp(String input){
        input = input.replace(oud,nieuw);
        return input;
    }
}
