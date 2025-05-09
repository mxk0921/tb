package tb;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.performance.WMInstanceApm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v3x implements s5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WMInstanceApm f29772a;
    public final WeexInstanceImpl b;

    static {
        t2o.a(982515872);
        t2o.a(982515873);
    }

    public v3x(WeexInstanceImpl weexInstanceImpl) {
        this.b = weexInstanceImpl;
        WMInstanceApm wMInstanceApm = new WMInstanceApm(weexInstanceImpl, r3x.a());
        this.f29772a = wMInstanceApm;
        wMInstanceApm.c(WMInstanceApm.KEY_PAGE_METRIC_SDK_INIT_TIME, weexInstanceImpl.getSDKInitTime());
        g();
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    @Override // tb.s5x
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34e8ed6", new Object[]{this, str, new Long(j)});
        } else {
            c().c(str, j);
        }
    }

    @Override // tb.s5x
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11efdb1", new Object[]{this, str, str2});
        } else {
            c().b(str, str2);
        }
    }

    public WMInstanceApm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WMInstanceApm) ipChange.ipc$dispatch("35897668", new Object[]{this});
        }
        return this.f29772a;
    }

    public void d(int i, View view, JSONObject jSONObject, rce rceVar, ice iceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40896dc3", new Object[]{this, new Integer(i), view, jSONObject, rceVar, iceVar});
        } else {
            c().h(i, view, jSONObject, rceVar, iceVar);
        }
    }

    public void e(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57111ae", new Object[]{this, new Integer(i), str, new Long(j)});
        } else {
            c().i(i, str, j);
        }
    }

    public void g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c33f36a", new Object[]{this});
            return;
        }
        WMInstanceApm wMInstanceApm = this.f29772a;
        if (this.b.getContext() instanceof Activity) {
            str = this.b.getContext().getClass().getSimpleName();
        } else {
            str = "unKnowContainer";
        }
        wMInstanceApm.b("wxContainerName", str);
    }
}
