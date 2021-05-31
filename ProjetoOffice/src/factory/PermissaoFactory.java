package factory;

import model.Arquivo;

public class PermissaoFactory {

    Arquivo arquivo;

    public PermissaoFactory() {
        this.arquivo = new Arquivo().getInstance();
    }

    public String setPermissaoArquivo() {

        String permissoes = "";

        if (this.arquivo.isLeitura()) {
            permissoes += " Leitura: t ";
        } else {
            permissoes += "Leitura: f ";
        }

        if (this.arquivo.isEscrita()) {
            permissoes += "Escrita: t ";
        } else {
            permissoes += "Escrita: f ";
        }

        if (this.arquivo.isCopia()) {
            permissoes += "Copiar: t ";
        } else {
            permissoes += "Copiar: f ";
        }

        if (this.arquivo.isImpressao()) {
            permissoes += "Imprimir: t ";
        } else {
            permissoes += "Imprimir: f ";
        }

        return permissoes;
    }
}
