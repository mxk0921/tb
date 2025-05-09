package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.util.NavUrls;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v5l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openWW";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_ww";

    /* renamed from: a  reason: collision with root package name */
    public final Context f29794a;
    public final ze7 b;

    static {
        t2o.a(912261925);
        t2o.a(912261826);
    }

    public v5l(Context context, ze7 ze7Var) {
        this.f29794a = context;
        this.b = ze7Var;
    }

    public static void b(Context context, String str, String str2, String str3, String str4, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9973a62", new Object[]{context, str, str2, str3, str4, ze7Var});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(WXConstantsOut.TOUSER, str);
        bundle.putString("itemid", str2);
        bundle.putString(WXConstantsOut.ORDERID, str3);
        bundle.putString("extraParams", str4);
        if (vbl.d0()) {
            Seller seller = (Seller) ze7Var.e().f(Seller.class);
            if (seller != null) {
                String sellerId = seller.getSellerId();
                String shopName = seller.getShopName();
                bundle.putString("targetUid", sellerId);
                bundle.putString("shopName", shopName);
                tgh.b("OpenWW", "targetUid: " + sellerId + " shopName: " + shopName);
            } else {
                tgh.b("OpenWW", "can not get seller data");
            }
        } else {
            tgh.b("OpenWW", "Switch is off");
        }
        jov.j(context, bundle, NavUrls.NAV_URL_WANGXIN);
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null || (jSONObject = a2.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS)) == null) {
            return false;
        }
        String string = jSONObject.getString("nick");
        String string2 = jSONObject.getString("itemid");
        String string3 = jSONObject.getString("saleCount");
        HashMap hashMap = new HashMap();
        hashMap.put("from", "Page_Detail");
        try {
            if (Long.parseLong(string3) > 0) {
                hashMap.put("K_QUANTITY", string3);
            }
        } catch (Throwable unused) {
        }
        hashMap.putAll(k3i.a(jSONObject));
        b(this.f29794a, string, string2, null, JSON.toJSONString(hashMap), this.b);
        return true;
    }
}
