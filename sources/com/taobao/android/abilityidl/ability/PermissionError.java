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
public @interface PermissionError {
    public static final a Companion = a.$$INSTANCE;
    public static final String PERMISSIONS_EMPTY = "PERMISSIONS_EMPTY";
    public static final String PERMISSIONS_GROUP_ERROR = "PERMISSIONS_GROUP_ERROR";
    public static final String PERMISSIONS_INVALID = "PERMISSIONS_INVALID";
    public static final String PRIVACY_ID_INVALID = "PRIVACY_ID_INVALID";
    public static final String UNKNOWN_BIZ_ERROR = "UNKNOWN_BIZ_ERROR";
    public static final String UNKNOWN_SYSTEM_ERROR = "UNKNOWN_SYSTEM_ERROR";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String PERMISSIONS_EMPTY = "PERMISSIONS_EMPTY";
        public static final String PERMISSIONS_GROUP_ERROR = "PERMISSIONS_GROUP_ERROR";
        public static final String PERMISSIONS_INVALID = "PERMISSIONS_INVALID";
        public static final String PRIVACY_ID_INVALID = "PRIVACY_ID_INVALID";
        public static final String UNKNOWN_BIZ_ERROR = "UNKNOWN_BIZ_ERROR";
        public static final String UNKNOWN_SYSTEM_ERROR = "UNKNOWN_SYSTEM_ERROR";

        static {
            t2o.a(525337369);
        }
    }
}
