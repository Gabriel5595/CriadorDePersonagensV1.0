package br.edu.infnet.criadordepersonagem.model.negocio;

public class ModificadoresDeAtributos extends Atributos{
    //Atributos
    private int modForc;
    private int modDes;
    private int modConst;
    private int modInte;
    private int modSab;
    private int modCar;

    //Getters e Setters
    public int getModForc() {
        return modForc;
    }

    public int getModDes() {
        return modDes;
    }

    public int getModConst() {
        return modConst;
    }

    public int getModInte() {
        return modInte;
    }

    public int getModSab() {
        return modSab;
    }

    public int getModCar() {
        return modCar;
    }

    //Construtor
    public ModificadoresDeAtributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        //Aqui está sendo chamado o construtor da classe mãe (Atributos)
        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        //Aqui será utilizado um método que, com base nos atributos base presentes na classe mãe, calculará os modificadores de
        // atributos.
        this.modForc = calcularModificador(forca);
        this.modDes = calcularModificador(destreza);
        this.modConst = calcularModificador(constituicao);
        this.modInte = calcularModificador(inteligencia);
        this.modSab = calcularModificador(sabedoria);
        this.modCar = calcularModificador(carisma);
    }

    //Métodos
    private int calcularModificador(int valorAtributo) {
        int modCalculado = 0;
        if (valorAtributo == 1) {
            modCalculado = -5;
        } else if (valorAtributo == 2 || valorAtributo == 3) {
            modCalculado = -4;
        } else if (valorAtributo == 4 || valorAtributo == 5) {
            modCalculado = -3;
        }  else if (valorAtributo == 6 || valorAtributo == 7) {
            modCalculado = -2;
        } else if (valorAtributo == 8 || valorAtributo == 9) {
            modCalculado = -1;
        } else if (valorAtributo == 12 || valorAtributo == 13) {
            modCalculado = 1;
        } else if (valorAtributo == 14 || valorAtributo == 15) {
            modCalculado = 2;
        } else if (valorAtributo == 16 || valorAtributo == 17) {
            modCalculado = 3;
        } else if (valorAtributo == 18 || valorAtributo == 19) {
            modCalculado = 4;
        } else if (valorAtributo == 20 || valorAtributo == 21) {
            modCalculado = 5;
        } else if (valorAtributo == 22 || valorAtributo == 23) {
            modCalculado = 6;
        } else if (valorAtributo == 24 || valorAtributo == 25) {
            modCalculado = 7;
        } else if (valorAtributo == 26 || valorAtributo == 27) {
            modCalculado = 8;
        } else if (valorAtributo == 28 || valorAtributo == 29) {
            modCalculado = 9;
        } else if (valorAtributo == 30) {
            modCalculado = 10;
        }
        return modCalculado;
    }
    //TODO CRIAR MÉTODO QUE ADICIONE E SUBTRAIA VALORES DOS ATRIBUTOS

    //To String
    @Override
    public String toString() {
        return "Força: " + getForca() + "(" + getModForc() + ")" +
                "\nDestreza: " + getDestreza() + "(" + getModDes() + ")" +
                "\nConstituição: " + getConstituicao() + "(" + getModConst() + ")" +
                "\nInteligência: " + getInteligencia() + "(" + getModInte() + ")" +
                "\nSabedoria: " + getSabedoria() + "(" + getModSab() + ")" +
                "\nCarisma: " + getCarisma() + "(" + getModCar() + ")";
    }
}