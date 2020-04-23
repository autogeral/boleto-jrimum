package br.com.autogeral.boleto;

import br.com.autogeral.dao.Dao;
import br.com.autogeral.venda.VendaTipo;
import static br.com.autogeral.venda.VendaTipo.NFSE;
import static br.com.autogeral.venda.VendaTipo.NOTA;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 23/04/2020 17:38:45
 *
 * @author murilo
 */
public class BoletoDao extends Dao {

    public String getSelect() {
        return "SELECT B.ACUMULO_CODIGO,B.ACUMULO_LOJA,B.CODIGO,B.LOJA,B.CADASTRO,B.ALTERADO,B.BANCO_CODIGO,B.BANCO_SIGLA,B.AGENCIA_CODIGO,B.AGENCIA_NOME,B.CONTA,B.CEDENTE_CODIGO,B.VENCIMENTO,B.NOSSO_NUMERO,B.LOCAL_PAGAMENTO,B.PROTESTO_CODIGO,B.PROTESTO_DIAS,B.BAIXA_DEVOLUCAO_CODIGO,B.BAIXA_DEVOLUCAO_DIAS,B.CADASTRO_CODIGO,B.CADASTRO_LOJA,B.CLIENTE_NOME,B.ABATIMENTO,B.DESCONTO,B.MORA_MULTA,B.JUROS_PARCIAIS,B.VALOR,B.VALOR_BOLETO_ORIGINAL,B.VALOR_COBRADO,B.VALOR_PAGO,B.PAGO,B.SITUACAO,B.PARCELA_NUMERO,B.PARCELAS_TOTAL,B.INSTRUCOES,B.DOCUMENTO_DATA,B.CODIGO_BARRAS,B.LINHA_DIGITAVEL,B.NOTA_TIPO,B.NOTA_LOJA,B.NF_NUMERO,B.CRIADO_POR,B.ALTERADO_POR FROM boletos B";
    }

    public String getInsert() {
        return "INSERT INTO boletos (ACUMULO_CODIGO,ACUMULO_LOJA,CODIGO,LOJA,CADASTRO,ALTERADO,BANCO_CODIGO,BANCO_SIGLA,AGENCIA_CODIGO,AGENCIA_NOME,CONTA,CEDENTE_CODIGO,VENCIMENTO,NOSSO_NUMERO,LOCAL_PAGAMENTO,PROTESTO_CODIGO,PROTESTO_DIAS,BAIXA_DEVOLUCAO_CODIGO,BAIXA_DEVOLUCAO_DIAS,CADASTRO_CODIGO,CADASTRO_LOJA,CLIENTE_NOME,ABATIMENTO,DESCONTO,MORA_MULTA,JUROS_PARCIAIS,VALOR,VALOR_BOLETO_ORIGINAL,VALOR_COBRADO,VALOR_PAGO,PAGO,SITUACAO,PARCELA_NUMERO,PARCELAS_TOTAL,INSTRUCOES,DOCUMENTO_DATA,CODIGO_BARRAS,LINHA_DIGITAVEL,NOTA_TIPO,NOTA_LOJA,NF_NUMERO,CRIADO_POR,ALTERADO_POR) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public String getUpdate() {
        return "UPDATE boletos SET ACUMULO_CODIGO=?,ACUMULO_LOJA=?,CODIGO=?,LOJA=?,CADASTRO=?,ALTERADO=?,BANCO_CODIGO=?,BANCO_SIGLA=?,AGENCIA_CODIGO=?,AGENCIA_NOME=?,CONTA=?,CEDENTE_CODIGO=?,VENCIMENTO=?,NOSSO_NUMERO=?,LOCAL_PAGAMENTO=?,PROTESTO_CODIGO=?,PROTESTO_DIAS=?,BAIXA_DEVOLUCAO_CODIGO=?,BAIXA_DEVOLUCAO_DIAS=?,CADASTRO_CODIGO=?,CADASTRO_LOJA=?,CLIENTE_NOME=?,ABATIMENTO=?,DESCONTO=?,MORA_MULTA=?,JUROS_PARCIAIS=?,VALOR=?,VALOR_BOLETO_ORIGINAL=?,VALOR_COBRADO=?,VALOR_PAGO=?,PAGO=?,SITUACAO=?,PARCELA_NUMERO=?,PARCELAS_TOTAL=?,INSTRUCOES=?,DOCUMENTO_DATA=?,CODIGO_BARRAS=?,LINHA_DIGITAVEL=?,NOTA_TIPO=?,NOTA_LOJA=?,NF_NUMERO=?,CRIADO_POR=?,ALTERADO_POR=?";
    }

    public String getDelete() {
        return "DELETE FROM boletos WHERE ID=?";
    }

