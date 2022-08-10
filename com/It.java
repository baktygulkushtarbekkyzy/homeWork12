public class It {
    private String aty;
    private String tusu;
    private int  salmagy;
    private String jashaganjeri;

    void setAty(String word){
        if (word.length()<2){
            System.out.println("Aty "+word+" bolushu mumkun emes");
        }else{
            aty=word;
        }
    }
    void setTusu(String word){
        tusu=word;
    }
    void setSalmagy(int sun){
        if (sun<1){
            System.out.println("Popugaidyn salmagy "+sun+" bolushu mumkun emes");
        }else {
            salmagy=sun;
        }
    }
    void setJashaganjeri(String word){
        if (word.length()<2){
            System.out.println("Jashagan jeri "+word+" bolushu mumkun emes");
        }else{
            jashaganjeri=word;
        }
    }
String getAty(){
        return aty;
}
    String getTusu(){
        return tusu;
    }int getSalmagy(){
        return salmagy;
    }String getJashaganjeri(){
        return jashaganjeri;
    }
}
