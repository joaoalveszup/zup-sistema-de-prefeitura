package com.zup.estrelas.sistemaPrefeitura.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.sound.sampled.Clip;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "secretaria")
public class SecretariaEntity {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSecretaria;
	private String area;
	private Double orcamentoProjetos;
	private Double orcamentoFolha;
	private String telefone;
	private String endereco;
	private String site;
	private String email;
	
	@JsonManagedReference
	@OneToMany(mappedBy="idFuncionario",orphanRemoval = true, cascade = CascadeType.REMOVE)
	private List<FuncionarioEntity> funcionarios;
	
	//FIXME: A anotação @JsonManagedReference poderia estar aqui também.
	@OneToMany(mappedBy="idProjeto",orphanRemoval = true, cascade = CascadeType.REMOVE)
	private List<ProjetoEntity> projetos;

	public Long getIdSecretaria() {
		return idSecretaria;
	}

	public void setIdSecretaria(Long idSecretaria) {
		this.idSecretaria = idSecretaria;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Double getOrcamentoProjetos() {
		return orcamentoProjetos;
	}

	public void setOrcamentoProjetos(Double orcamentoProjetos) {
		this.orcamentoProjetos = orcamentoProjetos;
	}

	public Double getOrcamentoFolha() {
		return orcamentoFolha;
	}

	public void setOrcamentoFolha(Double orcamentoFolha) {
		this.orcamentoFolha = orcamentoFolha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<FuncionarioEntity> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioEntity> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<ProjetoEntity> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<ProjetoEntity> projetos) {
		this.projetos = projetos;
	}
}
