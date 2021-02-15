package maow.markers.annotations.api;

import java.lang.annotation.*;

/**
 * States that an element is for internal use only.
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface Internal {
}
