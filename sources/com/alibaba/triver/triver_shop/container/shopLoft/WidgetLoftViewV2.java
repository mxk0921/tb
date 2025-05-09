package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.widget.event.NativeWidgetNestedRenderContainer;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import kotlin.a;
import tb.a1v;
import tb.brf;
import tb.ckf;
import tb.njg;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WidgetLoftViewV2 extends TMSEmbed.a implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TMSEmbed f3015a;
    public WidgetLoftData b;
    public boolean c;
    public View d;
    public Context e;
    public JSONObject f;
    public final njg g = a.b(new WidgetLoftViewV2$rootView$2(this));

    static {
        t2o.a(766509234);
        t2o.a(766509126);
    }

    public static /* synthetic */ Object ipc$super(WidgetLoftViewV2 widgetLoftViewV2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -302283915) {
            super.n();
            return null;
        } else if (hashCode == 2123836685) {
            super.l((String) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/container/shopLoft/WidgetLoftViewV2");
        }
    }

    public static final /* synthetic */ Context o(WidgetLoftViewV2 widgetLoftViewV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("51a4018b", new Object[]{widgetLoftViewV2});
        }
        return widgetLoftViewV2.e;
    }

    public static final /* synthetic */ View p(WidgetLoftViewV2 widgetLoftViewV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4d96e8b3", new Object[]{widgetLoftViewV2});
        }
        return widgetLoftViewV2.d;
    }

    public static final /* synthetic */ TMSEmbed q(WidgetLoftViewV2 widgetLoftViewV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("871ca277", new Object[]{widgetLoftViewV2});
        }
        return widgetLoftViewV2.f3015a;
    }

    public static final /* synthetic */ void r(WidgetLoftViewV2 widgetLoftViewV2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120c1a8d", new Object[]{widgetLoftViewV2, view});
        } else {
            widgetLoftViewV2.d = view;
        }
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        HashMap<String, String> u = getUTProperties();
        if (u != null) {
            u.put("spm", "a2141.b91375813.c1638791681170.d1638791681170");
        }
        a1v.n("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_exposure", u);
        TMSEmbed tMSEmbed = this.f3015a;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        }
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.f3015a;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        JSONObject jSONObject = this.f;
        String str = null;
        shareContent.imageUrl = jSONObject == null ? null : jSONObject.getString("shareImage");
        JSONObject jSONObject2 = this.f;
        shareContent.title = jSONObject2 == null ? null : jSONObject2.getString("shareTitle");
        JSONObject jSONObject3 = this.f;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("shareText");
        }
        shareContent.description = str;
        return shareContent;
    }

    @Override // tb.xpd
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return "Page_Shop_2Fcontentfeed_marketcard";
    }

    @Override // tb.xpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return t();
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        super.l(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "errorCode", str);
        jSONObject.put((JSONObject) "errorMessage", str2);
        npp.Companion.b(ckf.p("on widget render error : ", jSONObject));
        r54.C(new WidgetLoftViewV2$onRenderFailed$1(this));
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            return;
        }
        super.n();
        npp.Companion.b("on widget render success");
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.f3015a;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.f3015a;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.f3015a;
        if (tMSEmbed != null) {
            tMSEmbed.o();
        }
    }

    @Override // tb.xpd
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.f3015a;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
        this.f3015a = null;
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        } else {
            s();
        }
    }

    @Override // tb.xpd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.f3015a;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            s();
        }
    }

    public final void s() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b632172c", new Object[]{this});
        } else if (!this.c) {
            this.c = true;
            WidgetLoftData widgetLoftData = this.b;
            if (widgetLoftData != null) {
                TMSEmbed tMSEmbed = this.f3015a;
                if (tMSEmbed != null) {
                    tMSEmbed.r(this);
                }
                WidgetStartParams widgetStartParams = new WidgetStartParams();
                JSONObject jSONObject = widgetLoftData.sceneParams;
                String str2 = null;
                if (jSONObject == null) {
                    str = null;
                } else {
                    str = jSONObject.toJSONString();
                }
                widgetStartParams.setSceneParams(str);
                widgetStartParams.setWidgetId(widgetLoftData.widgetId);
                widgetStartParams.setDebugUrl(widgetLoftData.debugUrl);
                widgetStartParams.setWidth(String.valueOf(widgetLoftData.width));
                widgetStartParams.setHeight(String.valueOf(widgetLoftData.height));
                widgetStartParams.setRelationUrl(widgetLoftData.relationUrl);
                widgetStartParams.setSpmUrl(widgetLoftData.spmUrl);
                widgetStartParams.setVersion(widgetLoftData.version);
                JSONObject jSONObject2 = widgetLoftData.initData;
                if (jSONObject2 != null) {
                    str2 = jSONObject2.toString();
                }
                widgetStartParams.setInitData(str2);
                TMSEmbed tMSEmbed2 = this.f3015a;
                if (tMSEmbed2 != null) {
                    tMSEmbed2.i(widgetStartParams.build());
                }
                TMSEmbed tMSEmbed3 = this.f3015a;
                if (tMSEmbed3 != null) {
                    tMSEmbed3.u();
                }
                FrameLayout t = t();
                TMSEmbed tMSEmbed4 = this.f3015a;
                ckf.d(tMSEmbed4);
                t.addView(tMSEmbed4.h());
            }
        }
    }

    @Override // tb.xpd
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    public final FrameLayout t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return (FrameLayout) this.g.getValue();
    }

    /* renamed from: u */
    public HashMap<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2c04a7b2", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = this.f;
        String str = null;
        hashMap.put("shop_id", jSONObject == null ? null : jSONObject.getString("shopId"));
        JSONObject jSONObject2 = this.f;
        hashMap.put("seller_id", jSONObject2 == null ? null : jSONObject2.getString("sellerId"));
        hashMap.put("spm-cnt", "a2141.b91375813.0.0");
        hashMap.put("tag", "2FMarket");
        JSONObject jSONObject3 = this.f;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("id");
        }
        hashMap.put("widgetid", str);
        return hashMap;
    }

    @Override // tb.xpd
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        } else {
            s();
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.e = context;
        this.f = jSONObject;
        WidgetLoftData widgetLoftData = (WidgetLoftData) brf.m(jSONObject, WidgetLoftData.class);
        this.b = widgetLoftData;
        if (widgetLoftData == null) {
            npp.Companion.b("widgetLoftData is null");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (widgetLoftData.sceneParams == null) {
                widgetLoftData.sceneParams = jSONObject2;
            }
            if (jSONObject != null) {
                Object obj = jSONObject.get("widgetShareParams");
                if (obj != null) {
                    widgetLoftData.sceneParams.put("widgetShareParams", obj);
                }
                widgetLoftData.sceneParams.put("pageUrl", (Object) jSONObject.getString("shareUrl"));
            }
        }
        if (context instanceof FragmentActivity) {
            this.f3015a = new TMSEmbed((Activity) context, TMSEmbedSolutionType.WIDGET, new NativeWidgetNestedRenderContainer(context), false);
        }
    }
}
