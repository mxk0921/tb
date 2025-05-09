package com.alibaba.fastjson2.annotation;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.uh9;

/* compiled from: Taobao */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface JSONType {
    boolean alphabetic() default true;

    Class<? extends JSONReader.a> autoTypeBeforeHandler() default JSONReader.a.class;

    Class<?> builder() default void.class;

    JSONReader.Feature[] deserializeFeatures() default {};

    Class<?> deserializer() default Void.class;

    String format() default "";

    String[] ignores() default {};

    String[] includes() default {};

    String locale() default "";

    PropertyNamingStrategy naming() default PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue;

    String[] orders() default {};

    String schema() default "";

    Class<?>[] seeAlso() default {};

    Class<?> seeAlsoDefault() default Void.class;

    JSONWriter.Feature[] serializeFeatures() default {};

    Class<? extends uh9>[] serializeFilters() default {};

    Class<?> serializer() default Void.class;

    String typeKey() default "";

    String typeName() default "";

    boolean writeEnumAsJavaBean() default false;
}
