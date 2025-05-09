package com.alibaba.triver.triver_shop.newShop.view;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.kew;
import tb.npp;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopWidgetContentRender$doWidgetRender$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TRWidgetInstance $instance;
    public final /* synthetic */ ShopWidgetContentRender this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.ShopWidgetContentRender$doWidgetRender$1$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass3 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TRWidgetInstance $instance;
        public final /* synthetic */ WidgetStartParams $widgetStartParams;
        public final /* synthetic */ ShopWidgetContentRender this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TRWidgetInstance tRWidgetInstance, WidgetStartParams widgetStartParams, ShopWidgetContentRender shopWidgetContentRender) {
            super(0);
            this.$instance = tRWidgetInstance;
            this.$widgetStartParams = widgetStartParams;
            this.this$0 = shopWidgetContentRender;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopWidgetContentRender$doWidgetRender$1$3");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            this.$instance.render(this.$widgetStartParams);
            ShopWidgetContentRender.w(this.this$0).addView(this.$instance.getRootView());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWidgetContentRender$doWidgetRender$1(ShopWidgetContentRender shopWidgetContentRender, TRWidgetInstance tRWidgetInstance) {
        super(1);
        this.this$0 = shopWidgetContentRender;
        this.$instance = tRWidgetInstance;
    }

    public static /* synthetic */ Object ipc$super(ShopWidgetContentRender$doWidgetRender$1 shopWidgetContentRender$doWidgetRender$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopWidgetContentRender$doWidgetRender$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject x;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            npp.Companion.b("shop tab3 request widget Render info null");
        } else {
            ShopDataParser o = ShopWidgetContentRender.y(this.this$0).o();
            ckf.d(o);
            JSONObject x2 = ShopWidgetContentRender.x(this.this$0);
            if (x2 != null) {
                x2.put((JSONObject) "shop_id", o.W0());
                x2.put((JSONObject) "sellerId", o.N0());
                x2.put((JSONObject) "pageUrl", "https://shop" + ((Object) o.W0()) + ".m.taobao.com");
                Uri K0 = o.K0();
                if (!(K0 == null || (queryParameter = K0.getQueryParameter("widgetShareParams")) == null)) {
                    x2.put((JSONObject) "widgetShareParams", queryParameter);
                }
            }
            WidgetStartParams widgetStartParams = new WidgetStartParams();
            JSONObject jSONObject4 = jSONObject.getJSONObject("data");
            String str = null;
            if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("module")) == null)) {
                ShopWidgetContentRender shopWidgetContentRender = this.this$0;
                JSONObject jSONObject5 = jSONObject2.getJSONObject("bizRenderVO");
                widgetStartParams.setWidgetInfo(jSONObject5 == null ? null : jSONObject5.toString());
                ShopWidgetContentRender.B(shopWidgetContentRender, jSONObject2.getJSONObject("bizRenderVO").getString("widgetId"));
                JSONObject jSONObject6 = jSONObject2.getJSONObject("globalData");
                if (!(jSONObject6 == null || (jSONObject3 = jSONObject6.getJSONObject("sceneParams")) == null || (x = ShopWidgetContentRender.x(shopWidgetContentRender)) == null)) {
                    x.putAll(jSONObject3);
                }
            }
            JSONObject x3 = ShopWidgetContentRender.x(this.this$0);
            if (x3 != null) {
                str = x3.toString();
            }
            widgetStartParams.setSceneParams(str);
            widgetStartParams.setWidth(String.valueOf(kew.O(Integer.valueOf(((FragmentActivity) ShopWidgetContentRender.v(this.this$0)).getWindow().getDecorView().getWidth()))));
            widgetStartParams.setHeight(String.valueOf(kew.O(Integer.valueOf(((FragmentActivity) ShopWidgetContentRender.v(this.this$0)).getWindow().getDecorView().getHeight()))));
            if (ShopWidgetContentRender.z(this.this$0)) {
                widgetStartParams.setRenderMode(TRWidgetConstant.WidgetRenderMode.texture.name());
            }
            r54.C(new AnonymousClass3(this.$instance, widgetStartParams, this.this$0));
        }
    }
}
