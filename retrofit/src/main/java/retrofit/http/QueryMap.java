package retrofit.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Query parameter appended to the URL. Values are converted to strings using
 * {@link String#valueOf(Object)}. Parameter values will be URL encoded.
 * <p>
 * <pre>
 * &#64;GET("/list")
 * void example(@Query("page") int page, ..);
 * </pre>
 * <p>
 * Query parameters may be {@code null} which will omit them from the URL.
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface QueryMap {
}
