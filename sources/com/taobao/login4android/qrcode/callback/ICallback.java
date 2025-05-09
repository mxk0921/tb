package com.taobao.login4android.qrcode.callback;

import com.taobao.login4android.qrcode.result.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ICallback<T extends Result> {
    void onFailure(T t);

    void onScaned(T t);

    void onSuccess(T t);
}
