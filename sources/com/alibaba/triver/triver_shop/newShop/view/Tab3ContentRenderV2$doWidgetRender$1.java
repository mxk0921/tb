package com.alibaba.triver.triver_shop.newShop.view;

import android.net.Uri;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.WidgetStartParams;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.hps;
import tb.kew;
import tb.npp;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3ContentRenderV2$doWidgetRender$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSEmbed $instance;
    public final /* synthetic */ hps this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRenderV2$doWidgetRender$1$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass3 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TMSEmbed $instance;
        public final /* synthetic */ WidgetStartParams $widgetStartParams;
        public final /* synthetic */ hps this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TMSEmbed tMSEmbed, WidgetStartParams widgetStartParams, hps hpsVar) {
            super(0);
            this.$instance = tMSEmbed;
            this.$widgetStartParams = widgetStartParams;
            this.this$0 = hpsVar;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3ContentRenderV2$doWidgetRender$1$3");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            this.$instance.i(this.$widgetStartParams.build());
            this.$instance.u();
            hps.p(this.this$0).addView(this.$instance.h());
            hps.p(this.this$0).addView(hps.r(this.this$0), new FrameLayout.LayoutParams(-1, kew.P(370), 48));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3ContentRenderV2$doWidgetRender$1(hps hpsVar, TMSEmbed tMSEmbed) {
        super(1);
        this.this$0 = hpsVar;
        this.$instance = tMSEmbed;
    }

    public static /* synthetic */ Object ipc$super(Tab3ContentRenderV2$doWidgetRender$1 tab3ContentRenderV2$doWidgetRender$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3ContentRenderV2$doWidgetRender$1");
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
        JSONObject q;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            npp.Companion.b("shop tab3 request widget Render info null");
        } else {
            ShopDataParser s = hps.s(this.this$0);
            JSONObject q2 = hps.q(this.this$0);
            if (q2 != null) {
                q2.put((JSONObject) "shop_id", s.W0());
                q2.put((JSONObject) "sellerId", s.N0());
                q2.put((JSONObject) "pageUrl", "https://shop" + ((Object) s.W0()) + ".m.taobao.com");
                Uri K0 = s.K0();
                if (!(K0 == null || (queryParameter = K0.getQueryParameter("widgetShareParams")) == null)) {
                    q2.put((JSONObject) "widgetShareParams", queryParameter);
                }
            }
            WidgetStartParams widgetStartParams = new WidgetStartParams();
            JSONObject jSONObject4 = jSONObject.getJSONObject("data");
            String str = null;
            if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("module")) == null)) {
                hps hpsVar = this.this$0;
                JSONObject jSONObject5 = jSONObject2.getJSONObject("bizRenderVO");
                widgetStartParams.setWidgetInfo(jSONObject5 == null ? null : jSONObject5.toString());
                hps.t(hpsVar, jSONObject2.getJSONObject("bizRenderVO").getString("widgetId"));
                JSONObject jSONObject6 = jSONObject2.getJSONObject("globalData");
                if (!(jSONObject6 == null || (jSONObject3 = jSONObject6.getJSONObject("sceneParams")) == null || (q = hps.q(hpsVar)) == null)) {
                    q.putAll(jSONObject3);
                }
            }
            JSONObject q3 = hps.q(this.this$0);
            if (q3 != null) {
                str = q3.toString();
            }
            widgetStartParams.setSceneParams(str);
            widgetStartParams.setWidth(String.valueOf(kew.O(Integer.valueOf(((FragmentActivity) hps.o(this.this$0)).getWindow().getDecorView().getWidth()))));
            widgetStartParams.setHeight(String.valueOf(kew.O(Integer.valueOf(((FragmentActivity) hps.o(this.this$0)).getWindow().getDecorView().getHeight()))));
            r54.C(new AnonymousClass3(this.$instance, widgetStartParams, this.this$0));
        }
    }
}
