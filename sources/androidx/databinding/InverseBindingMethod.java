package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.ANNOTATION_TYPE})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public @interface InverseBindingMethod {
    String attribute();

    String event() default "";

    String method() default "";

    Class type();
}
