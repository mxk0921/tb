package com.etao.feimagesearch.structure.capture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import tb.t2o;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public @interface PltLifecycleState {
    public static final int CREATED = 1;
    public static final a Companion = a.$$INSTANCE;
    public static final int DESTROYED = 5;
    public static final int PAUSED = 3;
    public static final int RESUMED = 2;
    public static final int STOPPED = 4;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int CREATED = 1;
        public static final int DESTROYED = 5;
        public static final int PAUSED = 3;
        public static final int RESUMED = 2;
        public static final int STOPPED = 4;

        static {
            t2o.a(481297507);
        }
    }
}
