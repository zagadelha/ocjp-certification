package enums;

import java.util.Arrays;
import java.util.Optional;

public enum Enum01 {

	RECEBIDO(1), ENVIADO(2), FINALIZADO(3), CANCELADO(4);

	private int status;

	Enum01(int status) {
		this.status = status;
	}

	public static Optional<Enum01> getPorCodigo(int codigo) {
		return Arrays.stream(values()).filter(statusEnum -> statusEnum.status == codigo).findFirst();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static void main(String[] args) {

		// Access code by enum type
		System.out.println(Enum01.ENVIADO.getStatus());

		// Access enum by enum code
		System.out.println(Enum01.getPorCodigo(2).get());

		// Access by array of values
		System.out.println(Enum01.values()[3]);
	}

}
