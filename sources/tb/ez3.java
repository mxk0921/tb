package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.goods.response.CollectionidsGetResponseData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ez3 implements ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f18901a;
    public long b = 0;

    static {
        t2o.a(463470615);
        t2o.a(463470657);
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687ad7a", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    @Override // tb.ljd
    public hs6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("11f65278", new Object[]{this});
        }
        hs6 hs6Var = this.f18901a;
        if (hs6Var != null) {
            return hs6Var;
        }
        qzo qzoVar = new qzo();
        qzoVar.h("mtop.taobao.mercury.collectionids.get");
        qzoVar.i("2.0");
        qzoVar.m(CollectionidsGetResponseData.class);
        qzoVar.j(true);
        qzoVar.k("size", Long.valueOf(this.b)).k("favType", 1L);
        hs6 a2 = ls6.a(qzoVar);
        this.f18901a = a2;
        return a2;
    }
}
