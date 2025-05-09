package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ma4 f24087a;

    static {
        t2o.a(665845779);
    }

    public mjp(String str, ma4 ma4Var) {
        this.f24087a = ma4Var;
    }

    public ma4 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ma4) ipChange.ipc$dispatch("1c36d94b", new Object[]{this});
        }
        return this.f24087a;
    }
}
