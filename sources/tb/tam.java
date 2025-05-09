package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tam implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<c> f28593a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final tam f28594a = new tam();

        public static /* synthetic */ tam a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tam) ipChange.ipc$dispatch("344730b6", new Object[0]);
            }
            return f28594a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Activity f28595a;
        public final Stack<Activity> b;

        public c() {
            this.b = new Stack<>();
        }

        public static /* synthetic */ Activity a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("b09ec67a", new Object[]{cVar});
            }
            return cVar.f28595a;
        }

        public static /* synthetic */ Activity b(c cVar, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("3c3493a6", new Object[]{cVar, activity});
            }
            cVar.f28595a = activity;
            return activity;
        }

        public static /* synthetic */ Stack c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Stack) ipChange.ipc$dispatch("bce0adb8", new Object[]{cVar});
            }
            return cVar.b;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            return super.equals(obj);
        }
    }

    public static tam b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tam) ipChange.ipc$dispatch("b5b53a91", new Object[0]);
        }
        return b.a();
    }

    public final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47008769", new Object[]{this, activity});
        } else if (this.f28593a.empty()) {
            this.f28593a.push(new c());
            c.b(this.f28593a.peek(), activity);
        } else if (olq.e(activity)) {
            c.c(this.f28593a.peek()).push(activity);
        } else if (!olq.f(activity)) {
            this.f28593a.push(new c());
            c.b(this.f28593a.peek(), activity);
        }
    }

    public final void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765c4e8c", new Object[]{this, activity});
            return;
        }
        Iterator<c> it = this.f28593a.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                if (c.a(next) == activity) {
                    while (!c.c(next).empty()) {
                        Activity activity2 = (Activity) c.c(next).pop();
                        if (activity2 != null) {
                            TLog.loge("TBAutoSize.StackManager", "removeActivity: " + activity2);
                        }
                    }
                    it.remove();
                }
                if (c.c(next).contains(activity)) {
                    c.c(next).remove(activity);
                }
            }
        }
    }

    public void e(Activity activity) {
        Activity activity2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29244186", new Object[]{this, activity});
            return;
        }
        Iterator<c> it = this.f28593a.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null && c.a(next) == activity && !c.c(next).empty()) {
                while (!c.c(next).empty() && (activity2 = (Activity) c.c(next).pop()) != null) {
                    TLog.loge("TBAutoSize.StackManager", "removeActivity: " + activity2);
                    activity2.finish();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            d(activity);
        }
    }

    public tam() {
        this.f28593a = new Stack<>();
    }

    public boolean f(Activity activity, Intent intent) {
        Activity activity2;
        Activity activity3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d236e07", new Object[]{this, activity, intent})).booleanValue();
        }
        Iterator<c> it = this.f28593a.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                if (c.a(next) == activity && !c.c(next).empty()) {
                    while (!c.c(next).empty() && (activity3 = (Activity) c.c(next).pop()) != null) {
                        TLog.loge("TBAutoSize.StackManager", "singleTask removeRootActivity: " + activity3);
                        activity3.finish();
                    }
                    z = c(activity, intent);
                }
                if (c.a(next) != activity && c.c(next).contains(activity)) {
                    while (true) {
                        activity2 = (Activity) c.c(next).peek();
                        if (activity2 == null || activity2 == activity) {
                            break;
                        }
                        TLog.loge("TBAutoSize.StackManager", "singleTask removePopActivity: " + activity2);
                        c.c(next).pop();
                        activity2.finish();
                    }
                    if (activity2 == activity) {
                        z = c(activity, intent);
                    }
                }
            }
        }
        return z;
    }

    public final boolean c(Activity activity, Intent intent) {
        if (intent == null) {
            intent = activity.getIntent();
        }
        try {
            Method declaredMethod = activity.getClass().getDeclaredMethod("onNewIntent", Intent.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, intent);
            return true;
        } catch (IllegalAccessException e) {
            TLog.loge("TBAutoSize.StackManager", "performNewIntent error: ", e);
            return false;
        } catch (NoSuchMethodException e2) {
            TLog.loge("TBAutoSize.StackManager", "performNewIntent error: ", e2);
            return false;
        } catch (InvocationTargetException e3) {
            TLog.loge("TBAutoSize.StackManager", "performNewIntent error: ", e3);
            return false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
