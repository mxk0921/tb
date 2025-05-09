package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t3g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28465a;
    public long b = -1;
    public xy0 c;
    public wy0 d;
    public n e;

    static {
        t2o.a(503316624);
    }

    public static t3g a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t3g) ipChange.ipc$dispatch("7de5e120", new Object[]{nVar});
        }
        t3g t3gVar = new t3g();
        t3gVar.e = nVar;
        t3gVar.f28465a = 0;
        t3gVar.b = 0L;
        t3gVar.d = wy0.a(nVar);
        return t3gVar;
    }
}
