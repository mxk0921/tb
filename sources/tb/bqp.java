package tb;

import com.alibaba.triver.triver_shop.newShop.view.H5ShopContentRender;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lcf<H5ShopContentRender> f16555a = new f74(3);

    static {
        t2o.a(766509579);
    }

    public final lcf<H5ShopContentRender> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcf) ipChange.ipc$dispatch("1ac6d5d3", new Object[]{this});
        }
        return this.f16555a;
    }
}
