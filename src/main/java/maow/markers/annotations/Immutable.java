package maow.markers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * States that an element cannot be mutated.
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
public @interface Immutable {
}
