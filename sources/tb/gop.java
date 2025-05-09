package tb;

import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509504);
    }

    public static final DXTemplateItem b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f5fcbb47", new Object[]{jSONObject});
        }
        ckf.g(jSONObject, "dxJsonConfig");
        hop hopVar = new hop();
        Object obj = jSONObject.get("url");
        if (obj != null) {
            hopVar.c = (String) obj;
            hopVar.b = Long.parseLong(String.valueOf(jSONObject.get("version")));
            Object obj2 = jSONObject.get("name");
            if (obj2 != null) {
                hopVar.f7343a = (String) obj2;
                return hopVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public static final void c(ShopDXEngine shopDXEngine, View view, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87801d11", new Object[]{shopDXEngine, view, str, obj});
            return;
        }
        ckf.g(shopDXEngine, "<this>");
        ckf.g(view, "view");
        ShopExtKt.w0(shopDXEngine.j(), view, str, obj);
    }

    public static final void d(ShopDXEngine shopDXEngine, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0567d7", new Object[]{shopDXEngine, view, jSONObject});
            return;
        }
        ckf.g(shopDXEngine, "<this>");
        ckf.g(view, "view");
        ShopExtKt.x0(shopDXEngine.j(), view, jSONObject);
    }

    public static final Uri a(Uri uri) {
        boolean z = false;
        z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("34503938", new Object[]{uri});
        }
        if (uri == null) {
            npp.Companion.b("intent or intent.data is null , downgrade failed , will finish activity");
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(toj.NAV_URL_SHOP).buildUpon();
        String queryParameter = uri.getQueryParameter("shopId");
        if (queryParameter != null) {
            buildUpon.appendQueryParameter("shopId", queryParameter);
            z = true;
        }
        String queryParameter2 = uri.getQueryParameter("sellerId");
        if (queryParameter2 != null) {
            buildUpon.appendQueryParameter("sellerId", queryParameter2);
        }
        if (!z) {
            return null;
        }
        buildUpon.appendQueryParameter("downgradeFrom", ShopView.SP_NAMESPACE);
        buildUpon.appendQueryParameter("shopNavIgnore", "true");
        buildUpon.appendQueryParameter(kvr.SHOP_RULE_PROCESSED, "true");
        return buildUpon.build();
    }
}
