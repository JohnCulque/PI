package com.mycompany.pi.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.pi.database.sqlQueries.Queries;
import com.mycompany.pi.models.RelatorioSintetico;

/**
 * Esta classe é responsável pela comunicação com o banco de dados para gerar relatórios sintéticos de vendas da loja de brinquedos.
 */
public class RelatoriosSinteticosDAO {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static final String url = "jdbc:mysql://localhost:3307/lojabrinquedos";
    private static Connection conexao;

    static {
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(url, LOGIN, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gera um relatório sintético de vendas da loja de brinquedos no período especificado.
     *
     * @param dataInicio A data de início do período.
     * @param dataFim A data de fim do período.
     * @return Uma lista de objetos RelatorioSintetico contendo as informações resumidas das vendas no período especificado.
     */
    public static List<RelatorioSintetico> gerarRelatorioSintetico(LocalDate dataInicio, LocalDate dataFim) {
        List<RelatorioSintetico> retornoRelatorioSintetico = new ArrayList<>();
        
        try {
            if (conexao.isClosed()) {
                conexao = DriverManager.getConnection(url, LOGIN, SENHA);
            }
            String sql = Queries.CONSULTA_RELATORIO_SINTETICO;
    
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setDate(1, Date.valueOf(dataInicio));
            preparedStatement.setDate(2, Date.valueOf(dataFim));
    
            ResultSet resultSet = preparedStatement.executeQuery();
    
            while (resultSet.next()) {
                int idVenda = resultSet.getInt("id_venda");
                LocalDate dataVenda = resultSet.getDate("data_venda").toLocalDate();
                double valorTotal = resultSet.getDouble("valor_venda");
                String cpfCliente = resultSet.getString("cpf_cliente");
    
                RelatorioSintetico relatorioItem = new RelatorioSintetico(idVenda, dataVenda, valorTotal, cpfCliente);
                retornoRelatorioSintetico.add(relatorioItem);
            }
    
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) { 
            e.printStackTrace();
        }
    
        return retornoRelatorioSintetico;
    }
}
