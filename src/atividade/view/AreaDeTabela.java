package atividade.view;

/**
 *
 * @author Jv Loreti
 */

import atividade.model.Cadastro;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AreaDeTabela extends JPanel{
    JTable tabela;
    ModeloTabelaCadastro mtc;
    
    public AreaDeTabela(){
        mtc = new ModeloTabelaCadastro();
        
        //Inicializa a área de tabela
        tabela = new JTable(mtc);
        //Implementa a área de tabela
        setLayout(new BorderLayout());
        add(new JScrollPane(tabela));
    }
    
    //Manipulação do conteúdo a ser exibido na tabela
    public void setConteudoCadastros(Cadastro c[]){
        mtc.setConteudoCadastros(c);
    }
    
    //Atualiza os parâmetros de impressão de cada coluna da tabela
    public void atualizarTabela(){
        mtc.fireTableDataChanged();
    }
}
