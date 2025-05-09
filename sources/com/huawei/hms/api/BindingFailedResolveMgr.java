package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
class BindingFailedResolveMgr {
    static final BindingFailedResolveMgr b = new BindingFailedResolveMgr();
    private static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    List<Activity> f5267a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (c) {
            try {
                for (Activity activity2 : this.f5267a) {
                    if (!(activity2 == null || activity2 == activity || activity2.isFinishing())) {
                        activity2.finish();
                    }
                }
                this.f5267a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (c) {
            this.f5267a.remove(activity);
        }
    }
}
