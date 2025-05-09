package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.zho;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o9t implements zho.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tmc f25236a;

    public o9t(tmc tmcVar) {
        this.f25236a = tmcVar;
    }

    public hbn a(bu4 bu4Var, hbn hbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbn) ipChange.ipc$dispatch("c78ddcb8", new Object[]{this, bu4Var, hbnVar});
        }
        return new v6n(hbnVar, bu4Var.d, bu4Var.f16635a, this.f25236a, bu4Var.c);
    }
}
