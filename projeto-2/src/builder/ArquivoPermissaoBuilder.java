package builder;

import model.Arquivo;

public class ArquivoPermissaoBuilder {
    private Arquivo arquivo;

    public ArquivoPermissaoBuilder(boolean escrita, boolean leitura, boolean copiar, boolean impressao) {
        this.arquivo = new Arquivo().getInstance();
        this.arquivo.setEscrita(escrita);
        this.arquivo.setLeitura(leitura);
        this.arquivo.setCopia(copiar);
        this.arquivo.setImpressao(impressao);
    }
}
