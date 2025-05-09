package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.error.alarm.monitor.sampling")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yf implements uab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f32036a = 1.0d;

    static {
        t2o.a(81789169);
        t2o.a(81789167);
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f32036a = xk.b("alarm_monitor_sampling", 1.0d);
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final boolean r(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cf3e16", new Object[]{this, new Double(d), new Double(d2)})).booleanValue();
        }
        int i = (d > vu3.b.GEO_NOT_SUPPORT ? 1 : (d == vu3.b.GEO_NOT_SUPPORT ? 0 : -1));
        if (i == 0) {
            return false;
        }
        if (d == 1.0d) {
            return true;
        }
        double random = Math.random();
        if (i < 0 || d > 1.0d) {
            if (random < d2) {
                return true;
            }
            return false;
        } else if (random < d) {
            return true;
        } else {
            return false;
        }
    }

    @Override // tb.uab
    public boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85da919c", new Object[]{this})).booleanValue();
        }
        return r(this.f32036a, 1.0d);
    }
}
