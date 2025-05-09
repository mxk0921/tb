package com.taobao.android.tscheduleprotocol;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ScheduleCacheCallBack extends Serializable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ScheduleCacheCallBackType {
        SUCCESS,
        FAILED,
        CANCEL,
        EXPIRE,
        FULL
    }

    void onFinish(ScheduleCacheCallBackType scheduleCacheCallBackType, Object obj, Object... objArr);
}
