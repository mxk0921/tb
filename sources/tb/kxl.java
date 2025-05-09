package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kxl implements jxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jxl f22989a;

    public kxl(jxl jxlVar) {
        this.f22989a = jxlVar;
    }

    @Override // tb.jxl
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb1881df", new Object[]{this})).intValue();
        }
        return this.f22989a.a();
    }

    @Override // tb.jxl
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb96a19b", new Object[]{this})).intValue();
        }
        return this.f22989a.b();
    }

    @Override // tb.jxl
    public boolean c(eyl eylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29d0f9", new Object[]{this, eylVar})).booleanValue();
        }
        try {
            return this.f22989a.c(eylVar);
        } catch (Exception e) {
            s9n.a("PerformanceListenerCompat", "onWarning error", e.toString());
            return false;
        }
    }
}
