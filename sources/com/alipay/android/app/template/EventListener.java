package com.alipay.android.app.template;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface EventListener {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface EventCallback {
        void onEventReturn(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum EventType {
        GENERIC,
        CLICK,
        ASYNC_EVENT
    }

    boolean onAsyncEvent(EventType eventType, String str, EventCallback eventCallback);

    boolean onEvent(EventType eventType, String str, Object obj, Object obj2);

    String onGetCustomAttr(Object obj, String str);
}
