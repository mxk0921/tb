package io.unicorn.plugin.network;

import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface ExternalAdapterNetworkProvider {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class Request {
        public static final int DEFAULT_TIMEOUT_MS = 3000;
        public String body;
        public String method;
        public Map<String, String> params;
        public int timeout = 3000;
        public String url;

        static {
            t2o.a(945815795);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface RequestListener {
        void onRequestFinish(int i, byte[] bArr);
    }

    void sendRequest(Request request, RequestListener requestListener);
}
