package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class sln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final m7j f28134a;
    public final BaseOutDo b;
    public final int c;
    public final Object d;

    static {
        t2o.a(745537689);
    }

    public sln(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
        this.f28134a = m7jVar;
        this.b = baseOutDo;
        this.c = i;
        this.d = obj;
    }

    public final BaseOutDo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOutDo) ipChange.ipc$dispatch("21c54dc8", new Object[]{this});
        }
        return this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("270c0432", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d6dff372", new Object[]{this});
        }
        return this.d;
    }

    public final m7j d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7j) ipChange.ipc$dispatch("9d78d5af", new Object[]{this});
        }
        return this.f28134a;
    }
}
