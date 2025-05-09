package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ca0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ja0 f16933a;

    static {
        t2o.a(815793208);
    }

    public ca0(ja0 ja0Var) {
        this.f16933a = ja0Var;
    }

    public static ca0 a(ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ca0) ipChange.ipc$dispatch("7a14054", new Object[]{ja0Var});
        }
        return new ca0(ja0Var);
    }
}
