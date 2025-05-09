package com.alibaba.android.icart.core.event;

import android.app.Activity;
import android.os.Build;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.be3;
import tb.bia;
import tb.c9x;
import tb.cb4;
import tb.lbq;
import tb.lcu;
import tb.lmb;
import tb.ls7;
import tb.q2q;
import tb.t2o;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CartItemsShareSubscriber extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CartItemsShare";
    public static final String l = Localization.q(R.string.taobao_app_1028_1_21679);
    public static final String m = Localization.q(R.string.taobao_app_1028_1_21677);
    public static final String n = Localization.q(R.string.taobao_app_1028_1_21670);
    public static final String o = Localization.q(R.string.taobao_app_1028_1_21646);

    static {
        t2o.a(479199389);
    }

    public static /* synthetic */ Object ipc$super(CartItemsShareSubscriber cartItemsShareSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartItemsShareSubscriber");
    }

    public static /* synthetic */ void p(CartItemsShareSubscriber cartItemsShareSubscriber, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dab74f", new Object[]{cartItemsShareSubscriber, str});
        } else {
            cartItemsShareSubscriber.z(str);
        }
    }

    public static /* synthetic */ void q(CartItemsShareSubscriber cartItemsShareSubscriber, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a35ce2e", new Object[]{cartItemsShareSubscriber, str});
        } else {
            cartItemsShareSubscriber.y(str);
        }
    }

    public static /* synthetic */ void r(CartItemsShareSubscriber cartItemsShareSubscriber, String str, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7561f8ab", new Object[]{cartItemsShareSubscriber, str, jSONObject, jSONArray});
        } else {
            cartItemsShareSubscriber.t(str, jSONObject, jSONArray);
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        JSONArray u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (this.e != null && (u = u()) != null && u.size() != 0) {
            x(u);
        }
    }

    public final void s(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2e06e9", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject2 != null && (jSONObject3 = jSONObject2.getJSONObject("shareExtParam")) != null && !jSONObject3.isEmpty()) {
            jSONObject.put("shareExtParam", (Object) jSONObject3);
        }
    }

    public final JSONArray u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b9de990c", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        String tag = this.e.getTag();
        if ("item".equals(tag)) {
            JSONObject c = c();
            if (c == null && c.size() == 0) {
                lbq.b(c9x.CART_BIZ_NAME, "CartShare", "SHARE_EVENT_FIELD_EMPTY", "eventFields为空");
                ub3.f("eventFields为空");
                return null;
            }
            String string = c.getString("itemId");
            String string2 = c.getString(q2q.KEY_SKU_ID);
            String string3 = c.getString("quantity");
            if (TextUtils.isEmpty(string)) {
                lbq.b(c9x.CART_BIZ_NAME, "CartShare", "SHARE_EVENT_FIELD_ITEM_ID_EMPTY", "eventFields.itemId为空");
                ub3.f("eventFields.itemId为空");
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) string);
            if (TextUtils.isEmpty(string2)) {
                string2 = "";
            }
            jSONObject.put(q2q.KEY_SKU_ID, (Object) string2);
            if (TextUtils.isEmpty(string3)) {
                string3 = "";
            }
            jSONObject.put("count", (Object) string3);
            s(jSONObject, this.e.getFields());
            jSONArray.add(jSONObject);
        } else if ("submit".equals(tag)) {
            List<IDMComponent> v = cb4.v(this.j.b());
            if (v == null || v.size() == 0) {
                String q = Localization.q(R.string.taobao_app_1028_1_21676);
                be3.c(this.b, q);
                ub3.f(q);
                return null;
            }
            for (IDMComponent iDMComponent : v) {
                jSONArray.add(v(iDMComponent));
            }
        } else if ("bundleHeader".equals(tag)) {
            List<IDMComponent> l2 = cb4.l(cb4.o(this.e));
            if (l2 == null) {
                String q2 = Localization.q(R.string.taobao_app_1028_1_21649);
                be3.c(this.b, q2);
                ub3.f(q2);
                return null;
            }
            for (IDMComponent iDMComponent2 : l2) {
                if (iDMComponent2 != null && TextUtils.equals(iDMComponent2.getTag(), "item")) {
                    jSONArray.add(v(iDMComponent2));
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject v(IDMComponent iDMComponent) {
        JSONObject fields;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("411302f1", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
            return null;
        }
        String string = fields.getString("itemId");
        String string2 = fields.getString("quantity");
        JSONObject jSONObject = fields.getJSONObject("sku");
        if (jSONObject != null) {
            str = jSONObject.getString(q2q.KEY_SKU_ID);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) string);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        jSONObject2.put(q2q.KEY_SKU_ID, (Object) str);
        if (TextUtils.isEmpty(string2)) {
            string2 = "";
        }
        jSONObject2.put("count", (Object) string2);
        s(jSONObject2, fields);
        return jSONObject2;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0d00bb", new Object[]{this})).booleanValue();
        }
        if (EnvironmentSwitcher.EnvType.OnLINE.getValue() == EnvironmentSwitcher.a()) {
            return true;
        }
        return false;
    }

    public final void x(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54af283f", new Object[]{this, jSONArray});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharecart.share.publish");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "nativeCart");
        jSONObject.put("itemPOStr", (Object) jSONArray.toJSONString());
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.reqMethod(MethodEnum.POST);
        build.useWua();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.CartItemsShareSubscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                CartItemsShareSubscriber.p(CartItemsShareSubscriber.this, mtopResponse.getRetMsg());
                lbq.b(c9x.CART_BIZ_NAME, "CartShare", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    String string = mtopResponse.getDataJsonObject().getString("shareIdStr");
                    if (TextUtils.isEmpty(string)) {
                        CartItemsShareSubscriber.p(CartItemsShareSubscriber.this, Localization.q(R.string.taobao_app_1028_1_21666));
                        lbq.b(c9x.CART_BIZ_NAME, "CartShare", "SHARE_ID_EMPTY", "获取ShareId为空");
                        return;
                    }
                    CartItemsShareSubscriber.q(CartItemsShareSubscriber.this, string);
                } catch (Throwable th) {
                    CartItemsShareSubscriber.p(CartItemsShareSubscriber.this, Localization.q(R.string.taobao_app_1028_1_21666));
                    lbq.c(c9x.CART_BIZ_NAME, "requestShareId", th);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }
        });
        build.startRequest();
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528ae747", new Object[]{this, str});
            return;
        }
        be3.c(this.b, str);
        ub3.f(str);
    }

    public final void y(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6851dcdd", new Object[]{this, str});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharecart.share.consume");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shareId", (Object) str);
        jSONObject.put("type", (Object) "nativeCart");
        jSONObject.put(ls7.INFO_PAGE_NUMBER, (Object) 1);
        jSONObject.put("hasMore", (Object) Boolean.TRUE);
        jSONObject.put("pageSize", (Object) 10);
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.reqMethod(MethodEnum.POST);
        build.useWua();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.CartItemsShareSubscriber.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                CartItemsShareSubscriber.p(CartItemsShareSubscriber.this, mtopResponse.getRetMsg());
                lbq.b(c9x.CART_BIZ_NAME, "CartShare", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    JSONObject jSONObject2 = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
                    if (jSONObject2.getBooleanValue("expired")) {
                        CartItemsShareSubscriber.p(CartItemsShareSubscriber.this, Localization.q(R.string.taobao_app_1028_1_21663));
                    } else {
                        CartItemsShareSubscriber.r(CartItemsShareSubscriber.this, str, jSONObject2.getJSONObject("cartInfo"), jSONObject2.getJSONArray(bia.UNDER_TAKE_GOODS_LIST));
                    }
                } catch (Throwable th) {
                    CartItemsShareSubscriber.p(CartItemsShareSubscriber.this, Localization.q(R.string.taobao_app_1028_1_21666));
                    lbq.c(c9x.CART_BIZ_NAME, "requestShareConsume", th);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }
        });
        build.startRequest();
    }

    public final void t(String str, JSONObject jSONObject, JSONArray jSONArray) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29ad72e", new Object[]{this, str, jSONObject, jSONArray});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            z(Localization.q(R.string.taobao_app_1028_1_21666));
            lbq.b(c9x.CART_BIZ_NAME, "CartShare", "SHARE_CART_INFO_EMPTY", "cartInfo为空");
        } else if (jSONArray == null || jSONArray.size() == 0) {
            z(Localization.q(R.string.taobao_app_1028_1_21653));
            lbq.b(c9x.CART_BIZ_NAME, "CartShare", "SHARE_ITEM_LIST_EMPTY", "itemList为空");
        } else {
            ShareContent shareContent = new ShareContent();
            if (Build.VERSION.SDK_INT > 21) {
                str2 = "nativesharecart2";
            } else {
                str2 = "nativesharecart2_android4";
            }
            shareContent.businessId = str2;
            shareContent.title = l;
            shareContent.description = m;
            shareContent.imageUrl = "//gw.alicdn.com/imgextra/i3/O1CN01oF02SK1FwOxKZITOy_!!6000000000551-2-tps-783-783.png";
            JSONObject jSONObject2 = new JSONObject();
            if (w()) {
                str3 = "https://market.m.taobao.com/app/tmall-wireless/share-embedded/sharenativecartembedded?wh_weex=true";
            } else {
                str3 = "https://market.wapa.taobao.com/app/tmall-wireless/share-embedded/sharenativecartembedded?wh_weex=true";
            }
            jSONObject2.put("weexURL", (Object) str3);
            jSONObject2.put("useBroadcast", (Object) Boolean.TRUE);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(bia.UNDER_TAKE_GOODS_LIST, (Object) jSONArray);
            jSONObject.put("itemInfo", (Object) jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("footerText", (Object) n);
            jSONObject4.put("qrText", (Object) o);
            jSONObject4.put("showMask", (Object) Boolean.FALSE);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("data", (Object) jSONObject);
            jSONObject5.put("config", (Object) jSONObject4);
            jSONObject2.put("shareInfo", (Object) jSONObject5);
            shareContent.templateParams = jSONObject2.getInnerMap();
            if (w()) {
                str4 = "https://web.m.taobao.com/app/mtb/cart-sharing-front/cartshareback?pha=true&disableNav=YES&source=cartShare&shareId=%s";
            } else {
                str4 = "https://web.wapa.taobao.com/app/mtb/cart-sharing-front/cartshareback?pha=true&disableNav=YES&source=cartShare&shareId=%s";
            }
            shareContent.url = String.format(str4, str);
            ShareBusiness.getInstance();
            ShareBusiness.share((Activity) this.b, shareContent);
        }
    }
}
