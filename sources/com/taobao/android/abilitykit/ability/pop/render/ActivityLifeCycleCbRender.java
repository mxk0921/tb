package com.taobao.android.abilitykit.ability.pop.render;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import tb.ckf;
import tb.h9;
import tb.iab;
import tb.n9;
import tb.t2o;
import tb.zz1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ActivityLifeCycleCbRender<P extends h9, CONTEXT extends n9> extends zz1<P, CONTEXT> implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity d;
    public Application e;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface EventType {
        public static final a Companion = a.$$INSTANCE;
        public static final String ON_CREATED = "onCreated";
        public static final String ON_DESTROYED = "onDestroyed";
        public static final String ON_PAUSED = "onPaused";
        public static final String ON_RESUMED = "onResume";
        public static final String ON_SAVE_INSTANCE_STATE = "onSaveInstanceState";
        public static final String ON_STARTED = "onStarted";
        public static final String ON_STOPPED = "onStopped";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class a {
            public static final /* synthetic */ a $$INSTANCE = new a();
            public static final String ON_CREATED = "onCreated";
            public static final String ON_DESTROYED = "onDestroyed";
            public static final String ON_PAUSED = "onPaused";
            public static final String ON_RESUMED = "onResume";
            public static final String ON_SAVE_INSTANCE_STATE = "onSaveInstanceState";
            public static final String ON_STARTED = "onStarted";
            public static final String ON_STOPPED = "onStopped";

            static {
                t2o.a(336593031);
            }
        }
    }

    static {
        t2o.a(336593029);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ActivityLifeCycleCbRender activityLifeCycleCbRender, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 462397159) {
            super.onDestroyView();
            return null;
        } else if (hashCode == 1558852758) {
            super.j((n9) objArr[0], (h9) objArr[1], (View) objArr[2], (iab) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/abilitykit/ability/pop/render/ActivityLifeCycleCbRender");
        }
    }

    @Override // tb.zz1
    public void a(CONTEXT context, P p, View view, iab iabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cea3496", new Object[]{this, context, p, view, iabVar});
            return;
        }
        ckf.g(context, "abilityRuntimeCtx");
        ckf.g(p, "params");
        ckf.g(iabVar, "callback");
        super.j(context, p, view, iabVar);
        Context d = context.d();
        if (d instanceof Activity) {
            Activity activity = (Activity) d;
            this.d = activity;
            Application application = activity.getApplication();
            this.e = application;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(this);
            }
        }
        c(context, p, view, iabVar);
    }

    public abstract void c(CONTEXT context, P p, View view, iab iabVar);

    public final Activity d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3806435b", new Object[]{this});
        }
        return this.d;
    }

    public abstract void e(String str, Bundle bundle);

    public final void finalize() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        Activity activity = this.d;
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
        } else {
            this.d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        ckf.g(activity, "activity");
        Activity activity2 = this.d;
        if (activity2 != null && ckf.b(activity2, activity)) {
            e("onCreated", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        Activity activity2 = this.d;
        if (activity2 != null && ckf.b(activity2, activity)) {
            e("onDestroyed", null);
            Application application = this.e;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
            this.d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        Activity activity2 = this.d;
        if (activity2 != null && ckf.b(activity2, activity)) {
            e("onPaused", null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        Activity activity2 = this.d;
        if (activity2 != null && ckf.b(activity2, activity)) {
            e("onResume", null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(bundle, "outState");
        Activity activity2 = this.d;
        if (activity2 != null && ckf.b(activity2, activity)) {
            e("onSaveInstanceState", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        Activity activity2 = this.d;
        if (activity2 != null && ckf.b(activity2, activity)) {
            e("onStarted", null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        Activity activity2 = this.d;
        if (activity2 != null && ckf.b(activity2, activity)) {
            e("onStopped", null);
        }
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        Application application = this.e;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }
}
