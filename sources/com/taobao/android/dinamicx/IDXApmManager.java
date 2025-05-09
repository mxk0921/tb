package com.taobao.android.dinamicx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IDXApmManager {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXApmEventType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        public static final int NOTIFY_BACKGROUND_2_FOREGROUND = 2;
        public static final int NOTIFY_FOREGROUND_2_BACKGROUND = 1;
        public static final int NOTIFY_FOR_IN_BACKGROUND = 50;

        void onEvent(int i);
    }

    void a(a aVar);
}
