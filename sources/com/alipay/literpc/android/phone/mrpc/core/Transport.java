package com.alipay.literpc.android.phone.mrpc.core;

import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface Transport {
    Future<Response> execute(Request request);
}
