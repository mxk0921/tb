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
public @interface ImagePreviewError {
    public static final a Companion = a.$$INSTANCE;
    public static final String INDEX_OUT_OF_RANGE = "INDEX_OUT_OF_RANGE";
    public static final String MISS_IMAGE_URL = "MISS_IMAGE_URL";
    public static final String MISS_VIDEO_PLAYER_CONFIG = "MISS_VIDEO_PLAYER_CONFIG";
    public static final String MISS_VIDEO_URL = "MISS_VIDEO_URL";
    public static final String MISS_VIDEO_URL_AND_VIDEO_ID = "MISS_VIDEO_URL_AND_VIDEO_ID";
    public static final String THEMIS_COUNT_GREATER_THAN_ONE = "THEMIS_COUNT_GREATER_THAN_ONE";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String INDEX_OUT_OF_RANGE = "INDEX_OUT_OF_RANGE";
        public static final String MISS_IMAGE_URL = "MISS_IMAGE_URL";
        public static final String MISS_VIDEO_PLAYER_CONFIG = "MISS_VIDEO_PLAYER_CONFIG";
        public static final String MISS_VIDEO_URL = "MISS_VIDEO_URL";
        public static final String MISS_VIDEO_URL_AND_VIDEO_ID = "MISS_VIDEO_URL_AND_VIDEO_ID";
        public static final String THEMIS_COUNT_GREATER_THAN_ONE = "THEMIS_COUNT_GREATER_THAN_ONE";

        static {
            t2o.a(525337214);
        }
    }
}
