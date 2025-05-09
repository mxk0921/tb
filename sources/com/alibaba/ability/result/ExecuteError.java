package com.alibaba.ability.result;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.t2o;

/* compiled from: Taobao */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface ExecuteError {
    public static final a Companion = a.$$INSTANCE;
    public static final String abilityInternalError = "500";
    public static final String abilityNotFound = "404";
    public static final String apiNotFound = "501";
    public static final String parametersNotCorrect = "400";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String abilityInternalError = "500";
        public static final String abilityNotFound = "404";
        public static final String apiNotFound = "501";
        public static final String parametersNotCorrect = "400";

        static {
            t2o.a(144703592);
        }
    }
}
