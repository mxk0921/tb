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
public @interface SpeechRecognitionError {
    public static final String CAN_NOT_GET_TOKEN = "CAN_NOT_GET_TOKEN";
    public static final a Companion = a.$$INSTANCE;
    public static final String NO_MIC_PERMISSION = "NO_MIC_PERMISSION";
    public static final String RESULT_DATA_ERROR = "RESULT_DATA_ERROR";
    public static final String TASK_EXCEPTION = "TASK_EXCEPTION";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String CAN_NOT_GET_TOKEN = "CAN_NOT_GET_TOKEN";
        public static final String NO_MIC_PERMISSION = "NO_MIC_PERMISSION";
        public static final String RESULT_DATA_ERROR = "RESULT_DATA_ERROR";
        public static final String TASK_EXCEPTION = "TASK_EXCEPTION";

        static {
            t2o.a(525337517);
        }
    }
}
