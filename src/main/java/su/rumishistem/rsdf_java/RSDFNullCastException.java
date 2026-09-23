package su.rumishistem.rsdf_java;

public class RSDFNullCastException extends RuntimeException{
	public RSDFNullCastException(String key) {
		super(key + "で許可されていないNullが入りました。");
	}
}
