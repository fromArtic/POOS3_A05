package controller;

/**
 *
 * @author Jv Loreti
 */

import model.Professor;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDeProfessores{
    private static RelatorioDeProfessores instance;
    private List<Professor> professores;
    
    private RelatorioDeProfessores(){
        professores = new ArrayList<>();
    }
    
    public static synchronized RelatorioDeProfessores getInstance(){
        if(instance == null){
            instance = new RelatorioDeProfessores();
        }
        return instance;
    }
    
    public boolean cadastrar(Professor professor){
        if(professor != null){
            professores.add(professor);
            return true;
        }
        return false;
    }
    
    public String ImprimirSalarios(){
        String relatorioSalarios = "";
        for(Professor p : professores){
            relatorioSalarios += p + String.format(" Salário mensal: R$ %.2f\n", p.calcularSalarioMensal());
        }
        return relatorioSalarios;
    }
}
