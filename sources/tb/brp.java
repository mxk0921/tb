package tb;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class brp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509550);
    }

    public static final void a(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae226bb9", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop-2Fmain_click", null, null, 8, null);
    }

    public static final void b(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c198b4", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop-2Fother_click", null, null, 8, null);
    }

    public static final void c(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb620380", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_AttentionWeiTao_Button-Attention", null, null, 8, null);
    }

    public static final void d(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b898938", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_AttentionWeiTao_Button-CancelAttention", null, null, 8, null);
    }

    public static final void e(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2791dd6b", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop_Page_Shop_Button-ShopInfo", null, null, 8, null);
    }

    public static final void f(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596bd688", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop_shoplist_Click", null, null, 8, null);
    }

    public static final void g(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7504a59f", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop_Page_Shop_Button-More", null, null, 8, null);
    }

    public static final void h(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c58e76", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop_Button-Return", null, null, 8, null);
    }

    public static final void i(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3fa683", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop_Page_Shop_Button-Search", null, null, 8, null);
    }

    public static final void j(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793c1c9f", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "Page_Shop_Button-More_Share", null, null, 8, null);
    }

    public static final void k(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee73ab96", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.c(shopDataParser, "shoptag_click_new", null, null, 8, null);
    }

    public static final void l(ShopDataParser shopDataParser, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5850a", new Object[]{shopDataParser, new Integer(i)});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        HashMap hashMap = new HashMap();
        hashMap.put("idx", String.valueOf(i));
        a1v.c(shopDataParser, ckf.p("Page_Shop_", shopDataParser.B(i)), hashMap, null, 8, null);
    }

    public static final void m(ShopDataParser shopDataParser, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b50bed", new Object[]{shopDataParser, new Integer(i), new Integer(i2), str});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("idx", String.valueOf(i));
            hashMap.put("actionType", str);
            a1v.c(shopDataParser, ckf.p("Page_Shop_", shopDataParser.V(i, i2)), hashMap, null, 8, null);
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }

    public static /* synthetic */ void n(ShopDataParser shopDataParser, int i, int i2, String str, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd7fed5", new Object[]{shopDataParser, new Integer(i), new Integer(i2), str, new Integer(i3), obj});
            return;
        }
        if ((i3 & 8) != 0) {
            str = "click";
        }
        m(shopDataParser, i, i2, str);
    }

    public static final void o(ShopDataParser shopDataParser, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1de37fc", new Object[]{shopDataParser, new Integer(i)});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        HashMap hashMap = new HashMap();
        hashMap.put("idx", String.valueOf(i));
        a1v.c(shopDataParser, shopDataParser.B(i), hashMap, null, 8, null);
    }
}
