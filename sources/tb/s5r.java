package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class s5r implements lab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855754);
        t2o.a(989855836);
    }

    @Override // tb.lab
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5679644f", new Object[]{this});
        }
        return dgw.APM_VIEW_VALID;
    }

    @Override // tb.lab
    public void b(View view, String str, Object obj) {
        mdd g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821ca4a5", new Object[]{this, view, str, obj});
            return;
        }
        if (view != null) {
            try {
                g = vxm.b.g(view);
            } catch (Exception unused) {
                return;
            }
        } else {
            g = null;
        }
        if (g != null && g.isAlive()) {
            g.l(str, obj);
        }
        mdd e = vxm.b.e();
        if (e.isAlive()) {
            e.l(str, obj);
        }
        lcn.a(RVLLevel.Info, "WindVane/TBAPMAdapter").j("addPropertyIfAbsent").a("key", str).a("value", obj).f();
    }

    @Override // tb.lab
    public void c(View view, String str, long j) {
        mdd g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115c420c", new Object[]{this, view, str, new Long(j)});
            return;
        }
        if (view != null) {
            try {
                g = vxm.b.g(view);
            } catch (Exception unused) {
                return;
            }
        } else {
            g = null;
        }
        if (g != null && g.isAlive()) {
            g.j(str, j);
        }
        mdd e = vxm.b.e();
        if (e.isAlive()) {
            e.j(str, j);
        }
        lcn.a(RVLLevel.Info, "WindVane/TBAPMAdapter").j("addStage").a("stageName", str).a("timestamp", Long.valueOf(j)).f();
    }

    @Override // tb.lab
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1847996d", new Object[]{this})).intValue();
        }
        return dgw.APM_VIEW_TOKEN;
    }

    @Override // tb.lab
    public void e(View view, String str, Object obj) {
        mdd g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6fe33b", new Object[]{this, view, str, obj});
            return;
        }
        if (view != null) {
            try {
                g = vxm.b.g(view);
            } catch (Exception unused) {
                return;
            }
        } else {
            g = null;
        }
        if (g != null && g.isAlive()) {
            g.a(str, obj);
        }
        mdd e = vxm.b.e();
        if (e.isAlive()) {
            e.a(str, obj);
        }
        lcn.a(RVLLevel.Info, "WindVane/TBAPMAdapter").j("addProperty").a("key", str).a("value", obj).f();
    }

    @Override // tb.lab
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("306fcaf4", new Object[]{this});
        }
        return dgw.APM_VIEW_INVALID;
    }

    @Override // tb.lab
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7dce09f4", new Object[]{this})).intValue();
        }
        return dgw.VIEW_MANUAL_CALCULATE;
    }

    @Override // tb.lab
    public void h(View view, String str, long j) {
        mdd g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b48a062", new Object[]{this, view, str, new Long(j)});
            return;
        }
        if (view != null) {
            try {
                g = vxm.b.g(view);
            } catch (Exception unused) {
                return;
            }
        } else {
            g = null;
        }
        if (g != null && g.isAlive()) {
            g.m(str, j);
        }
        mdd e = vxm.b.e();
        if (e.isAlive()) {
            e.m(str, j);
        }
        lcn.a(RVLLevel.Info, "WindVane/TBAPMAdapter").j("addStageIfAbsent").a("stageName", str).a("timestamp", Long.valueOf(j)).f();
    }
}
