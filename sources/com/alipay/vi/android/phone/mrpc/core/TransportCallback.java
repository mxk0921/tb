package com.alipay.vi.android.phone.mrpc.core;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface TransportCallback {
    void onCancelled(Request request);

    void onFailed(Request request, int i, String str);

    void onPostExecute(Request request, Response response);

    void onPreExecute(Request request);

    void onProgressUpdate(Request request, double d);
}
