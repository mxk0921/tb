package com.alibaba.ability.builder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.t2o;

/* compiled from: Taobao */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface ThreadMode {
    public static final a Companion = a.$$INSTANCE;
    public static final int any = 2;
    public static final int main = 1;
    public static final int nonMain = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int any = 2;
        public static final int main = 1;
        public static final int nonMain = 3;

        static {
            t2o.a(144703515);
        }
    }
}
