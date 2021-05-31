package factory;

import model.Arquivo;
import model.Apresentacao;
import model.Planilha;
import model.Texto;

public class ProgramaFactory {

    public static final int TEXTO = 1;
    public static final int APRESENTACAO = 2;
    public static final int PLANILHA = 3;
    Arquivo arquivo;

    public ProgramaFactory() {
        this.arquivo = new Arquivo().getInstance();
    }

    public void selecionaPrograma(int programaId) {

        switch (programaId) {
            case TEXTO:
                this.arquivo.setPrograma(new Texto());
                break;
            case APRESENTACAO:
                this.arquivo.setPrograma(new Apresentacao());
                break;
            case PLANILHA:
                this.arquivo.setPrograma(new Planilha());
                break;
        }
    }
}
