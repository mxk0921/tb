package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class l2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f23076a;
    public final List<Object> b;

    static {
        t2o.a(598737415);
    }

    public l2z(int i, List<? extends Object> list) {
        ckf.g(list, "arguments");
        this.f23076a = i;
        this.b = list;
    }

    public final List<Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fa83a040", new Object[]{this});
        }
        return this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ae8a32", new Object[]{this})).intValue();
        }
        return this.f23076a;
    }
}
