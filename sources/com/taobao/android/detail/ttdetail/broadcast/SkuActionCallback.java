package com.taobao.android.detail.ttdetail.broadcast;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.Constants$WVActionData;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import tb.bw7;
import tb.ir;
import tb.mr7;
import tb.npw;
import tb.q2q;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.to8;
import tb.vkb;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SkuActionCallback implements vkb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_CART = "AddCart";
    public static final String CART_REFRESH_DATA = "cartRefreshData";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6700a;

    static {
        t2o.a(912261347);
        t2o.a(442499149);
    }

    public SkuActionCallback(ze7 ze7Var) {
        this.f6700a = ze7Var;
    }

    @Override // tb.vkb
    public void a(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df2da85", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            f(jSONObject);
            String string = jSONObject.getString("actionFrom");
            if (TextUtils.isEmpty(string)) {
                string = "NULL";
            }
            string.hashCode();
            if (string.equals("ADD_CART_SUCCESS")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(to8.ADD_CART);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(q2q.KEY_SKU_ID, (Object) jSONObject2.getString(q2q.KEY_SKU_ID));
                    jSONObject3.put("priceText", (Object) jSONObject.getString("priceText"));
                    jSONObject3.put("propTextList", jSONObject.get("propTextList"));
                    try {
                        str = URLEncoder.encode(jSONObject3.toJSONString(), "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        str = "";
                    }
                    e(jSONObject.getString("addCartScene"), str, d(jSONObject));
                }
            } else if (string.equals("IMG_PREVIEW_LONG_CLK")) {
                g(this.f6700a, jSONObject);
            }
        }
    }

    public final void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c299eeb7", new Object[]{this, context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        intent.putExtra("stringifyAddCartResult", str);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public final String d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26b7119f", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(to8.ADD_CART)) == null) {
            return null;
        }
        return jSONObject2.getString("addCartResult");
    }

    public void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef10d106", new Object[]{this, str, str2, str3});
            return;
        }
        c(str2);
        if (!"native_addCart".equals(str)) {
            b(mr7.d(), str3);
        }
        bw7.c(ADD_CART, null);
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb0d006", new Object[]{this, jSONObject});
            return;
        }
        boolean booleanValue = ((Boolean) this.f6700a.i().c("is99tm")).booleanValue();
        if ("ADD_CART_SUCCESS".equals(jSONObject.getString("actionFrom")) && booleanValue) {
            npw.b(Constants$WVActionData.WV_ACTION_REQUEST_99_CART_UPDATE, Constants$WVActionData.WV_DATA_REQUEST_99_CART_UPDATE);
        }
    }

    public final boolean c(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa146c2", new Object[]{this, str})).booleanValue();
        }
        JSONObject afterAddToCartAction = ((Trade) this.f6700a.e().f(Trade.class)).getAfterAddToCartAction();
        if (afterAddToCartAction == null) {
            return false;
        }
        String string = afterAddToCartAction.getString("type");
        if (TextUtils.isEmpty(string) || (jSONObject = afterAddToCartAction.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return false;
        }
        String string2 = jSONObject.getString("url");
        if (TextUtils.isEmpty(string2)) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("url", (Object) (string2 + "&skuInfo=" + str));
        }
        this.f6700a.b().h(new ir(new JSONObject(string, jSONObject) { // from class: com.taobao.android.detail.ttdetail.broadcast.SkuActionCallback.1
            public final /* synthetic */ JSONObject val$fields;
            public final /* synthetic */ String val$type;

            {
                this.val$type = string;
                this.val$fields = jSONObject;
                put("type", (Object) string);
                put("fields", (Object) jSONObject);
            }
        }), new RuntimeAbilityParam[0]);
        return true;
    }

    public final void g(ze7 ze7Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996002e3", new Object[]{this, ze7Var, jSONObject});
        } else if (jSONObject != null) {
            Dialog dialog = (Dialog) jSONObject.getObject("dialog", Dialog.class);
            q84.f(this.f6700a.c(), new rc7("share", jSONObject, new RuntimeAbilityParam("shareFromSku", Boolean.TRUE), new RuntimeAbilityParam("shareContainer", dialog != null ? dialog.getWindow().getDecorView() : null)));
        }
    }
}
