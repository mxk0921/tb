package com.taobao.monitor.procedure;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.jn1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IPage {
    public static final IPage DEFAULT_PAGE = new com.taobao.monitor.procedure.a();
    public static final int STATUS_BACK = -4;
    public static final int STATUS_DEFAULT = 1;
    public static final int STATUS_F2B = -3;
    public static final int STATUS_JUMP_NEXT_PAGE = -5;
    public static final int STATUS_LIFECYCLE_MISS = -6;
    public static final int STATUS_MOVE = -2;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_TIME_OUT = -1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PageRenderError {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        public static final long CALCULATE_FAIL = -1;

        jn1 a(IPage iPage);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void K(long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(String str, Object obj);

        void b(String str, Map<String, Object> map);

        void onStage(String str, long j);

        void u(String str, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
        void a(String str, String str2, Map<String, Object> map);

        void onPageAppear();

        void onPageDestroy();

        void onPageDisappear();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
    }

    void a(View view, a aVar);

    String b();

    b c();

    c d();

    d e();

    String getPageName();
}