    protected void prepareUpdate(PreparedStatement stmt, Boleto b) throws SQLException {
        int idx = 1;
        setNullSafe(stmt, b.getAcumuloCodigo(), idx++);
        setNullSafe(stmt, b.getAcumuloLoja(), idx++);
        stmt.setInt(idx++, b.getCodigo());
        stmt.setInt(idx++, b.getLoja());
        setNullSafe(stmt, b.getCadastro(), idx++);
        stmt.setTimestamp(idx++, new java.sql.Timestamp(b.getAlterado().getTime()));
        stmt.setInt(idx++, b.getBancoCodigo());
        stmt.setString(idx++, b.getBancoSigla());
        stmt.setInt(idx++, b.getAgenciaCodigo());
        stmt.setString(idx++, b.getAgenciaNome());
        stmt.setString(idx++, b.getConta());
        stmt.setInt(idx++, b.getCedenteCodigo());
        setNullSafe(stmt, b.getVencimento(), idx++);
        stmt.setString(idx++, b.getNossoNumero());
        stmt.setString(idx++, b.getLocalPagamento());
        setNullSafe(stmt, b.getProtestoCodigo(), idx++);
        setNullSafe(stmt, b.getProtestoDias(), idx++);
        setNullSafe(stmt, b.getBaixaDevolucaoCodigo(), idx++);
        setNullSafe(stmt, b.getBaixaDevolucaoDias(), idx++);
        stmt.setInt(idx++, b.getCadastroCodigo());
        stmt.setInt(idx++, b.getCadastroLoja());
        stmt.setString(idx++, b.getClienteNome());
        stmt.setDouble(idx++, b.getAbatimento());
        stmt.setDouble(idx++, b.getDesconto());
        stmt.setDouble(idx++, b.getMoraMulta());
        stmt.setDouble(idx++, b.getJurosParciais());
        stmt.setDouble(idx++, b.getValor());
        stmt.setDouble(idx++, b.getValorBoletoOriginal());
        stmt.setDouble(idx++, b.getValorCobrado());
        stmt.setDouble(idx++, b.getValorPago());
        stmt.setBoolean(idx++, b.getPago());
        stmt.setString(idx++, b.getSituacao());
        setNullSafe(stmt, b.getParcelaNumero(), idx++);
        setNullSafe(stmt, b.getParcelasTotal(), idx++);
        stmt.setString(idx++, b.getInstrucoes());
        setNullSafe(stmt, b.getDocumentoData(), idx++);
        setNullSafe(stmt, b.getCodigoBarras(), idx++);
        setNullSafe(stmt, b.getLinhaDigitavel(), idx++);
        stmt.setString(idx++, b.getNotaTipo().toString());
        setNullSafe(stmt, b.getNotaLoja(), idx++);
        setNullSafe(stmt, b.getNfNumero(), idx++);
        setNullSafe(stmt, b.getCriadoPor(), idx++);
        setNullSafe(stmt, b.getAlteradoPor(), idx++);
    }

    protected void setValues(Boleto b, ResultSet rs) throws SQLException {
        b.setAcumuloCodigo(getIntOrNull(rs, "ACUMULO_CODIGO"));
        b.setAcumuloLoja(getIntOrNull(rs, "ACUMULO_LOJA"));
        b.setCodigo(rs.getInt("CODIGO"));
        b.setLoja(rs.getInt("LOJA"));
        b.setCadastro(getTimestampOrNull(rs, "CADASTRO"));
        b.setAlterado(rs.getTimestamp("ALTERADO"));
        b.setBancoCodigo(rs.getInt("BANCO_CODIGO"));
        b.setBancoSigla(rs.getString("BANCO_SIGLA"));
        b.setAgenciaCodigo(rs.getInt("AGENCIA_CODIGO"));
        b.setAgenciaNome(rs.getString("AGENCIA_NOME"));
        b.setConta(rs.getString("CONTA"));
        b.setCedenteCodigo(rs.getInt("CEDENTE_CODIGO"));
        b.setVencimento(getDateOrNull(rs, "VENCIMENTO"));
        b.setNossoNumero(rs.getString("NOSSO_NUMERO"));
        b.setLocalPagamento(rs.getString("LOCAL_PAGAMENTO"));
        b.setProtestoCodigo(getIntOrNull(rs, "PROTESTO_CODIGO"));
        b.setProtestoDias(getIntOrNull(rs, "PROTESTO_DIAS"));
        b.setBaixaDevolucaoCodigo(getIntOrNull(rs, "BAIXA_DEVOLUCAO_CODIGO"));
        b.setBaixaDevolucaoDias(getIntOrNull(rs, "BAIXA_DEVOLUCAO_DIAS"));
        b.setCadastroCodigo(rs.getInt("CADASTRO_CODIGO"));
        b.setCadastroLoja(rs.getInt("CADASTRO_LOJA"));
        b.setClienteNome(rs.getString("CLIENTE_NOME"));
        b.setAbatimento(rs.getDouble("ABATIMENTO"));
        b.setDesconto(rs.getDouble("DESCONTO"));
        b.setMoraMulta(rs.getDouble("MORA_MULTA"));
        b.setJurosParciais(rs.getDouble("JUROS_PARCIAIS"));
        b.setValor(rs.getDouble("VALOR"));
        b.setValorBoletoOriginal(rs.getDouble("VALOR_BOLETO_ORIGINAL"));
        b.setValorCobrado(rs.getDouble("VALOR_COBRADO"));
        b.setValorPago(rs.getDouble("VALOR_PAGO"));
        b.setPago(rs.getBoolean("PAGO"));
        b.setSituacao(rs.getString("SITUACAO"));
        b.setParcelaNumero(getIntOrNull(rs, "PARCELA_NUMERO"));
        b.setParcelasTotal(getIntOrNull(rs, "PARCELAS_TOTAL"));
        b.setInstrucoes(rs.getString("INSTRUCOES"));
        b.setDocumentoData(getDateOrNull(rs, "DOCUMENTO_DATA"));
        b.setCodigoBarras(getStringOrNull(rs, "CODIGO_BARRAS"));
        b.setLinhaDigitavel(getStringOrNull(rs, "LINHA_DIGITAVEL"));
        b.setNotaTipo(VendaTipo.valueOf(rs.getString("NOTA_TIPO")));
        b.setNotaLoja(getIntOrNull(rs, "NOTA_LOJA"));
        b.setNfNumero(getIntOrNull(rs, "NF_NUMERO"));
        b.setCriadoPor(getStringOrNull(rs, "CRIADO_POR"));
        b.setAlteradoPor(getStringOrNull(rs, "ALTERADO_POR"));
    }

    protected Boleto newInstance() {
        return new Boleto();
    }

}
