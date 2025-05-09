package com.alibaba.motu.tbrest;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
import tb.kao;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BackgroundLauncher implements Serializable {
    private static volatile boolean init = false;

    static {
        t2o.a(813694978);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        if (!init) {
            init = true;
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public int f2487a;

        static {
            t2o.a(813694980);
        }

        public b() {
            this.f2487a = 0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            this.f2487a++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i = this.f2487a - 1;
            this.f2487a = i;
            if (i == 0) {
                kao.d();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
