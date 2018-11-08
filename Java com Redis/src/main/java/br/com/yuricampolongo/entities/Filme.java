package br.com.yuricampolongo.entities;

import java.util.List;

import br.com.redis.client.redisquerysimplifier.annotations.RedisFieldIndex;
import br.com.redis.client.redisquerysimplifier.annotations.RedisObject;

@RedisObject(name = "Filme")
public class Filme {

	@RedisFieldIndex
	private String nome;
	private String paisDeOrigem;
	private List<String> atores;
	private String diretor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", paisDeOrigem=" + paisDeOrigem + ", atores=" + atores + ", diretor=" + diretor
				+ "]";
	}

}
