package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xrj implements wrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ow f31554a;

    static {
        t2o.a(1018167328);
        t2o.a(1018167327);
    }

    public xrj(ow owVar) {
        this.f31554a = owVar;
    }

    @Override // tb.wrj
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb77c99", new Object[]{this})).booleanValue();
        }
        return hsj.s().D(this.f31554a);
    }
}
