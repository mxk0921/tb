package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ets extends tu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f18812a;

    public ets(e eVar) {
        this.f18812a = eVar;
    }

    public static /* synthetic */ Object ipc$super(ets etsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/TaoAppDelegate$3");
    }

    @Override // tb.tu, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
        } else {
            e.a(this.f18812a).y().j(activity);
        }
    }

    @Override // tb.tu, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
        } else {
            e.a(this.f18812a).y().u(activity);
        }
    }
}
