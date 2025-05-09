package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.e;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.lifecycle.PanguApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dts extends tu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PanguApplication f18061a;
    public final /* synthetic */ e b;

    public dts(e eVar, PanguApplication panguApplication) {
        this.b = eVar;
        this.f18061a = panguApplication;
    }

    public static /* synthetic */ Object ipc$super(dts dtsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/TaoAppDelegate$2");
    }

    @Override // tb.tu, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            return;
        }
        e.a(this.b).y().s(activity);
        e.b(this.b).b(true, this.f18061a);
        e.c(this.b).e();
        if (!e.d(this.b) && !LauncherRuntime.i(activity.getIntent())) {
            e.a(this.b).y().c(activity);
        }
        this.f18061a.unregisterCrossActivityLifecycleCallback(this);
    }
}
