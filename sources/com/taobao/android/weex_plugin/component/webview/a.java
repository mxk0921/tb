package com.taobao.android.weex_plugin.component.webview;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface a {

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_plugin.component.webview.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0520a {
        void onError(String str, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void onMessage(Map<String, Object> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void onPageFinish(String str, boolean z, boolean z2);

        void onPageStart(String str);

        void onReceivedTitle(String str);
    }

    void a(b bVar);

    void b(c cVar);

    void c(AbstractC0520a aVar);

    void destroy();

    void goBack();

    void goForward();

    void loadDataWithBaseURL(String str);

    void loadUrl(String str);

    void postMessage(Object obj);

    void reload();
}
