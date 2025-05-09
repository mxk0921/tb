package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.a;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ifw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f21294a = new ArrayList<>();

    static {
        t2o.a(764412065);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7928c5d6", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.f21294a.add(aVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
        } else {
            this.f21294a.clear();
        }
    }

    public a c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6ebf67b4", new Object[]{this, new Integer(i)});
        }
        return this.f21294a.get(i);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.f21294a.size();
    }
}
