package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.content.response.IsUserCollectedResponseData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cq3 implements ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f17228a;
    public String b = null;
    public int c;

    static {
        t2o.a(463470597);
        t2o.a(463470657);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a285194b", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.ljd
    public hs6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("11f65278", new Object[]{this});
        }
        hs6 hs6Var = this.f17228a;
        if (hs6Var != null) {
            return hs6Var;
        }
        qzo qzoVar = new qzo();
        qzoVar.h("mtop.taobao.mercury.content.iscollected");
        qzoVar.i("2.0");
        qzoVar.m(IsUserCollectedResponseData.class);
        qzoVar.j(true);
        qzoVar.k("bizId", Integer.valueOf(this.c));
        qzoVar.k("outItemId", this.b);
        hs6 a2 = ls6.a(qzoVar);
        this.f17228a = a2;
        return a2;
    }
}
