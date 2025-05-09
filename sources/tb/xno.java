package tb;

import anetwork.channel.Request;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class xno implements fsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001665);
        t2o.a(993001664);
        t2o.a(993001663);
    }

    public abstract void a(String str, Map<String, Object> map);

    public abstract void b(String str, Object obj);

    public abstract void c(String str);

    public abstract void d(String str, Map<String, Object> map);

    public abstract void e(Map<String, String> map);

    public abstract void f(nsj nsjVar, Map<String, String> map);

    public abstract void g(Map<String, String> map);

    public abstract void h();

    public void i(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2de9e90", new Object[]{this, request});
        } else {
            o(request);
        }
    }

    public abstract void j(boolean z);

    public void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c183c3ea", new Object[]{this, map});
        } else {
            p(map);
        }
    }

    public void l(MtopBusiness mtopBusiness, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6e25a5", new Object[]{this, mtopBusiness, map});
        } else {
            q(mtopBusiness, map);
        }
    }

    public abstract void m();

    public abstract void n(Map<String, String> map);

    public abstract void o(Request request);

    public abstract void p(Map<String, String> map);

    public abstract void q(MtopBusiness mtopBusiness, Map<String, String> map);

    public abstract void r(Map<String, String> map);

    public abstract void s(long j, Map<String, String> map);

    public void t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2ed99e", new Object[]{this, map});
        } else {
            r(map);
        }
    }

    public abstract void u(Object obj, String str);

    public abstract void v(boolean z);

    public abstract void w(Map<String, String> map);

    public abstract void x(Map<String, String> map);
}
