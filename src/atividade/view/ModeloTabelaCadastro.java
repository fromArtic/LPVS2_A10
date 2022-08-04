package atividade.view;

/**
 *
 * @author Jv Loreti
 */

import atividade.model.Cadastro;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaCadastro extends AbstractTableModel{
    private Cadastro conteudoCadastros[];
    private String categoriaColunas[] = {"Nome", "Endereço", "Cidade", "Estado", "Sexo", "LPVS2", "POOS3", "DSIS4"}; //Define a categoria de cada coluna

    //Implementa o cabeçalho da tabela com a categoria de cada coluna
    @Override
    public String getColumnName(int column){
        return categoriaColunas[column];
    }
    
    //Retorna o número de linhas preenchidas
    @Override
    public int getRowCount(){
        int contador = 0;
        
        for(int i = 0; i < conteudoCadastros.length; i++){
            if(conteudoCadastros[i] != null){
                contador++;
            }
        }
        
        return contador;
    }

    //Retorna o número de colunas
    @Override
    public int getColumnCount(){
        return 8; //8 parâmetros: nome, endereço, cidade, estado, sexo, LPVS2, POOS3, DSIS4
    }

    //Retorna o conteúdo da tabela
    @Override
    public Object getValueAt(int row, int col){
        Cadastro c = conteudoCadastros[row];
        
        if(c != null){
            switch(col){
                case 0: return c.getNome();
                case 1: return c.getEndereco();
                case 2: return c.getCidade();
                case 3: return c.getEstado();
                case 4: return c.getSexo();
                case 5: return c.isLPVS2();
                case 6: return c.isPOOS3();
                case 7: return c.isDSIS4();
            }
        }
        return null;
    }
    
    //Setter
    public void setConteudoCadastros(Cadastro[] c){
        this.conteudoCadastros = c;
    }
}
