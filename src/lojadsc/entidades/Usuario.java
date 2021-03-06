package lojadsc.entidades;

import java.io.Serializable;

/**
 * Entidade fictícia (não deve salvar no banco)
 *
 * @author Gabriel
 */
public class Usuario implements Serializable {
	private static final long serialVersionUID = -6467792829340036088L;
	private String nome, login, password;

	public Usuario() {
		super();
	}

	public Usuario(String nome, String login, String password) {
		super();
		this.nome = nome;
		this.login = login;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
