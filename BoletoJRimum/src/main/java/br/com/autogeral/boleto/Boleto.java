/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autogeral.boleto;

import br.com.autogeral.venda.VendaTipo;
import java.util.Date;

/**
 * 23/04/2020 17:19:09
 *
 * @author murilo
 */
public class Boleto {

    private Integer acumuloCodigo;
    private Integer acumuloLoja;
    private int codigo;
    private int loja;
    private Date cadastro;
    private Date alterado;
    private int bancoCodigo;
    private String bancoSigla;
    private int agenciaCodigo;
    private String agenciaNome;
    private String conta;
    private int cedenteCodigo;
    private Date vencimento;
    private String nossoNumero;
    private String localPagamento;
    private int protestoCodigo;
    private Integer protestoDias;
    private int baixaDevolucaoCodigo;
    private Integer baixaDevolucaoDias;
    private int cadastroCodigo;
    private int cadastroLoja;
    private String clienteNome;
    private double abatimento;
    private double desconto;
    private double moraMulta;
    private double jurosParciais;
    private double valor;
    private double valorBoletoOriginal;
    private double valorCobrado;
    private double valorPago;
    private boolean pago;
    private String situacao;
    private Integer parcelaNumero;
    private Integer parcelasTotal;
    private String instrucoes;
    private Date documentoData;
    private String codigoBarras;
    private String linhaDigitavel;
    private VendaTipo notaTipo = VendaTipo.NFE;
    private Integer notaLoja;
    private Integer nfNumero;
    private String criadoPor;
    private String alteradoPor;

    public Integer getAcumuloCodigo() {
        return this.acumuloCodigo;
    }

    public void setAcumuloCodigo(Integer acumuloCodigo) {
        this.acumuloCodigo = acumuloCodigo;
    }

    public Integer getAcumuloLoja() {
        return this.acumuloLoja;
    }

    public void setAcumuloLoja(Integer acumuloLoja) {
        this.acumuloLoja = acumuloLoja;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getLoja() {
        return this.loja;
    }

    public void setLoja(int loja) {
        this.loja = loja;
    }

    public Date getCadastro() {
        return this.cadastro;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }

    public Date getAlterado() {
        return this.alterado;
    }

    public void setAlterado(Date alterado) {
        this.alterado = alterado;
    }

    public int getBancoCodigo() {
        return this.bancoCodigo;
    }

    public void setBancoCodigo(int bancoCodigo) {
        this.bancoCodigo = bancoCodigo;
    }

    public String getBancoSigla() {
        return this.bancoSigla;
    }

    public void setBancoSigla(String bancoSigla) {
        this.bancoSigla = bancoSigla;
    }

    public int getAgenciaCodigo() {
        return this.agenciaCodigo;
    }

    public void setAgenciaCodigo(int agenciaCodigo) {
        this.agenciaCodigo = agenciaCodigo;
    }

    public String getAgenciaNome() {
        return this.agenciaNome;
    }

    public void setAgenciaNome(String agenciaNome) {
        this.agenciaNome = agenciaNome;
    }

    public String getConta() {
        return this.conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getCedenteCodigo() {
        return this.cedenteCodigo;
    }

    public void setCedenteCodigo(int cedenteCodigo) {
        this.cedenteCodigo = cedenteCodigo;
    }

    public Date getVencimento() {
        return this.vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getNossoNumero() {
        return this.nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public String getLocalPagamento() {
        return this.localPagamento;
    }

    public void setLocalPagamento(String localPagamento) {
        this.localPagamento = localPagamento;
    }

    public int getProtestoCodigo() {
        return this.protestoCodigo;
    }

    public void setProtestoCodigo(int protestoCodigo) {
        this.protestoCodigo = protestoCodigo;
    }

    public Integer getProtestoDias() {
        return this.protestoDias;
    }

    public void setProtestoDias(Integer protestoDias) {
        this.protestoDias = protestoDias;
    }

    public int getBaixaDevolucaoCodigo() {
        return this.baixaDevolucaoCodigo;
    }

    public void setBaixaDevolucaoCodigo(int baixaDevolucaoCodigo) {
        this.baixaDevolucaoCodigo = baixaDevolucaoCodigo;
    }

    public Integer getBaixaDevolucaoDias() {
        return this.baixaDevolucaoDias;
    }

    public void setBaixaDevolucaoDias(Integer baixaDevolucaoDias) {
        this.baixaDevolucaoDias = baixaDevolucaoDias;
    }

    public int getCadastroCodigo() {
        return this.cadastroCodigo;
    }

    public void setCadastroCodigo(int cadastroCodigo) {
        this.cadastroCodigo = cadastroCodigo;
    }

    public int getCadastroLoja() {
        return this.cadastroLoja;
    }

    public void setCadastroLoja(int cadastroLoja) {
        this.cadastroLoja = cadastroLoja;
    }

    public String getClienteNome() {
        return this.clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public double getAbatimento() {
        return this.abatimento;
    }

    public void setAbatimento(double abatimento) {
        this.abatimento = abatimento;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getMoraMulta() {
        return this.moraMulta;
    }

    public void setMoraMulta(double moraMulta) {
        this.moraMulta = moraMulta;
    }

    public double getJurosParciais() {
        return this.jurosParciais;
    }

    public void setJurosParciais(double jurosParciais) {
        this.jurosParciais = jurosParciais;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorBoletoOriginal() {
        return this.valorBoletoOriginal;
    }

    public void setValorBoletoOriginal(double valorBoletoOriginal) {
        this.valorBoletoOriginal = valorBoletoOriginal;
    }

    public double getValorCobrado() {
        return this.valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public boolean getPago() {
        return this.pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getParcelaNumero() {
        return this.parcelaNumero;
    }

    public void setParcelaNumero(Integer parcelaNumero) {
        this.parcelaNumero = parcelaNumero;
    }

    public Integer getParcelasTotal() {
        return this.parcelasTotal;
    }

    public void setParcelasTotal(Integer parcelasTotal) {
        this.parcelasTotal = parcelasTotal;
    }

    public String getInstrucoes() {
        return this.instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public Date getDocumentoData() {
        return this.documentoData;
    }

    public void setDocumentoData(Date documentoData) {
        this.documentoData = documentoData;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getLinhaDigitavel() {
        return this.linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public VendaTipo getNotaTipo() {
        return this.notaTipo;
    }

    public void setNotaTipo(VendaTipo notaTipo) {
        this.notaTipo = notaTipo;
    }

    public Integer getNotaLoja() {
        return this.notaLoja;
    }

    public void setNotaLoja(Integer notaLoja) {
        this.notaLoja = notaLoja;
    }

    public Integer getNfNumero() {
        return this.nfNumero;
    }

    public void setNfNumero(Integer nfNumero) {
        this.nfNumero = nfNumero;
    }

    public String getCriadoPor() {
        return this.criadoPor;
    }

    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }

    public String getAlteradoPor() {
        return this.alteradoPor;
    }

    public void setAlteradoPor(String alteradoPor) {
        this.alteradoPor = alteradoPor;
    }

}
