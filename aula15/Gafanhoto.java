package aula15;

public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totAssitido;
	
	public Gafanhoto(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.setLogin(login);
		this.setTotAssitido(0);
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssitido() {
		return totAssitido;
	}
	public void setTotAssitido(int totAssitido) {
		this.totAssitido = totAssitido;
	}

	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin=" + login + ", totAssitido=" + totAssitido + "]";
	}
	
	
}
