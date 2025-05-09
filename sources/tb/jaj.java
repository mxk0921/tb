package tb;

import android.os.Bundle;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.debug.Debug;
import com.alibaba.ut.abtest.internal.util.ClassUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jaj implements iaj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public czu f21867a;
    public czu b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        t2o.a(961544409);
        t2o.a(961544408);
    }

    @Override // tb.iaj
    public VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("9fffdb2d", new Object[]{this, str, str2, map, new Boolean(z), obj});
        }
        if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getVariations方法");
            return null;
        }
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            return czuVar.a(str, str2, map, z, obj);
        }
        return null;
    }

    @Override // tb.iaj
    public VariationSet b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("5502730f", new Object[]{this, str});
        }
        if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用activateBySwitchName方法");
            return null;
        }
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            return czuVar.b(str);
        }
        return null;
    }

    @Override // tb.iaj
    public List<EVOExperiment> c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8a6e6a6e", new Object[]{this, str, map});
        }
        if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getExperimentsByDomain方法");
            return null;
        }
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            return czuVar.c(str, map);
        }
        return null;
    }

    @Override // tb.iaj
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2948a711", new Object[]{this});
        }
        if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getAppActivateTrackId方法");
            return null;
        }
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            return czuVar.d();
        }
        return null;
    }

    @Override // tb.iaj
    public VariationSet g(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("d6ea12f5", new Object[]{this, str, str2, map, obj});
        }
        if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getVariationsV2方法");
            return null;
        }
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            return czuVar.g(str, str2, map, obj);
        }
        return null;
    }

    @Override // tb.iaj
    public void h(Debug debug) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0bc9ca", new Object[]{this, debug});
        } else if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用startRealTimeDebug方法");
        } else {
            czu czuVar = this.f21867a;
            if (czuVar != null) {
                czuVar.h(debug);
            }
        }
    }

    @Override // tb.iaj
    public void i(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e6f71f", new Object[]{this, str, str2, str3, str4});
        } else if (!this.c.get()) {
            ogh.l("MultiProcessServiceImpl", "多进程服务未初始化，无法调用reportLog方法");
        } else {
            czu czuVar = this.f21867a;
            if (czuVar != null) {
                czuVar.i(str, str2, str3, str4);
            }
        }
    }

    @Override // tb.iaj
    public void j(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828685b4", new Object[]{this, new Integer(i), bundle});
        } else if (!this.c.get()) {
            ogh.l("MultiProcessServiceImpl", "多进程服务未初始化，无法调用sendMsgToAllSubProcess方法");
        } else {
            czu czuVar = this.b;
            if (czuVar != null) {
                czuVar.j(i, bundle);
            }
        }
    }

    public final czu m() {
        Class<?> b = ClassUtils.b(m.MULTIPROCESS_CLIENT_CLASSNAME, jaj.class.getClassLoader());
        if (b != null) {
            try {
                return (czu) b.newInstance();
            } catch (Throwable th) {
                ku0.j("MultiProcessServiceImpl.createMainMultiProcessClient", th);
                ogh.m("MultiProcessServiceImpl", th.getMessage(), th);
            }
        }
        return null;
    }

    public final void n(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615756f", new Object[]{this, new Boolean(z)});
            return;
        }
        ogh.e("MultiProcessServiceImpl", "createMultiProcessClientIfNotExist. multiProcessClient=" + this.f21867a + ",isMultiProcessEnable=" + n.j().s());
        if (this.f21867a != null || !n.j().s()) {
            return;
        }
        if (z) {
            this.f21867a = new dzu();
            return;
        }
        czu m = m();
        this.f21867a = m;
        if (m == null) {
            str = ResultCode.MSG_FAILED;
        } else {
            str = ResultCode.MSG_SUCCESS;
        }
        ogh.e("MultiProcessServiceImpl", "子进程注册多进程通信".concat(str));
    }

    @Override // tb.iaj
    public boolean e(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("286e2d8d", new Object[]{this, str, map, obj})).booleanValue();
        }
        if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用addActivateServerExperimentGroupV2方法");
            return false;
        }
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            return czuVar.e(str, map, obj);
        }
        return false;
    }

    @Override // tb.iaj
    public boolean f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a5e39c", new Object[]{this, str, obj})).booleanValue();
        }
        if (!this.c.get()) {
            ogh.n("MultiProcessServiceImpl", "多进程服务未初始化，无法调用addActivateServerExperimentGroup方法");
            return false;
        }
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            return czuVar.f(str, obj);
        }
        return false;
    }

    @Override // tb.iaj
    public boolean k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd0244c1", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ogh.e("MultiProcessServiceImpl", "initMainProcessMsgSender. initialized=" + this.d.get());
        if (this.d.get()) {
            return true;
        }
        try {
            if (n.j().s() && z) {
                czu m = m();
                if (m != null) {
                    ogh.e("MultiProcessServiceImpl", "主进程注册多进程通信成功");
                    this.b = m;
                    m.initialize();
                } else {
                    ogh.l("MultiProcessServiceImpl", "主进程注册多进程通信失败");
                    return false;
                }
            }
            this.d.set(true);
            return true;
        } catch (Throwable th) {
            ku0.j("MultiProcessServiceImpl.initMainProcessMsgSender", th);
            return false;
        }
    }

    @Override // tb.iaj
    public synchronized boolean l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a6c640", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ogh.e("MultiProcessServiceImpl", "initMultiProcessClient. initialized=" + this.c.get());
        if (this.c.get()) {
            return true;
        }
        n(z);
        czu czuVar = this.f21867a;
        if (czuVar != null) {
            czuVar.initialize();
            if (this.f21867a == null) {
                dzu dzuVar = new dzu();
                this.f21867a = dzuVar;
                dzuVar.initialize();
            }
            this.c.set(true);
            return true;
        }
        if (czuVar == null) {
            dzu dzuVar2 = new dzu();
            this.f21867a = dzuVar2;
            dzuVar2.initialize();
        }
        this.c.set(true);
        return false;
    }
}
