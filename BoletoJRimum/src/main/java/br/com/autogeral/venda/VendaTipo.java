/*
 *
 *
 */

package br.com.autogeral.venda;

/**
 * 15/05/2010 10:25:02
 * @author Murilo
 */
public enum VendaTipo {
    NOTA("Nota Fiscal"), NFE("Nota Fiscal Eletronica"), 
    NFSE("Nota Fiscal de Servico"), CUPOM("Cupom"),
    PEDIDO("Pedido"), ROMANEIO("Romaneio"), 
    COMPRA("Compra"), ORDEM_SERVICO("Ordem de Servico"),
    SAT("CFe SAT"), PEDIDO_CLIENTE("Pedido do Cliente");
    
    private final String descricao;

    
    VendaTipo(String descricao) {
        this.descricao = descricao;
    }
    
    String getDescricao() {
        return descricao;
    }
}
