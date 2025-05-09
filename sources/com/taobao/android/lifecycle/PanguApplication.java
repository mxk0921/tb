package com.taobao.android.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.task.Global;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.cw6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PanguApplication extends ApplicationCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler mAppHandler = new Handler(Looper.getMainLooper());
    public WeakReference<Activity> mWeakActivity;
    public final List<CrossActivityLifecycleCallback> mCrossActivityLifecycleCallbacks = new CopyOnWriteArrayList();
    public final AtomicInteger mCreationCount = new AtomicInteger();
    public final AtomicInteger mStartCount = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface CrossActivityLifecycleCallback {
        void onCreated(Activity activity);

        void onDestroyed(Activity activity);

        void onStarted(Activity activity);

        void onStopped(Activity activity);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class CrossActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(670040082);
        }

        public CrossActivityLifecycleCallbacks() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            StringBuilder sb = new StringBuilder("CrossActivityLifecycleCallbacks internal:");
            sb.append(PanguApplication.this.mCrossActivityLifecycleCallbacks.size());
            sb.append(" ");
            sb.append(PanguApplication.this.mCrossActivityLifecycleCallbacks.toString());
            PanguApplication.this.mWeakActivity = new WeakReference<>(activity);
            if (PanguApplication.this.mCreationCount.getAndIncrement() == 0 && !PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                    try {
                        crossActivityLifecycleCallback.onCreated(activity);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (PanguApplication.this.mCreationCount.decrementAndGet() == 0 && !PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                    try {
                        crossActivityLifecycleCallback.onDestroyed(activity);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else if (PanguApplication.this.mStartCount.getAndIncrement() == 0 && !PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                    try {
                        crossActivityLifecycleCallback.onStarted(activity);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else if (PanguApplication.this.mStartCount.decrementAndGet() == 0 && !PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                    try {
                        crossActivityLifecycleCallback.onStopped(activity);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class StickCrossRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private CrossActivityLifecycleCallback callback;
        private String method;

        static {
            t2o.a(670040083);
        }

        public StickCrossRunnable(CrossActivityLifecycleCallback crossActivityLifecycleCallback, String str) {
            this.callback = crossActivityLifecycleCallback;
            this.method = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WeakReference<Activity> weakReference = PanguApplication.this.mWeakActivity;
            if (!(weakReference == null || (activity = weakReference.get()) == null || this.callback == null)) {
                if ("onCreated".equals(this.method)) {
                    this.callback.onCreated(activity);
                } else if ("onStarted".equals(this.method)) {
                    this.callback.onStarted(activity);
                }
            }
            this.callback = null;
            this.method = null;
        }
    }

    static {
        t2o.a(670040080);
    }

    public static /* synthetic */ Object ipc$super(PanguApplication panguApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lifecycle/PanguApplication");
    }

    public static void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{runnable});
        } else {
            mAppHandler.post(runnable);
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        cw6.a(this);
        registerActivityLifecycleCallbacks(new CrossActivityLifecycleCallbacks());
        try {
            Global.setContext(getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public void registerCrossActivityLifecycleCallback(CrossActivityLifecycleCallback crossActivityLifecycleCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0cdfb2", new Object[]{this, crossActivityLifecycleCallback});
        } else if (crossActivityLifecycleCallback == null) {
            new RuntimeException("registerCrossActivityLifecycleCallback must not be null").fillInStackTrace();
            new StringBuilder("Called: ").append(this);
        } else {
            this.mCrossActivityLifecycleCallbacks.add(crossActivityLifecycleCallback);
            if (this.mCreationCount.get() > 0) {
                mAppHandler.post(new StickCrossRunnable(crossActivityLifecycleCallback, "onCreated"));
            }
            if (this.mStartCount.get() > 0) {
                mAppHandler.post(new StickCrossRunnable(crossActivityLifecycleCallback, "onStarted"));
            }
        }
    }

    public void resetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        this.mCreationCount.decrementAndGet();
        this.mStartCount.decrementAndGet();
    }

    public void unregisterCrossActivityLifecycleCallback(CrossActivityLifecycleCallback crossActivityLifecycleCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317b074b", new Object[]{this, crossActivityLifecycleCallback});
        } else {
            this.mCrossActivityLifecycleCallbacks.remove(crossActivityLifecycleCallback);
        }
    }
}
