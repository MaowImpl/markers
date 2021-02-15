package maow.markers.annotations.api;

import java.lang.annotation.*;

/**
 * States that an element will be removed in an upcoming release.
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@Documented
@Inherited
public @interface ScheduledForRemoval {
    /**
     * @return The release this element will be removed in
     */
    String value();
}
