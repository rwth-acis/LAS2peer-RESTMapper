package i5.las2peer.restMapper.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated
/**
 * Not used anymore, can be safely removed!
 */
public @interface Version {
	String value();
}