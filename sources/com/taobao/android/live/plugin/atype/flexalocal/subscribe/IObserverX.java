package com.taobao.android.live.plugin.atype.flexalocal.subscribe;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IObserverX extends Serializable {
    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);
}
