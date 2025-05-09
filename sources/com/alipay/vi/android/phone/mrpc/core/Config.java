package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface Config {
    String getAppKey();

    Context getApplicationContext();

    RpcParams getRpcParams();

    Transport getTransport();

    String getUrl();

    boolean isGzip();

    String sign(Context context, String str, String str2);
}
