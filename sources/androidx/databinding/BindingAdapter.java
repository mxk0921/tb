package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public @interface BindingAdapter {
    boolean requireAll() default true;

    String[] value();
}
