package tb;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSInitializer:TMSBaseInitTask";

    /* renamed from: a  reason: collision with root package name */
    public final String f32605a;

    static {
        t2o.a(847249511);
    }

    public z8s(String str) {
        this.f32605a = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf35a00", new Object[]{this});
            return;
        }
        mdd e = vxm.b.e();
        e.j(this.f32605a + "-end-" + e(), SystemClock.uptimeMillis());
        TMSLogger.b(TAG, this.f32605a + "-end-" + e());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238ecc7d", new Object[]{this});
            return;
        }
        mdd e = vxm.b.e();
        e.j(this.f32605a + "-start-" + e(), SystemClock.uptimeMillis());
        TMSLogger.b(TAG, this.f32605a + "-start-" + e());
    }

    public void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502067f0", new Object[]{this, application, hashMap});
        } else if (q9s.Q3(e())) {
            TMSLogger.b(TAG, "Skip black list task: " + e());
        } else {
            b();
            try {
                f(application, hashMap);
            } catch (Throwable th) {
                TMSLogger.b(TAG, "Init task execute fail: " + th.getLocalizedMessage());
                TMSLogger.d(TAG, th);
            }
            a();
        }
    }

    public abstract TMSInitTaskExecutorType d();

    public abstract String e();

    public void f(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b491444e", new Object[]{this, application, hashMap});
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35afa6c7", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
