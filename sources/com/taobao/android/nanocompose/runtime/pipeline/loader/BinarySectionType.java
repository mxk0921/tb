package com.taobao.android.nanocompose.runtime.pipeline.loader;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.t2o;

/* compiled from: Taobao */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE, AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public @interface BinarySectionType {
    public static final int CONST_SECTION = 1;
    public static final a Companion = a.$$INSTANCE;
    public static final int EXPR_SECTION = 2;
    public static final int FUNC_SECTION = 3;
    public static final int HEADER_SECTION = 0;
    public static final int INDEX_TO_NAME_SECTION = 5;
    public static final int NODE_SECTION = 4;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int CONST_SECTION = 1;
        public static final int EXPR_SECTION = 2;
        public static final int FUNC_SECTION = 3;
        public static final int HEADER_SECTION = 0;
        public static final int INDEX_TO_NAME_SECTION = 5;
        public static final int NODE_SECTION = 4;

        static {
            t2o.a(598737428);
        }
    }
}
