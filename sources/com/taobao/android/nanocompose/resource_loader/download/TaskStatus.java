package com.taobao.android.nanocompose.resource_loader.download;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import tb.t2o;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public @interface TaskStatus {
    public static final a Companion = a.$$INSTANCE;
    public static final int TASK_STATUS_CANCEL = 2;
    public static final int TASK_STATUS_COMPLETED = 3;
    public static final int TASK_STATUS_IDLE = -1;
    public static final int TASK_STATUS_RUNNING = 0;
    public static final int TASK_STATUS_SUSPENDED = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int TASK_STATUS_CANCEL = 2;
        public static final int TASK_STATUS_COMPLETED = 3;
        public static final int TASK_STATUS_IDLE = -1;
        public static final int TASK_STATUS_RUNNING = 0;
        public static final int TASK_STATUS_SUSPENDED = 1;

        static {
            t2o.a(598737213);
        }
    }
}
