package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.a;
import tb.a1v;
import tb.ckf;
import tb.jpu;
import tb.r54;
import tb.t2o;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopUTExposeEventKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509551);
    }

    public static final void b(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da78d86", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_2Fmain_expose", null);
    }

    public static final void c(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0df3ce3", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_2Fother_expose", null);
    }

    public static final void e(ShopDataParser shopDataParser, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af82a3ff", new Object[]{shopDataParser, new Integer(i)});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        r54.P("shopExposeBottomAllSubTab", new ShopUTExposeEventKt$shopExposeBottomAllSubTab$1(shopDataParser, i));
    }

    public static final void f(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61acd11", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(shopDataParser.l1());
        xhv xhvVar = xhv.INSTANCE;
        a1v.d(shopDataParser, "Page_Shop_Frame_Expose", linkedHashMap);
    }

    public static final void g(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afd22f0", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_Impression_Pi_Widget_Show", null);
    }

    public static final void h(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e03e618", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_IndexFrame", null);
    }

    public static final void i(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6074a1be", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_Page_Shop_Button-More", null);
    }

    public static final void k(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe2ee83", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_Button-Return", null);
    }

    public static final void l(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dae56f9", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_Button-Search", null);
    }

    public static final void n(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d3e3c2", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_shoplist_Show", null);
    }

    public static final void p(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f217e6c5", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "shoptag_exposure_new", null);
    }

    public static final void a(ShopDataParser shopDataParser, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b6baaa", new Object[]{shopDataParser, new Float(f)});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_2Flivecard_exposure", a.i(jpu.a("cardSize", String.valueOf(f))));
    }

    public static final void d(ShopDataParser shopDataParser) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("333aa275", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        Iterator<Object> it = shopDataParser.u1().iterator();
        while (it.hasNext()) {
            it.next();
            i++;
            if (i >= 0) {
                a1v.d(shopDataParser, shopDataParser.B(i), null);
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    public static final void j(ShopDataParser shopDataParser, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652890db", new Object[]{shopDataParser, str});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_shop_report_monitor_error", a.i(jpu.a("errorMsg", str)));
    }

    public static final void m(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ab0b0b", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, "Page_Shop_Page_Shop_Button-Search", a.i(jpu.a("version", "2.0")));
    }

    public static final void o(ShopDataParser shopDataParser, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad32e3e", new Object[]{shopDataParser, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        a1v.d(shopDataParser, shopDataParser.V(i, i2), a.i(jpu.a("version", "2.0"), jpu.a("position", "header")));
    }
}
