package entities;

public class Maquina {

    private Integer agua;
    private Integer leche;
    private Integer cafe;
    private Integer vaso;
    private Integer euro;


    public Maquina() {

    }
    public Maquina(Integer agua, Integer leche, Integer cafe, Integer vaso, Integer euro) {
        this.agua = agua;
        this.leche = leche;
        this.cafe = cafe;
        this.vaso = vaso;
        this.euro = euro;
    }



    public Integer getEuro() {
        return euro;
    }

    public void setEuro(Integer euro) {
        this.euro = euro;
    }

    public Integer getVaso() {
        return vaso;
    }

    public void setVaso(Integer vaso) {
        this.vaso = vaso;
    }

    public Integer getCafe() {
        return cafe;
    }

    public void setCafe(Integer cafe) {
        this.cafe = cafe;
    }

    public Integer getLeche() {
        return leche;
    }

    public void setLeche(Integer leche) {
        this.leche = leche;
    }

    public Integer getAgua() {
        return agua;
    }

    public void setAgua(Integer agua) {
        this.agua = agua;
    }

    @Override
    public String toString() {
        return "La Maquina de café tiene :\n" +
                agua + " ml de agua\n" +
                leche + " ml de leche\n" +
                cafe + " g de cafe\n" +
                vaso + " vasos desechables\n"+
                euro + " euros en efectivo";
    }
}
