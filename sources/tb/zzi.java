package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class zzi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NORMAL_REQ = "NORMAL";
    public static final String SHUTDOWN_REQ = "SHUTDOWN";

    /* renamed from: a  reason: collision with root package name */
    public final String f33121a = "MonitorTask";
    public String b = "NORMAL";

    static {
        t2o.a(628097114);
    }

    public abstract void c();

    public fy1 d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fy1) ipChange.ipc$dispatch("46e062d5", new Object[]{this, new Integer(i)});
        }
        return MsgRouter.e().f().b(i);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15eb2d52", new Object[]{this});
        }
        return this.b;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b336a24", new Object[]{this});
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            c();
        } catch (Exception e) {
            MsgLog.g(this.f33121a, "MonitorTask run error");
            e.printStackTrace();
        }
    }

    public abstract int h();
}
