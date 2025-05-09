package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wx5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f30983a;
    public final List<uvb> b;

    static {
        t2o.a(444597919);
    }

    public wx5(String str, int i, short[] sArr, short[] sArr2, short s, List<uvb> list) {
        this.f30983a = i;
        this.b = list;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bfe643d", new Object[]{this})).intValue();
        }
        return this.f30983a;
    }

    public List<uvb> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("60676891", new Object[]{this});
        }
        return this.b;
    }
}
