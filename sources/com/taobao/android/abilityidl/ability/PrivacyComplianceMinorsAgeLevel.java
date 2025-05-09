package com.taobao.android.abilityidl.ability;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.t2o;

/* compiled from: Taobao */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public @interface PrivacyComplianceMinorsAgeLevel {
    public static final a Companion = a.$$INSTANCE;
    public static final String NONE = "NONE";
    public static final String SYSTEM_ERROR = "SYSTEM_ERROR";
    public static final String V1 = "V1";
    public static final String V2 = "V2";
    public static final String V3 = "V3";
    public static final String V4 = "V4";
    public static final String V5 = "V5";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String NONE = "NONE";
        public static final String SYSTEM_ERROR = "SYSTEM_ERROR";
        public static final String V1 = "V1";
        public static final String V2 = "V2";
        public static final String V3 = "V3";
        public static final String V4 = "V4";
        public static final String V5 = "V5";

        static {
            t2o.a(525337462);
        }
    }
}
