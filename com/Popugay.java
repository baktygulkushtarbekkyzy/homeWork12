public class Popugay {
    private String tusu;
    private int  salmagy;
    private String jashaganjeri;

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

    String getTusu(){
        return tusu;
    }int getSalmagy(){
        return salmagy;
    }String getJashaganjeri(){
        return jashaganjeri;
    }
}
