package maow.markers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * States that a method has no meaningful default implementation.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface NoImpl {
}
