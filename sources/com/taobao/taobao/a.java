package com.taobao.taobao;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bf3;
import tb.c21;
import tb.ic;
import tb.t11;
import tb.yq7;
import tb.zzb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements t11, ApplicationBackgroundChangedDispatcher.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<AbstractC0733a> b = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final ApplicationBackgroundChangedDispatcher f12901a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taobao.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0733a {
        void d();

        void f();
    }

    public a() {
        zzb<?> b2 = yq7.b(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (b2 instanceof ApplicationBackgroundChangedDispatcher) {
            ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher = (ApplicationBackgroundChangedDispatcher) b2;
            this.f12901a = applicationBackgroundChangedDispatcher;
            applicationBackgroundChangedDispatcher.addListener(this);
        }
        c21.a(this, true);
    }

    public void a(AbstractC0733a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fa158e", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArrayList) b).add(aVar);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519a650f", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) b).iterator();
        while (it.hasNext()) {
            ((AbstractC0733a) it.next()).f();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52eb91b6", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) b).iterator();
        while (it.hasNext()) {
            ((AbstractC0733a) it.next()).d();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher = this.f12901a;
            if (applicationBackgroundChangedDispatcher != null) {
                applicationBackgroundChangedDispatcher.removeListener(this);
            }
            c21.j(this);
            ((CopyOnWriteArrayList) b).clear();
        } catch (Throwable unused) {
        }
    }

    public void e(AbstractC0733a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbb2df1", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArrayList) b).remove(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "onActivityPaused: ".concat(activity.getClass().getSimpleName()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "onActivityResumed: ".concat(activity.getClass().getSimpleName()));
        if ("CashDeskActivity".equals(activity.getClass().getSimpleName())) {
            c();
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
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "onChanged ：" + i);
        if (i == 0) {
            ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher = this.f12901a;
            if (applicationBackgroundChangedDispatcher != null) {
                applicationBackgroundChangedDispatcher.removeListener(this);
            }
            b();
        }
        if (i == 1) {
            try {
                c21.j(this);
            } catch (Throwable th) {
                bf3.g("REMOVE_ACTIVITY_LIFECYCLE", th.getMessage());
            }
        }
    }
}
