package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static final b b = new b();
    private static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final List<Activity> f5281a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (c) {
            try {
                for (Activity activity2 : this.f5281a) {
                    if (!(activity2 == null || activity2 == activity || activity2.isFinishing())) {
                        activity2.finish();
                    }
                }
                this.f5281a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (c) {
            this.f5281a.remove(activity);
        }
    }
}
