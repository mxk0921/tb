package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;
import tb.f5o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qzc f23266a;

    static {
        t2o.a(283115568);
        t2o.a(283115567);
    }

    public lcy(qzc qzcVar) {
        this.f23266a = qzcVar;
    }

    public void a(AdMonitorType adMonitorType, String str, szc szcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52e2a1f", new Object[]{this, adMonitorType, str, szcVar});
        } else {
            this.f23266a.a(new f5o.a(str).h(20000).i(30000).j(3).f(HttpConstant.USER_AGENT, wzo.b()).g(), szcVar);
        }
    }
}
