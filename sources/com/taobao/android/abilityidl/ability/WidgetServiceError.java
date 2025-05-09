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
public @interface WidgetServiceError {
    public static final a Companion = a.$$INSTANCE;
    public static final String NOT_FOUND = "NOT_FOUND";
    public static final String NOT_INSTALL = "NOT_INSTALL";
    public static final String NOT_SUPPORT = "NOT_SUPPORT";
    public static final String PARAM_INVALID = "PARAM_INVALID";
    public static final String UNINITIALIZED = "UNINITIALIZED";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String NOT_FOUND = "NOT_FOUND";
        public static final String NOT_INSTALL = "NOT_INSTALL";
        public static final String NOT_SUPPORT = "NOT_SUPPORT";
        public static final String PARAM_INVALID = "PARAM_INVALID";
        public static final String UNINITIALIZED = "UNINITIALIZED";

        static {
            t2o.a(525337672);
        }
    }
}
