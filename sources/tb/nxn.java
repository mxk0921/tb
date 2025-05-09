package tb;

import com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510134);
    }

    public static final /* synthetic */ BaseShopContentRender a(wpd wpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseShopContentRender) ipChange.ipc$dispatch("2390550d", new Object[]{wpdVar});
        }
        return b(wpdVar);
    }

    public static final BaseShopContentRender b(wpd wpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseShopContentRender) ipChange.ipc$dispatch("13a9044d", new Object[]{wpdVar});
        }
        if (wpdVar instanceof BaseShopContentRender) {
            return (BaseShopContentRender) wpdVar;
        }
        return null;
    }
}
