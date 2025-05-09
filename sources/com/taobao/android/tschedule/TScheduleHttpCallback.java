package com.taobao.android.tschedule;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface TScheduleHttpCallback extends Serializable {
    void onError();

    void onSuccess(Object obj);
}
