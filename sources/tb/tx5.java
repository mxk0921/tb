package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tx5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d56 f29015a;

    static {
        t2o.a(444597911);
    }

    public tx5(d56 d56Var) {
        this.f29015a = d56Var;
    }

    public uw5 a(wx5 wx5Var, uw5[] uw5VarArr, vvb vvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("d3e9cb15", new Object[]{this, wx5Var, uw5VarArr, vvbVar});
        }
        return new ay5(this.f29015a).c(wx5Var, uw5VarArr, vvbVar);
    }
}
