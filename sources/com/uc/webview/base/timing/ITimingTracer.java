package com.uc.webview.base.timing;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITimingTracer {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        public static final ITimingTracer get() {
            return a.b();
        }
    }

    void mark(int i);

    void mark(int i, String str);

    void markBegin(int i);

    void markEnd(int i);
}
