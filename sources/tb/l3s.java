package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l3s implements yvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s0m f23097a = s0m.B();

    static {
        t2o.a(779092316);
        t2o.a(806355911);
    }

    public final k3s a(String str, PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k3s) ipChange.ipc$dispatch("5c96a711", new Object[]{this, str, phenixCreator});
        }
        if (!sbt.n()) {
            return new k3s(str, phenixCreator);
        }
        k3s k3sVar = new k3s(str, phenixCreator);
        k3sVar.d(new n3s(str));
        return k3sVar;
    }

    public xvd b(String str, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("1a8560ed", new Object[]{this, str, view, new Integer(i), new Integer(i2)});
        }
        s0m s0mVar = this.f23097a;
        if (s0mVar == null) {
            return new k3s();
        }
        if (view == null || (i2 > 0 && i > 0)) {
            return a(str, s0mVar.T(str).limitSize(view, i, i2));
        }
        return a(str, s0mVar.T(str).limitSize(view));
    }

    @Override // tb.yvd
    public xvd load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("e40eafc9", new Object[]{this, str});
        }
        return b(str, null, -1, -1);
    }
}
