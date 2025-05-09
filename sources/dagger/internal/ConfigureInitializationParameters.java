package dagger.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public @interface ConfigureInitializationParameters {
    String[] value() default {};
}
