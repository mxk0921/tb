package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class aas implements rrb, t4c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f15634a = new LinkedHashMap();

    static {
        t2o.a(839909544);
        t2o.a(839909542);
        t2o.a(839909557);
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            t4c.a.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            t4c.a.b(this);
        }
    }

    @Override // tb.rrb
    public void h0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0b8b59", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        this.f15634a.put(str, obj);
    }

    @Override // tb.rrb
    public Object n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7624f4a1", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return ((LinkedHashMap) this.f15634a).get(str);
    }
}
