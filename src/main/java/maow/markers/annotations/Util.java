package maow.markers.annotations;

import java.lang.annotation.*;

/**
 * States that a class is a utility class.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface Util {
}
