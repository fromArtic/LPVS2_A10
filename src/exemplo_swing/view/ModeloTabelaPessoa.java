package exemplo_swing.view;

/**
 *
 * @author Jv Loreti
 */

import exemplo_swing.model.Pessoa;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaPessoa extends AbstractTableModel{
    private Pessoa conteudoPessoas[];
    private String categoriaColunas[] = {"ID", "Nome", "Ocupação", "Faixa etária", "Situação", "Estrangeiro?", "Passaporte", "Gênero"}; //Define a categoria de cada coluna

    //Implementa o cabeçalho da tabela com a categoria de cada coluna
    @Override
    public String getColumnName(int column){
        return categoriaColunas[column];
    }   
    
    //Retorna o número de linhas preenchidas
    @Override
    public int getRowCount(){
        int contador = 0;
        
        for(int i = 0; i < conteudoPessoas.length; i++){
            if(conteudoPessoas[i] != null){
                contador++;
            }
        }
        
        return contador;
    }

    //Retorna o número de colunas
    @Override
    public int getColumnCount(){
        return 8; //8 parâmetros: id, nome, ocupação, idade, situação, estrangeiro, passaporte e gênero
    }

    //Retorna o conteúdo da tabela
    @Override
    public Object getValueAt(int row, int col){
        Pessoa p = conteudoPessoas[row];
        
        if(p != null){
            switch(col){
                case 0: return p.getId();
                case 1: return p.getNome();
                case 2: return p.getOcupacaoEmprego();
                case 3: return p.getIdade();
                case 4: return p.getSituacaoEmprego();
                case 5: return p.isCheckEstrangeiro();
                case 6: return p.getPassaporte();
                case 7: return p.getGenero();
            }    
        }
        return null;
    }
    
    //Setter
    public void setConteudoPessoas(Pessoa[] p){
        this.conteudoPessoas = p;
    }
}
