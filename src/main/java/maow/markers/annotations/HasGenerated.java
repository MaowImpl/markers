package maow.markers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * States that a class could contain generated elements, also states the source of those generated elements.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface HasGenerated {
    /**
     * @return The source of the generated elements
     */
    String source() default "";

    /**
     * @return The generated elements
     */
    String[] elements() default {};
}