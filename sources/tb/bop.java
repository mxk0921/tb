package tb;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bop implements vpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f16516a;
    public final ShopBroadcastController.b b;
    public final ShopBroadcastController c;

    static {
        t2o.a(766509473);
        t2o.a(766509472);
    }

    public bop(Context context, ShopDataParser shopDataParser, ShopBroadcastController.b bVar) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.f16516a = shopDataParser;
        this.b = bVar;
        ShopBroadcastController f = ShopBroadcastController.f(context);
        ckf.f(f, "getInstance(context)");
        this.c = f;
        f.t(bVar);
    }

    @Override // tb.vpd
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5a39bc", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.c.s(i, i2, this.f16516a.W0());
        }
    }

    @Override // tb.vpd
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcbcc89b", new Object[]{this, new Boolean(z)});
        } else {
            this.c.l(this.f16516a.W0(), z);
        }
    }

    @Override // tb.vpd
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f9e837", new Object[]{this, str, str2});
            return;
        }
        ShopBroadcastController.b bVar = this.b;
        if (bVar != null) {
            bVar.T(str, str2);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee14dd0", new Object[]{this});
        } else {
            this.c.u();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f2129e", new Object[]{this});
        } else {
            this.c.j(this.f16516a.W0());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573a7c88", new Object[]{this});
        } else {
            this.c.k(this.f16516a.W0());
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bdb0486", new Object[]{this});
        } else {
            this.c.p(this.f16516a.W0());
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429f5bd1", new Object[]{this, new Integer(i)});
        } else {
            this.c.m(this.f16516a.W0(), i);
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4505cbca", new Object[]{this, new Integer(i)});
        } else {
            this.c.n(this.f16516a.W0(), i);
        }
    }

    @Override // tb.vpd
    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adc752a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ShopBroadcastController shopBroadcastController = this.c;
        String W0 = this.f16516a.W0();
        StringBuilder sb = new StringBuilder();
        sb.append(kew.O(12));
        sb.append(',');
        sb.append(this.f16516a.M());
        shopBroadcastController.r(i, i2, W0, brf.a(jpu.a("paddingTopAndBottom", sb.toString())));
    }
}
