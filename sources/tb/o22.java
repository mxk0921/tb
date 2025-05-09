package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class o22 implements l3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f25093a = System.currentTimeMillis();

    static {
        t2o.a(404750762);
        t2o.a(404750763);
    }

    @Override // tb.l3e
    public void a(l3e l3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa71adb6", new Object[]{this, l3eVar});
        }
    }

    @Override // tb.l3e
    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e24fae97", new Object[]{this})).longValue();
        }
        return this.f25093a;
    }
}
