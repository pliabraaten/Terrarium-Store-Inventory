<<<<<<< HEAD
package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */

// Custom annotation
@Constraint(validatedBy = {MinInvValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinInv {
    String message() default "This will decrease part inventory below minimum!";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
=======
package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */

// Custom annotation
@Constraint(validatedBy = {MinInvValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinInv {
    String message() default "This will decrease part inventory below minimum!";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
