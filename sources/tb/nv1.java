package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lza f24965a;

    static {
        t2o.a(491782810);
    }

    public nv1(lza lzaVar) {
        this.f24965a = lzaVar;
    }

    public lza w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lza) ipChange.ipc$dispatch("c63bb73b", new Object[]{this});
        }
        return this.f24965a;
    }
}
