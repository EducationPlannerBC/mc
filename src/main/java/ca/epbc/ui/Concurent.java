package ca.epbc.ui;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Concurent {
	
	/**
	 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE})
	public @interface Concurrent {
	    int threads() default 5;
	}

}
