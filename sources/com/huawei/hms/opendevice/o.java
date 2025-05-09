package com.huawei.hms.opendevice;

import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f5425a;

    public o(Runnable runnable) {
        this.f5425a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f5425a;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable unused) {
                Log.e("HmsPushThreads", "exception in task run");
            }
        }
    }
}
