package com.taobao.metrickit.event.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import java.util.HashMap;
import tb.ol8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LifecycleEventSource extends ol8 implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_ACTIVITY_CREATED = 101;
    public static final int ON_ACTIVITY_DESTROYED = 107;
    public static final int ON_ACTIVITY_PAUSED = 104;
    public static final int ON_ACTIVITY_RESUMED = 103;
    public static final int ON_ACTIVITY_SAVE_INSTANCE_STATE = 106;
    public static final int ON_ACTIVITY_STARTED = 102;
    public static final int ON_ACTIVITY_STOPPED = 105;
    public static final int ON_FRAGMENT_DESTROYED = 213;
    public static final int ON_FRAGMENT_PAUSED = 209;
    public static final int ON_FRAGMENT_PRE_ATTACHED = 201;
    public static final int ON_FRAGMENT_RESUMED = 208;
    public static final int ON_FRAGMENT_VIEW_DESTROYED = 212;
    public static final String PARAM_LIFECYCLE = "lifecycleStage";
    public static final String PARAM_PAGE = "page";
    public static final String PARAM_TIME = "time";

    public LifecycleEventSource(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(LifecycleEventSource lifecycleEventSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/lifecycle/LifecycleEventSource");
    }

    public static /* synthetic */ void u(LifecycleEventSource lifecycleEventSource, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1245527e", new Object[]{lifecycleEventSource, obj, new Integer(i)});
        } else {
            lifecycleEventSource.v(obj, i);
        }
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{4};
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            v(activity, 107);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            v(activity, 104);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            v(activity, 103);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        } else {
            v(activity, 106);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            v(activity, 102);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            v(activity, 105);
        }
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        } else {
            metricContext.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    public final void v(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da51f7f", new Object[]{this, obj, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page", obj);
        hashMap.put(PARAM_LIFECYCLE, Integer.valueOf(i));
        hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
        k(4, hashMap);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        v(activity, 101);
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.metrickit.event.lifecycle.LifecycleEventSource.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r4, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -1819213449:
                            super.onFragmentViewDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -1791925260:
                            super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -938247425:
                            super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -228225358:
                            super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case 1774959972:
                            super.onFragmentPreAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                            return null;
                        default:
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/lifecycle/LifecycleEventSource$1");
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentDestroyed(fragmentManager, fragment);
                    LifecycleEventSource.u(LifecycleEventSource.this, fragment, LifecycleEventSource.ON_FRAGMENT_DESTROYED);
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentPaused(fragmentManager, fragment);
                    LifecycleEventSource.u(LifecycleEventSource.this, fragment, 209);
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
                        return;
                    }
                    super.onFragmentPreAttached(fragmentManager, fragment, context);
                    LifecycleEventSource.u(LifecycleEventSource.this, fragment, 201);
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentResumed(fragmentManager, fragment);
                    LifecycleEventSource.u(LifecycleEventSource.this, fragment, 208);
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentViewDestroyed(fragmentManager, fragment);
                    LifecycleEventSource.u(LifecycleEventSource.this, fragment, 212);
                }
            }, true);
        }
    }
}
