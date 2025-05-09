package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class su5 implements ivb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final short f28277a;
    public final int b;
    public final List<String> c;

    static {
        t2o.a(444597963);
        t2o.a(444597967);
    }

    public su5(short s, int i, List<String> list) {
        this.f28277a = s;
        this.b = i;
        this.c = list;
    }

    @Override // tb.ivb
    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae4480cf", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.ivb
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6577a21", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // tb.ivb
    public short c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9be1eb29", new Object[]{this})).shortValue();
        }
        return this.f28277a;
    }
}
