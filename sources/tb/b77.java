package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b77 implements f0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16225a;
    public final bud b;
    public final bud c;
    public final bud d;

    public b77(s0r s0rVar, String str) {
        this.b = s0rVar.e();
        this.c = s0rVar.b();
        this.d = s0rVar.g();
        this.f16225a = str;
    }

    @Override // tb.f0r
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        try {
            if (!((ys7) this.b).e(this.f16225a) || !((qal) this.c).c(this.f16225a)) {
                return false;
            }
            return ((lch) this.d).a("location");
        } catch (Throwable unused) {
            return false;
        }
    }
}
