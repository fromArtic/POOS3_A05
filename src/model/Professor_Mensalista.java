package model;

/**
 *
 * @author Jv Loreti
 */

public class Professor_Mensalista extends Professor{
    private double salarioBase;
    private String especializacao;
    private double pagamentoPorAula;
    private int qtdOrientandos;

    //Para professores mensalistas sem especialização
    public Professor_Mensalista(String nome, double sb){
        super(nome);
        salarioBase = sb;
        especializacao = "";
    }
    
    //Para professores mensalistas com especialização (IC ou TCC)
    public Professor_Mensalista(String nome, double sb, String esp, double ppa, int qtd){
        super(nome);
        this.salarioBase = sb;
        if(esp.equalsIgnoreCase("ic") || esp.equalsIgnoreCase("tcc")){
            especializacao = esp;
            pagamentoPorAula = ppa;
            qtdOrientandos = qtd;
        }
    }

    @Override
    public double calcularSalarioMensal(){
        if(especializacao.equalsIgnoreCase("ic")){
            //IC: valor correspondente a 4 aulas para cada orientando
            return salarioBase + (4 * pagamentoPorAula * qtdOrientandos);
        }else if(especializacao.equalsIgnoreCase("tcc")){
            //TCC: valor correspondente a 3 aulas para cada 2 orientandos, portanto, valor correspondente a 1.5 aulas para cada orientando
            return salarioBase + (1.5 * pagamentoPorAula * qtdOrientandos);
        }
        //Sem especialização: possui somente salário base
        return salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public String getEspecializacao(){
        return especializacao;
    }
    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }
    public double getPagamentoPorAula(){
        return pagamentoPorAula;
    }
    public void setPagamentoPorAula(double pagamentoPorAula){
        this.pagamentoPorAula = pagamentoPorAula;
    }
    public int getQtdOrientandos(){
        return qtdOrientandos;
    }
    public void setQtdOrientandos(int qtdOrientandos){
        this.qtdOrientandos = qtdOrientandos;
    }
}
