package maow.markers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * States that an element could have a null value.
 */
@Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
public @interface Nullable {
}
