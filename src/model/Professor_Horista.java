package model;

/**
 *
 * @author Jv Loreti
 */

public class Professor_Horista extends Professor{
    private double pagamentoPorAula;
    private int qtdAulasMinistradas;
    private double pagamentoHoraAtividade;
    private static final int QTD_HORAS_TRABALHADAS = 714; //4.25 semanas em horas
    
    public Professor_Horista(String nome, double ppa, int qtd, double pha){
        super(nome);
        this.pagamentoPorAula = ppa;
        this.qtdAulasMinistradas = qtd;
        this.pagamentoHoraAtividade = pha;
    }

    @Override
    public double calcularSalarioMensal(){
        return pagamentoPorAula * qtdAulasMinistradas + pagamentoHoraAtividade * QTD_HORAS_TRABALHADAS;
    }   
    
    public double getPagamentoPorAula(){
        return pagamentoPorAula;
    }
    public void setPagamentoPorAula(double pagamentoPorAula){
        this.pagamentoPorAula = pagamentoPorAula;
    }
    public int getQtdAulasMinistradas(){
        return qtdAulasMinistradas;
    }
    public void setQtdAulasMinistradas(int qtdAulasMinistradas){
        this.qtdAulasMinistradas = qtdAulasMinistradas;
    }
    public double getPagamentoHoraAtividade(){
        return pagamentoHoraAtividade;
    }
    public void setPagamentoHoraAtividade(double pagamentoHoraAtividade){
        this.pagamentoHoraAtividade = pagamentoHoraAtividade;
    }
    public static int getQTD_HORAS_TRABALHADAS(){
        return QTD_HORAS_TRABALHADAS;
    }
}
