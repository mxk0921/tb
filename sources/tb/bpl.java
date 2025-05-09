package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bpl<F, S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final F f16534a;
    public final S b;

    static {
        t2o.a(993001969);
    }

    public bpl(F f, S s) {
        this.f16534a = f;
        this.b = s;
    }

    public static <F, S> bpl<F, S> a(F f, S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpl) ipChange.ipc$dispatch("cd524a91", new Object[]{f, s});
        }
        return new bpl<>(f, s);
    }
}
