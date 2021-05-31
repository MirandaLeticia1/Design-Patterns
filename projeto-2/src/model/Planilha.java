package model;

public class Planilha implements Programa {

    @Override
    public String manipularArquivo() {
        return "Arquivo manipulado por programa de edição " + this.getClass().getName();
    }
}
