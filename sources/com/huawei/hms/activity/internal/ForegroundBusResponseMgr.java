package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ForegroundBusResponseMgr {
    private static final ForegroundBusResponseMgr b = new ForegroundBusResponseMgr();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, BusResponseCallback> f5242a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f5242a) {
            busResponseCallback = this.f5242a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (!TextUtils.isEmpty(str) && busResponseCallback != null) {
            synchronized (this.f5242a) {
                try {
                    if (!this.f5242a.containsKey(str)) {
                        this.f5242a.put(str, busResponseCallback);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f5242a) {
                this.f5242a.remove(str);
            }
        }
    }
}
