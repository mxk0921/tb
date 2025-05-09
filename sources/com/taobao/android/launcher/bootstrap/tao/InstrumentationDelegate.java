package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.TestLooperManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tb.b8l;
import tb.fdf;
import tb.lm8;
import tb.ra;
import tb.sgg;
import tb.sng;
import tb.whh;
import tb.xqg;
import tb.zqg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InstrumentationDelegate extends Instrumentation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final AtomicReference<InstrumentationDelegate> f = new AtomicReference<>(null);

    /* renamed from: a  reason: collision with root package name */
    public ScheduleComposer f8146a;
    public final xqg b;
    public final lm8 c;
    public final Instrumentation d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f8147a;
        public final /* synthetic */ Bundle b;

        public a(Activity activity, Bundle bundle) {
            this.f8147a = activity;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InstrumentationDelegate.a(InstrumentationDelegate.this).a(this.f8147a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f8148a;
        public final /* synthetic */ Intent b;

        public b(Activity activity, Intent intent) {
            this.f8148a = activity;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            InstrumentationDelegate.b(InstrumentationDelegate.this).b(this.f8148a, this.b);
            whh.a("InstrumentationDelegate", "calledActivityOnNewIntent, activity=" + this.f8148a.getClass().getName() + ", intent=" + this.b);
        }
    }

    public InstrumentationDelegate(b8l b8lVar, Instrumentation instrumentation, sgg sggVar, Context context) {
        this.d = instrumentation;
        this.b = zqg.a(b8lVar, sggVar, instrumentation, context);
        this.c = new lm8(instrumentation);
    }

    public static /* synthetic */ lm8 a(InstrumentationDelegate instrumentationDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lm8) ipChange.ipc$dispatch("ce400efd", new Object[]{instrumentationDelegate});
        }
        return instrumentationDelegate.c;
    }

    public static /* synthetic */ xqg b(InstrumentationDelegate instrumentationDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xqg) ipChange.ipc$dispatch("5699f7b9", new Object[]{instrumentationDelegate});
        }
        return instrumentationDelegate.b;
    }

    public static void c(ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e99832", new Object[]{scheduleComposer});
            return;
        }
        InstrumentationDelegate instrumentationDelegate = f.get();
        if (instrumentationDelegate != null) {
            instrumentationDelegate.f8146a = scheduleComposer;
        }
    }

    public static boolean d(sgg sggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8347132d", new Object[]{sggVar})).booleanValue();
        }
        if (e.compareAndSet(false, true)) {
            return g(null, sggVar, null);
        }
        return true;
    }

    public static boolean f(b8l b8lVar, sgg sggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51eb38a5", new Object[]{b8lVar, sggVar})).booleanValue();
        }
        if (e.compareAndSet(false, true)) {
            return g(b8lVar, sggVar, null);
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(InstrumentationDelegate instrumentationDelegate, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/InstrumentationDelegate");
    }

    @Override // android.app.Instrumentation
    public TestLooperManager acquireLooperManager(Looper looper) {
        TestLooperManager acquireLooperManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return fdf.a(ipChange.ipc$dispatch("33272b0e", new Object[]{this, looper}));
        }
        acquireLooperManager = this.d.acquireLooperManager(looper);
        return acquireLooperManager;
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352bfd1a", new Object[]{this, activityMonitor});
        } else {
            this.d.addMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public void addResults(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1611138", new Object[]{this, bundle});
        } else {
            this.d.addResults(bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Instrumentation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void callActivityOnCreate(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.launcher.bootstrap.tao.InstrumentationDelegate.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "b0b66e33"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            com.taobao.android.launcher.bootstrap.tao.ScheduleComposer r1 = r4.f8146a
            if (r1 == 0) goto L_0x002b
            r1.onActivityPreCreated(r5, r6)
            if (r6 == 0) goto L_0x002b
            java.lang.String r1 = "__STATE_REWROTE__"
            boolean r0 = r6.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 0
            goto L_0x002c
        L_0x002b:
            r0 = r6
        L_0x002c:
            tb.xqg r1 = r4.b
            com.taobao.android.launcher.bootstrap.tao.InstrumentationDelegate$a r2 = new com.taobao.android.launcher.bootstrap.tao.InstrumentationDelegate$a
            r2.<init>(r5, r0)
            r1.a(r5, r0, r2)
            com.taobao.android.launcher.bootstrap.tao.ScheduleComposer r0 = r4.f8146a
            if (r0 == 0) goto L_0x003d
            r0.onActivityPostCreated(r5, r6)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.launcher.bootstrap.tao.InstrumentationDelegate.callActivityOnCreate(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eff9327", new Object[]{this, activity});
        } else {
            this.d.callActivityOnDestroy(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a938c6", new Object[]{this, activity, intent});
            return;
        }
        b bVar = new b(activity, intent);
        ScheduleComposer scheduleComposer = this.f8146a;
        if (scheduleComposer == null || scheduleComposer.a()) {
            bVar.run();
            return;
        }
        whh.a("InstrumentationDelegate", "callingActivityOnNewIntent, activity=" + activity.getClass().getName() + ", intent=" + intent);
        if (!this.f8146a.g(activity.getClass().getName().concat(".onNewIntent"), intent, bVar)) {
            bVar.run();
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd40b23", new Object[]{this, activity});
        } else {
            this.d.callActivityOnPause(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47da6f73", new Object[]{this, activity, bundle});
        } else {
            this.d.callActivityOnPostCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b70fc", new Object[]{this, activity});
        } else {
            this.d.callActivityOnRestart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81918861", new Object[]{this, activity, bundle});
        } else {
            this.c.b(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c748f2", new Object[]{this, activity});
        } else {
            this.d.callActivityOnResume(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d00a0e8", new Object[]{this, activity, bundle});
        } else {
            this.d.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba103a8f", new Object[]{this, activity});
        } else {
            this.d.callActivityOnStart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66276387", new Object[]{this, activity});
        } else {
            this.d.callActivityOnStop(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8d47d6", new Object[]{this, activity});
        } else {
            this.d.callActivityOnUserLeaving(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ad156b", new Object[]{this, application});
        } else {
            this.d.callApplicationOnCreate(application);
        }
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58f6d0b5", new Object[]{this, activityMonitor, new Integer(i)})).booleanValue();
        }
        return this.d.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8856fd40", new Object[]{this});
        } else {
            this.d.endPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void finish(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0c538b", new Object[]{this, new Integer(i), bundle});
        } else {
            this.d.finish(i, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public Bundle getAllocCounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("4a366cee", new Object[]{this});
        }
        return this.d.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public Bundle getBinderCounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d87c508f", new Object[]{this});
        }
        return this.d.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("d1cc68d8", new Object[]{this});
        }
        return this.d.getComponentName();
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.d.getContext();
    }

    @Override // android.app.Instrumentation
    public String getProcessName() {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[]{this});
        }
        processName = this.d.getProcessName();
        return processName;
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c49215a7", new Object[]{this});
        }
        return this.d.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UiAutomation) ipChange.ipc$dispatch("d8d4dc24", new Object[]{this}) : this.d.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c60caa9", new Object[]{this, activity, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.d.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96021605", new Object[]{this, activity, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.d.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("430f38a7", new Object[]{this})).booleanValue();
        }
        return this.d.isProfiling();
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("254c9c38", new Object[]{this, cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj}) : this.d.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("a20c09ba", new Object[]{this, classLoader, str, context});
        }
        return this.c.e(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            this.d.onCreate(bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.d.onDestroy();
        }
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d775c06", new Object[]{this, obj, th})).booleanValue();
        }
        if (this.c.f(obj, th)) {
            return true;
        }
        return this.d.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.d.onStart();
        }
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513077fd", new Object[]{this, activityMonitor});
        } else {
            this.d.removeMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8b0363", new Object[]{this, runnable});
        } else {
            this.d.runOnMainSync(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee86a20", new Object[]{this, new Integer(i)});
        } else {
            this.d.sendCharacterSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290f308d", new Object[]{this, new Integer(i)});
        } else {
            this.d.sendKeyDownUpSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffadc23", new Object[]{this, keyEvent});
        } else {
            this.d.sendKeySync(keyEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a99c81ac", new Object[]{this, motionEvent});
        } else {
            this.d.sendPointerSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5aa792", new Object[]{this, new Integer(i), bundle});
        } else {
            this.d.sendStatus(i, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860c6b85", new Object[]{this, str});
        } else {
            this.d.sendStringSync(str);
        }
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9087ef", new Object[]{this, motionEvent});
        } else {
            this.d.sendTrackballEventSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5cc2ef", new Object[]{this});
        } else {
            this.d.setAutomaticPerformanceSnapshots();
        }
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a7bf2", new Object[]{this, new Boolean(z)});
        } else {
            this.d.setInTouchMode(z);
        }
    }

    @Override // android.app.Instrumentation
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.d.start();
        }
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1a716f98", new Object[]{this, intent});
        }
        return this.d.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    @Deprecated
    public void startAllocCounting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4ce70d", new Object[]{this});
        } else {
            this.d.startAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786db9d9", new Object[]{this});
        } else {
            this.d.startPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a069fc6b", new Object[]{this});
        } else {
            this.d.startProfiling();
        }
    }

    @Override // android.app.Instrumentation
    @Deprecated
    public void stopAllocCounting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75d576d", new Object[]{this});
        } else {
            this.d.stopAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b019ccb", new Object[]{this});
        } else {
            this.d.stopProfiling();
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e836a8d", new Object[]{this, runnable});
        } else {
            this.d.waitForIdle(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cbd2ca", new Object[]{this});
        } else {
            this.d.waitForIdleSync();
        }
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("6083423b", new Object[]{this, activityMonitor});
        }
        return this.d.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("adbcb3c2", new Object[]{this, activityMonitor, new Long(j)});
        }
        return this.d.waitForMonitorWithTimeout(activityMonitor, j);
    }

    public static boolean g(b8l b8lVar, sgg sggVar, Context context) {
        try {
            Object b2 = ra.b();
            Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            InstrumentationDelegate instrumentationDelegate = new InstrumentationDelegate(b8lVar, (Instrumentation) declaredField.get(b2), sggVar, context);
            declaredField.set(b2, instrumentationDelegate);
            declaredField.setAccessible(false);
            sng.a(f, null, instrumentationDelegate);
            return true;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return false;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Instrumentation.ActivityMonitor) ipChange.ipc$dispatch("b7abb51a", new Object[]{this, intentFilter, activityResult, new Boolean(z)}) : this.d.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a741971d", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.d.callActivityOnPostCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8db8b", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.d.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129f8dd2", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.d.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation(int i) {
        UiAutomation uiAutomation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UiAutomation) ipChange.ipc$dispatch("ee3c0211", new Object[]{this, new Integer(i)});
        }
        uiAutomation = this.d.getUiAutomation(i);
        return uiAutomation;
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f0db1f2d", new Object[]{this, classLoader, str, intent});
        }
        ScheduleComposer scheduleComposer = this.f8146a;
        if (scheduleComposer != null) {
            scheduleComposer.c(str + ".newActivity", intent);
        }
        return this.b.c(classLoader, str, intent);
    }

    public static boolean e(sgg sggVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da4128c3", new Object[]{sggVar, context})).booleanValue();
        }
        if (e.compareAndSet(false, true)) {
            return g(null, sggVar, context);
        }
        return true;
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Instrumentation.ActivityMonitor) ipChange.ipc$dispatch("53717c55", new Object[]{this, str, activityResult, new Boolean(z)}) : this.d.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42345dd", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.d.callActivityOnCreate(activity, bundle, persistableBundle);
        }
    }
}
