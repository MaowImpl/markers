package maow.markers.annotations.api;

import java.lang.annotation.*;

/**
 * States than element is not yet finished and is in a beta phase.
 *
 * @see Experimental
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface Beta {
}
