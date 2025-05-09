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
public @interface PhotoError {
    public static final a Companion = a.$$INSTANCE;
    public static final String GENERATEIMAGE_FAIL = "GENERATEIMAGE_FAIL";
    public static final String LOAD_IMAGE_ERROR = "LOAD_IMAGE_ERROR";
    public static final String NO_FINDVIEW = "NO_FINDVIEW";
    public static final String NO_PERMISSION = "NO_PERMISSION";
    public static final String SELECT_ERROR = "SELECT_ERROR";
    public static final String TAKE_PHOTO_ERROR = "TAKE_PHOTO_ERROR";
    public static final String USER_CANCELED = "USER_CANCELED";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String GENERATEIMAGE_FAIL = "GENERATEIMAGE_FAIL";
        public static final String LOAD_IMAGE_ERROR = "LOAD_IMAGE_ERROR";
        public static final String NO_FINDVIEW = "NO_FINDVIEW";
        public static final String NO_PERMISSION = "NO_PERMISSION";
        public static final String SELECT_ERROR = "SELECT_ERROR";
        public static final String TAKE_PHOTO_ERROR = "TAKE_PHOTO_ERROR";
        public static final String USER_CANCELED = "USER_CANCELED";

        static {
            t2o.a(525337389);
        }
    }
}
