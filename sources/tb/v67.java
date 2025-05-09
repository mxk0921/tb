package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v67 extends osd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(822083600);
    }

    public static /* synthetic */ Object ipc$super(v67 v67Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/log/DefaultStatistic");
    }

    @Override // tb.osd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1309896c", new Object[]{this});
        } else {
            urr.f("DefaultMonitor", "EVENT_LOAD", new Object[0]);
        }
    }

    @Override // tb.osd
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8641cbe", new Object[]{this, str, str2});
        } else {
            urr.f("DefaultMonitor", "EVENT_LOAD_ERROR. errCode=%s, errMsg=%s", str, str2);
        }
    }

    @Override // tb.osd
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372eb89", new Object[]{this, str});
        } else {
            urr.f("DefaultMonitor", "EVENT_LOAD_PLUGIN. pluginName=%s", str);
        }
    }

    @Override // tb.osd
    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640a3115", new Object[]{this, str, str2, str3});
        } else {
            urr.f("DefaultMonitor", "EVENT_LOAD_PLUGIN_ERROR. pluginName=%s, errCode=%s, errMsg=%s", str, str2, str3);
        }
    }

    @Override // tb.osd
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193e7e3c", new Object[]{this, str});
        } else {
            urr.f("DefaultMonitor", "EVENT_LOAD_PLUGIN_SUCCESS. pluginName=%s", str);
        }
    }

    @Override // tb.osd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6b5265", new Object[]{this});
        } else {
            urr.f("DefaultMonitor", "EVENT_LOAD_SUCCESS", new Object[0]);
        }
    }

    @Override // tb.osd
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f751da", new Object[]{this, str});
        } else {
            urr.a("DefaultMonitor", "Mock. mockType=%s", str);
        }
    }

    @Override // tb.osd
    public void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3659e4", new Object[]{this, str, str2, str3});
        } else {
            urr.a("DefaultMonitor", "Mock Error. mockType=%s, errCode=%s, errMsg=%s", str, str2, str3);
        }
    }

    @Override // tb.osd
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5a8acb", new Object[]{this, str});
        } else {
            urr.a("DefaultMonitor", "Mock Success. mockType=%s", str);
        }
    }
}
