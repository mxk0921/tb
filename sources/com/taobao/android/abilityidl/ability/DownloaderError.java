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
public @interface DownloaderError {
    public static final a Companion = a.$$INSTANCE;
    public static final String FILE_MD5_ERROR = "FILE_MD5_ERROR";
    public static final String FILE_SIZE_ERROR = "FILE_SIZE_ERROR";
    public static final String NETWORK_ERROR = "NETWORK_ERROR";
    public static final String OUT_OF_SPACE = "OUT_OF_SPACE";
    public static final String SINGLE_FILE_OUT_OF_SPACE = "SINGLE_FILE_OUT_OF_SPACE";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String FILE_MD5_ERROR = "FILE_MD5_ERROR";
        public static final String FILE_SIZE_ERROR = "FILE_SIZE_ERROR";
        public static final String NETWORK_ERROR = "NETWORK_ERROR";
        public static final String OUT_OF_SPACE = "OUT_OF_SPACE";
        public static final String SINGLE_FILE_OUT_OF_SPACE = "SINGLE_FILE_OUT_OF_SPACE";

        static {
            t2o.a(525336864);
        }
    }
}
