package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kr3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<kae> f22865a;
    public final List<kae> b;
    public final List<kae> c;
    public final List<kae> d;

    static {
        t2o.a(993001661);
    }

    public kr3(List<kae> list, List<kae> list2, List<kae> list3, List<kae> list4) {
        this.f22865a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public static kr3 a(List<kae> list, List<kae> list2, List<kae> list3, List<kae> list4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr3) ipChange.ipc$dispatch("f4b41818", new Object[]{list, list2, list3, list4});
        }
        return new kr3(list, list2, list3, list4);
    }
}
