package Week3.Opdracht7;

public class CensorProces implements OpmaakProces{
    private String target = "";

    public CensorProces(String target){
        this.target = target;
    }
    public String maakOp(String input){
        String Censor = "";
        for (int i = target.length() ; i > 0 ; i-- ){
            Censor = Censor + "*";
        }
        return(input.replace(target,Censor));
    }
}
