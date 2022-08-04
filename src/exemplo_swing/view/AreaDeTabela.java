package exemplo_swing.view;

/**
 *
 * @author Jv Loreti
 */

import exemplo_swing.model.Pessoa;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AreaDeTabela extends JPanel{
    JTable tabela;
    ModeloTabelaPessoa mtp;
    
    public AreaDeTabela(){
        mtp = new ModeloTabelaPessoa();
        
        //Inicializa a área de tabela
        tabela = new JTable(mtp);
        //Implementa a área de tabela
        setLayout(new BorderLayout());
        add(new JScrollPane(tabela));
    }
    
    //Manipulação do conteúdo a ser exibido na tabela
    public void setConteudoPessoas(Pessoa p[]){
        mtp.setConteudoPessoas(p);
    }
    
    //Atualiza os parâmetros de impressão de cada coluna da tabela
    public void atualizarTabela(){
        mtp.fireTableDataChanged();
    }
}
