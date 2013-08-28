package retrofit.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Dynamic query key parameter appended to the URL. Value is declared with DynamicQueryValue annotation.
 * Parameter values will be URL encoded.
 * <p>
 * <pre>
 * &#64;GET("/list")
 * void example(@DynamicQueryKey String key, @DynamicQueryValue String value ..);
 * </pre>
 * <p>
 * Query parameters may be {@code null} which will omit them from the URL.
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface DynamicQueryKey {
}
