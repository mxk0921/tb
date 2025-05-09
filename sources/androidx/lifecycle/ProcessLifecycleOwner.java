package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ReportFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0002/.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "Ltb/xhv;", "activityStarted$lifecycle_process_release", "activityStarted", "activityResumed$lifecycle_process_release", "activityResumed", "activityPaused$lifecycle_process_release", "activityPaused", "activityStopped$lifecycle_process_release", "activityStopped", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "Landroid/content/Context;", "context", "attach$lifecycle_process_release", "(Landroid/content/Context;)V", Constants.Event.SLOT_LIFECYCLE.ATTACH, "", "startedCounter", TLogTracker.LEVEL_INFO, "resumedCounter", "", "pauseSent", "Z", "stopSent", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Ljava/lang/Runnable;", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "initializationListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Companion", "Api29Impl", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TIMEOUT_MS = 700;
    private Handler handler;
    private int resumedCounter;
    private int startedCounter;
    public static final Companion Companion = new Companion(null);
    private static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    private boolean pauseSent = true;
    private boolean stopSent = true;
    private final LifecycleRegistry registry = new LifecycleRegistry(this);
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: tb.cym
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.delayedPauseRunnable$lambda$0(ProcessLifecycleOwner.this);
        }
    };
    private final ReportFragment.ActivityInitializationListener initializationListener = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            }
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
            }
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
            }
        }
    };

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "Ltb/xhv;", "registerActivityLifecycleCallbacks", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void registerActivityLifecycleCallbacks(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a19e8249", new Object[]{activity, activityLifecycleCallbacks});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "get", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "Ltb/xhv;", "init$lifecycle_process_release", "(Landroid/content/Context;)V", "init", "", "TIMEOUT_MS", "J", "getTIMEOUT_MS$lifecycle_process_release$annotations", "Landroidx/lifecycle/ProcessLifecycleOwner;", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f17e17f", new Object[0]);
            }
        }

        @JvmStatic
        public final LifecycleOwner get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LifecycleOwner) ipChange.ipc$dispatch("d37ca49a", new Object[]{this});
            }
            return ProcessLifecycleOwner.access$getNewInstance$cp();
        }

        @JvmStatic
        public final void init$lifecycle_process_release(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6bb5f13", new Object[]{this, context});
                return;
            }
            ckf.g(context, "context");
            ProcessLifecycleOwner.access$getNewInstance$cp().attach$lifecycle_process_release(context);
        }

        private Companion() {
        }
    }

    private ProcessLifecycleOwner() {
    }

    public static final /* synthetic */ ReportFragment.ActivityInitializationListener access$getInitializationListener$p(ProcessLifecycleOwner processLifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReportFragment.ActivityInitializationListener) ipChange.ipc$dispatch("e4feee8e", new Object[]{processLifecycleOwner});
        }
        return processLifecycleOwner.initializationListener;
    }

    public static final /* synthetic */ ProcessLifecycleOwner access$getNewInstance$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessLifecycleOwner) ipChange.ipc$dispatch("ff6031df", new Object[0]);
        }
        return newInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner processLifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc197a6f", new Object[]{processLifecycleOwner});
            return;
        }
        ckf.g(processLifecycleOwner, "this$0");
        processLifecycleOwner.dispatchPauseIfNeeded$lifecycle_process_release();
        processLifecycleOwner.dispatchStopIfNeeded$lifecycle_process_release();
    }

    @JvmStatic
    public static final LifecycleOwner get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LifecycleOwner) ipChange.ipc$dispatch("d37ca49a", new Object[0]);
        }
        return Companion.get();
    }

    @JvmStatic
    public static final void init$lifecycle_process_release(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bb5f13", new Object[]{context});
        } else {
            Companion.init$lifecycle_process_release(context);
        }
    }

    public final void activityPaused$lifecycle_process_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580afda2", new Object[]{this});
            return;
        }
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler = this.handler;
            ckf.d(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70deb30d", new Object[]{this});
            return;
        }
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i != 1) {
            return;
        }
        if (this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            this.pauseSent = false;
            return;
        }
        Handler handler = this.handler;
        ckf.d(handler);
        handler.removeCallbacks(this.delayedPauseRunnable);
    }

    public final void activityStarted$lifecycle_process_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2843037", new Object[]{this});
            return;
        }
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03483", new Object[]{this});
            return;
        }
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c6de3e", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        ckf.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ProcessLifecycleOwner$attach$1 processLifecycleOwner$attach$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/ProcessLifecycleOwner$attach$1");
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    return;
                }
                ckf.g(activity, "activity");
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment.Companion.get(activity).setProcessListener(ProcessLifecycleOwner.access$getInitializationListener$p(ProcessLifecycleOwner.this));
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    return;
                }
                ckf.g(activity, "activity");
                ProcessLifecycleOwner.this.activityPaused$lifecycle_process_release();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
                    return;
                }
                ckf.g(activity, "activity");
                final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
                ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(ProcessLifecycleOwner$attach$1$onActivityPreCreated$1 processLifecycleOwner$attach$1$onActivityPreCreated$1, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/ProcessLifecycleOwner$attach$1$onActivityPreCreated$1");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("4c8c2182", new Object[]{this, activity2});
                            return;
                        }
                        ckf.g(activity2, "activity");
                        ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("6c02c3ac", new Object[]{this, activity2});
                            return;
                        }
                        ckf.g(activity2, "activity");
                        ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    return;
                }
                ckf.g(activity, "activity");
                ProcessLifecycleOwner.this.activityStopped$lifecycle_process_release();
            }
        });
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3af5b3", new Object[]{this});
        } else if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2776bbb3", new Object[]{this});
        } else if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lifecycle) ipChange.ipc$dispatch("a130f2cb", new Object[]{this});
        }
        return this.registry;
    }
}
