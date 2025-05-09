package com.alibaba.wireless.security.securitybody;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import android.widget.EditText;
import com.alibaba.wireless.security.framework.IRouterComponent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes.dex */
public class LifeCycle {
    public static final int APP_BACKGROUND = 0;
    public static final int APP_FOREGROUND = 1;
    public static final int APP_IGNORE = 2;

    /* renamed from: а  reason: contains not printable characters */
    private static final String f374 = "LifeCycle";

    /* renamed from: б  reason: contains not printable characters */
    private static boolean f375 = false;

    /* renamed from: в  reason: contains not printable characters */
    private static Handler f376 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static IRouterComponent f377 = null;

    /* renamed from: д  reason: contains not printable characters */
    private static ActivityManager f378 = null;

    /* renamed from: е  reason: contains not printable characters */
    private static Context f379 = null;

    /* renamed from: ж  reason: contains not printable characters */
    private static volatile Activity f380 = null;

    /* renamed from: з  reason: contains not printable characters */
    private static final View.AccessibilityDelegate f381 = new C0173();

    /* renamed from: и  reason: contains not printable characters */
    private static final List<Activity> f382 = new ArrayList();

    /* renamed from: й  reason: contains not printable characters */
    private static WeakReference<Activity> f383 = new WeakReference<>(null);

    /* renamed from: к  reason: contains not printable characters */
    private static WeakReference<Activity> f384 = new WeakReference<>(null);

    /* renamed from: л  reason: contains not printable characters */
    private static int f385 = -1;

    /* renamed from: м  reason: contains not printable characters */
    private static final Handler f386 = new Handler(Looper.getMainLooper());

    /* renamed from: ё  reason: contains not printable characters */
    private static boolean f387 = false;

    /* renamed from: com.alibaba.wireless.security.securitybody.LifeCycle$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class RunnableC0171 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ int f388;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ int f389;

        RunnableC0171(int i, int i2) {
            this.f388 = i;
            this.f389 = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f388;
            if (i == 2 || ((i != 1 || LifeCycle.m242(LifeCycle.f379)) && !(this.f388 == 0 && LifeCycle.m242(LifeCycle.f379)))) {
                if (LifeCycle.f375) {
                    Log.i(LifeCycle.f374, "notifyCurrentStatus( " + this.f389 + " )");
                }
                if (LifeCycle.f377 != null) {
                    LifeCycle.f377.doCommand(20109, Integer.valueOf(this.f389));
                }
            } else if (LifeCycle.f375) {
                Log.i(LifeCycle.f374, "notifyCurrentStatus return ( " + this.f389 + " " + this.f388 + " )");
            }
        }
    }

    /* renamed from: com.alibaba.wireless.security.securitybody.LifeCycle$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0172 implements Application.ActivityLifecycleCallbacks {
        C0172() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass().getName();
            Activity unused = LifeCycle.f380 = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Activity unused = LifeCycle.f380 = null;
        }
    }

    /* renamed from: com.alibaba.wireless.security.securitybody.LifeCycle$в  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0173 extends View.AccessibilityDelegate {
        C0173() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (LifeCycle.f377 != null) {
                try {
                    LifeCycle.f377.doCommand(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_DOWNLOAD_VIDEO_FPS, Integer.valueOf(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.alibaba.wireless.security.securitybody.LifeCycle$г  reason: contains not printable characters */
    /* loaded from: classes.dex */
    private static class C0174 extends View.AccessibilityDelegate {

        /* renamed from: а  reason: contains not printable characters */
        private final View.AccessibilityDelegate f390;

