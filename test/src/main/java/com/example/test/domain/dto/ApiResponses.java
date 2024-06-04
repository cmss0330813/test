package com.example.test.domain.dto;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.security.cert.Extension;

import static java.lang.annotation.ElementType.*;

@Target({METHOD, TYPE, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiResponses {
/*
   String description() default "";
   String responseCode() default "default";
   Header[] header() default {};
   Link[] links() default {};
   Content[] content() default {};
   Extension[] extensions() default {};
   String ref() default "";
   boolean useReturnTypeSchema() default false;
*/
}
