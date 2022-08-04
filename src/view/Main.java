package view;

/**
 *
 * @author Jv Loreti
 */

import model.Professor_Horista;
import model.Professor_Mensalista;
import controller.RelatorioDeProfessores;

public class Main{
    public static void main(String[] args){
        RelatorioDeProfessores relatorio = RelatorioDeProfessores.getInstance();
        
        Professor_Horista ph = new Professor_Horista("Dandan", 20, 35, 5.5); //Professor horista
        Professor_Mensalista pm = new Professor_Mensalista("Dindin", 2100); //Professor mensalista sem especialização
        Professor_Mensalista pmIC = new Professor_Mensalista("Dundun", 1400, "ic", 20, 44); //Professor mensalista orientador de IC
        Professor_Mensalista pmTCC = new Professor_Mensalista("Duck", 900, "tcc", 5, 190); //Professor mensalista orientador de TCC
        
        relatorio.cadastrar(ph);
        relatorio.cadastrar(pm);
        relatorio.cadastrar(pmIC);
        relatorio.cadastrar(pmTCC);
        
        System.out.println(relatorio.ImprimirSalarios());
    }
}
