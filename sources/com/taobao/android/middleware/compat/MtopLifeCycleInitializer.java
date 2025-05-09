package com.taobao.android.middleware.compat;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.task.Coordinator;
import java.io.Serializable;
import java.util.HashMap;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.inx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopLifeCycleInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopLifeCycleInitializer";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "mtopsdk.XStateCompatLifecycle";

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/middleware/compat/MtopLifeCycleInitializer$XStateCompatLifecycle");
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else if (activity != null) {
                try {
                    inx.l("PageName", activity.getLocalClassName());
                    Intent intent = activity.getIntent();
                    if (intent != null && (data = intent.getData()) != null) {
                        inx.l("PageUrl", MtopUtils.convertUrl(data.toString()));
                    }
                } catch (Throwable th) {
                    TBSdkLog.e(TAG, "onActivityCreated(): register pageName and pageUrl to mtopsdk error. ", th);
                }
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (activity != null) {
                try {
                    inx.l("PageName", activity.getLocalClassName());
                    Intent intent = activity.getIntent();
                    if (intent != null && (data = intent.getData()) != null) {
                        inx.l("PageUrl", MtopUtils.convertUrl(data.toString()));
                    }
                } catch (Throwable th) {
                    TBSdkLog.e(TAG, "onActivityResumed(): register pageName and pageUrl to mtopsdk error. ", th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static volatile boolean b;

        /* renamed from: a  reason: collision with root package name */
        public final Application f8945a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends Coordinator.TaggedRunnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(String str) {
                super(str);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/middleware/compat/MtopLifeCycleInitializer$XStateForegroundObserver$1");
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    inx.e(c.this.f8945a.getApplicationContext());
                } catch (Throwable unused) {
                }
            }
        }

        public c(Application application) {
            this.f8945a = application;
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
                return;
            }
            try {
                if (!b) {
                    Coordinator.postTask(new a("initXState"));
                    b = true;
                }
            } catch (Throwable th) {
                TBSdkLog.e(MtopLifeCycleInitializer.TAG, "NetworkDiagnosis init error.", th);
            }
            inx.k(false);
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
                return;
            }
            inx.k(true);
            MtopPrefetch.cleanPrefetchCache(Mtop.getMtopInstance(Mtop.Id.INNER));
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            ((PanguApplication) application).registerCrossActivityLifecycleCallback(new c(application));
            ((PanguApplication) application).registerActivityLifecycleCallbacks(new b());
        } catch (Exception e) {
            TBSdkLog.e(TAG, "register Lifecycle Callbacks error.", e);
        }
    }
}
