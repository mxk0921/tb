package tb;

import android.app.Application;
import android.os.Handler;
import android.util.Log;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f27524a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(int i, float f);
    }

    public static HardWareInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HardWareInfo) ipChange.ipc$dispatch("3710f486", new Object[0]);
        }
        if (z9a.f32627a == null) {
            return null;
        }
        HardWareInfo hardWareInfo = new HardWareInfo(z9a.f32627a);
        z9a.f32627a.registerActivityLifecycleCallbacks(new com.ali.alihadeviceevaluator.old.a(hardWareInfo));
        lp0.d().f();
        int n = hardWareInfo.n();
        if (n > 0) {
            lp0.d().i(n);
        }
        mi7.e(hardWareInfo);
        return hardWareInfo;
    }

    public rp0 b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rp0) ipChange.ipc$dispatch("d48b0a4f", new Object[]{this, application});
        }
        z9a.f32627a = application;
        return this;
    }

    public rp0 c(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rp0) ipChange.ipc$dispatch("45dae7a6", new Object[]{this, handler});
        }
        z9a.b = handler;
        return this;
    }

    public rp0 d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rp0) ipChange.ipc$dispatch("60a97f8d", new Object[]{this, aVar});
        }
        this.f27524a = aVar;
        return this;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (z9a.f32627a == null) {
            Log.e(z9a.TAG, "you must setContext before start!");
        } else {
            if (!ABGlobal.isFeatureOpened(z9a.f32627a, "deviceScore32DowngradeOff")) {
                z9a.c = br2.b();
            }
            qp0.d(this.f27524a);
            mi7.g(qp0.f26867a);
        }
    }
}
