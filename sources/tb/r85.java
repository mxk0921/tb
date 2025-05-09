package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r85 implements itb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<u85> f27187a;

    static {
        t2o.a(452985181);
        t2o.a(452985185);
    }

    public r85(List<u85> list) {
        this.f27187a = list;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.f27187a.size();
    }

    public u85 b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u85) ipChange.ipc$dispatch("8da5bf6", new Object[]{this, new Integer(i)});
        }
        return this.f27187a.get(i);
    }
}
