package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class he7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699166);
    }

    public static void a(xea xeaVar, LiveItem liveItem, boolean z, boolean z2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3dfee6", new Object[]{xeaVar, liveItem, new Boolean(z), new Boolean(z2), str});
            return;
        }
        b2e o = kkr.i().o();
        if (o != null && liveItem != null) {
            HashMap<String, String> e = zha.e(xeaVar, liveItem);
            e.put("item_position", str);
            String str3 = "";
            e.put("item_index", str3 + liveItem.goodsIndex);
            if (z2) {
                str2 = "cart";
            } else {
                str2 = "buy";
            }
            e.put("button_type", str2);
            e.put("clickSource", liveItem.clickSource);
            if (z) {
                if (!TextUtils.isEmpty(jga.e(xeaVar))) {
                    str3 = jga.e(xeaVar);
                }
                e.put("glopenfrom", str3);
            }
            o.c("GoodsBuyClick", e);
        }
    }

    public static void b(xea xeaVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458a6a67", new Object[]{xeaVar, liveItem, str});
            return;
        }
        b2e o = kkr.i().o();
        if (o != null && liveItem != null) {
            HashMap<String, String> e = zha.e(xeaVar, liveItem);
            e.put("item_position", str);
            String str2 = "";
            e.put("item_index", str2 + liveItem.goodsIndex);
            if (!TextUtils.isEmpty(jga.e(xeaVar))) {
                str2 = jga.e(xeaVar);
            }
            e.put("glopenfrom", str2);
            e.put("clickSource", pfa.l(liveItem, vrp.BIZ_GOODS_LIST));
            o.c("detailclick", e);
        }
    }
}
