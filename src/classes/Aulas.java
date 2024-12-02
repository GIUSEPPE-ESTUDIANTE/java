package classes;

import java.util.Date;

public class Aulas {
	private Integer id;
	private Date inicio;
	private Date termico;
	private Aluno[] aluno;
	//array com [] cria coleção
	private Professor professor;
	private Curso curso;
	private Sala sala;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getTermico() {
		return termico;
	}
	public void setTermico(Date termico) {
		this.termico = termico;
	}
	public Aluno[] getAluno() {
		return aluno;
	}
	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public String cadastrar() {
		String msg = "Aulas cadastrada";
		return msg;
	}
	
}
