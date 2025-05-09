package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ljr implements PanguApplication.CrossActivityLifecycleCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PanguApplication f23371a;

    static {
        t2o.a(779092748);
        t2o.a(670040081);
    }

    public ljr(PanguApplication panguApplication) {
        this.f23371a = panguApplication;
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
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            return;
        }
        wng.d = true;
        this.f23371a.unregisterCrossActivityLifecycleCallback(this);
    }
}