        public C0174(View.AccessibilityDelegate accessibilityDelegate) {
            this.f390 = accessibilityDelegate;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void addExtraDataToAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            if (accessibilityDelegate == null || Build.VERSION.SDK_INT < 26) {
                super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            } else {
                accessibilityDelegate.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            return accessibilityDelegate != null ? accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            return (accessibilityDelegate == null || Build.VERSION.SDK_INT < 16) ? super.getAccessibilityNodeProvider(view) : accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            return accessibilityDelegate != null ? accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (LifeCycle.f377 != null) {
                try {
                    LifeCycle.f377.doCommand(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_DOWNLOAD_VIDEO_FPS, Integer.valueOf(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            return (accessibilityDelegate == null || Build.VERSION.SDK_INT < 16) ? super.performAccessibilityAction(view, i, bundle) : accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            View.AccessibilityDelegate accessibilityDelegate = this.f390;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public static Activity getCurrentActivity() {
        return f380;
    }

    public static int init(Context context, IRouterComponent iRouterComponent) {
        if (f375) {
            Log.i(f374, "call lifecycle init begin");
        }
        if (!(context == null || iRouterComponent == null || !(context instanceof Application))) {
            f379 = context;
            f377 = iRouterComponent;
            m241();
            if (f376 == null) {
                return 0;
            }
            f378 = (ActivityManager) context.getSystemService("activity");
        }
        return 0;
    }

    public static int notifyCurrentStatus(int i, int i2) {
        Handler handler = f376;
        if (handler == null) {
            return 0;
        }
        handler.post(new RunnableC0171(i2, i));
        return 0;
    }

    public static void onActivityDestroy(Activity activity) {
        if (Looper.myLooper() == Looper.getMainLooper() && activity != null) {
            f382.remove(activity);
        }
    }

    public static void onActivityStart(Activity activity, int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!(i == 0 || activity == null || activity.getWindow() == null || f382.contains(activity))) {
                f382.add(activity);
                View decorView = activity.getWindow().getDecorView();
                if (decorView != null) {
                    m244(decorView);
                } else {
                    return;
                }
            }
            f383 = new WeakReference<>(activity);
        }
    }

    public static void onActivityStop(Activity activity) {
        if (Looper.myLooper() == Looper.getMainLooper() && f383.get() == activity) {
            f383 = new WeakReference<>(null);
        }
    }

    public static void registerCallBack() {
        Context context;
        if (Build.VERSION.SDK_INT >= 16 && (context = f379) != null && (context instanceof Application)) {
            ((Application) context).registerActivityLifecycleCallbacks(new C0172());
        }
    }

    /* renamed from: е  reason: contains not printable characters */
    private static void m239(View view) {
        if (!m243(view.getContext())) {
            if ((view instanceof Button) || (view instanceof EditText) || view.isClickable() || view.isLongClickable()) {
                view.setAccessibilityDelegate(f381);
            }
        }
    }

    /* renamed from: ж  reason: contains not printable characters */
    private static View.AccessibilityDelegate m240(View view) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityDelegate", new Class[0]);
            declaredMethod.setAccessible(true);
            return (View.AccessibilityDelegate) declaredMethod.invoke(view, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: з  reason: contains not printable characters */
    private static void m241() {
        HandlerThread handlerThread = new HandlerThread("SGActivityStatus");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            f376 = new Handler(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: и  reason: contains not printable characters */
    public static boolean m242(Context context) {
        boolean z = false;
        try {
            ActivityManager activityManager = f378;
            if (activityManager != null) {
                String packageName = context.getPackageName();
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && runningTasks.size() > 0) {
                    ComponentName componentName = runningTasks.get(0).topActivity;
                    if (packageName.equals(componentName.getPackageName())) {
                        z = context.getPackageManager().getActivityInfo(componentName, 0).processName.equals(context.getApplicationInfo().processName);
                    }
                }
            }
        } catch (Exception e) {
            if (f375) {
                Log.e(f374, e.toString());
            }
        }
        if (f375) {
            Log.i(f374, "isAppOnTopActivity() = " + z);
        }
        return z;
    }

    /* renamed from: й  reason: contains not printable characters */
    private static boolean m243(Context context) {
        return "com.youku.phone".equals(context.getPackageName());
    }

    /* renamed from: ё  reason: contains not printable characters */
    private static int m244(View view) {
        if (view == null) {
            return 0;
        }
        if (!(view instanceof ViewGroup)) {
            return 1;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add((ViewGroup) view);
        int i = 0;
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) linkedList.removeFirst();
            m239(viewGroup);
            i++;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof ViewGroup) {
                    linkedList.addLast((ViewGroup) childAt);
                } else {
                    m239(childAt);
                    i++;
                }
            }
        }
        return i;
    }
}
