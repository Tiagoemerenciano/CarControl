package view;

import conexao.Connect;
import dao.VeiculoDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HistoricoVeiculoIFrame extends javax.swing.JInternalFrame {

    private VeiculoDao dao = new VeiculoDao();

    public HistoricoVeiculoIFrame() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVeiculos = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setClosable(true);
        setResizable(true);
        setTitle("Histórico de Entradas e saídas");

        tbVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Modelo", "Cor", "Entrada / Saída", "Horário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVeiculos.setColumnSelectionAllowed(true);
        tbVeiculos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbVeiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela() {
        ResultSet rsVeiculo = dao.entradaSaida();
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] colunas = new Object[6];
        colunas[0] = "Placa";
        colunas[1] = "Modelo";
        colunas[2] = "Tipo";
        colunas[3] = "Cor";
        colunas[4] = "Entrada / Saída";
        colunas[5] = "Horário";
        model.setColumnIdentifiers(colunas);

        String[] linhas = new String[6];

        try {
            while (rsVeiculo.next()) {
                linhas[0] = rsVeiculo.getString("placa");
                linhas[1] = rsVeiculo.getString("modelo");
                linhas[2] = rsVeiculo.getString("tipo");
                linhas[3] = rsVeiculo.getString("cor");
                linhas[4] = rsVeiculo.getString("entrada_saida");
                linhas[5] = rsVeiculo.getTimestamp("momento").toString();
                model.addRow(linhas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar veículos: " + e);
        } finally {
            Connect.closeConnection(null, null, rsVeiculo);
        }

        tbVeiculos.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbVeiculos;
    // End of variables declaration//GEN-END:variables
}
