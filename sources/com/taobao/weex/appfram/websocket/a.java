package com.taobao.weex.appfram.websocket;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface a {
    public static final String HEADER_SEC_WEBSOCKET_PROTOCOL = "Sec-WebSocket-Protocol";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.weex.appfram.websocket.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface AbstractC0801a {
        void a(int i, String str, boolean z);

        void onError(String str);

        void onMessage(String str);

        void onOpen();
    }

    void a(String str, String str2, AbstractC0801a aVar);

    void close(int i, String str);

    void destroy();

    void send(String str);
}
