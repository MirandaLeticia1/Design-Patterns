package model;

public class Apresentacao implements Programa {

    @Override
    public String manipularArquivo() {
        return "Arquivo manipulado por programa de edição " + this.getClass().getName();
    }
}
