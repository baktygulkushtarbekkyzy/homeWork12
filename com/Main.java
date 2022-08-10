public class Main {
    public static void main(String[] args) {
        Balyk balyk=new Balyk();
        balyk.setTusu("Sary");
        balyk.setSalmagy(4);
        balyk.setJashaganjeri("Deniz");
        System.out.println("Balyk: "+balyk.getTusu()+" "+balyk.getSalmagy()+" "+balyk.getJashaganjeri());
        Popugay popugay=new Popugay();
        popugay.setTusu("Jashyl");
        popugay.setSalmagy(12);
        popugay.setJashaganjeri("Tokoy");
        System.out.println("Popugai: "+popugay.getTusu()+" "+popugay.getSalmagy()+" "+popugay.getJashaganjeri());
        Myshyk myshyk=new Myshyk();
        myshyk.setTusu("Kara");
        myshyk.setSalmagy(13);
        myshyk.setJashaganjeri("uy");
        System.out.println("Myshyk: "+myshyk.getTusu()+" "+myshyk.getSalmagy()+" "+myshyk.getJashaganjeri());
        It it=new It();
        it.setAty("Aktosh");
        it.setTusu("charala");
        it.setSalmagy(23);
        it.setJashaganjeri("Uya");
        System.out.println("It: "+it.getAty()+" "+it.getTusu()+" "+it.getSalmagy()+" "+it.getJashaganjeri());
    }
}