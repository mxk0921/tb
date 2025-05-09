package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.a;
import tb.a1v;
import tb.brf;
import tb.ckf;
import tb.fks;
import tb.njg;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xpd;
import tb.zbx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WidgetLoftView implements xpd, TRWidgetInstance.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TRWidgetInstance f3014a;
    public WidgetLoftData b;
    public boolean c;
    public View d;
    public Context e;
    public JSONObject f;
    public final njg g = a.b(new WidgetLoftView$rootView$2(this));

    static {
        t2o.a(766509229);
        t2o.a(766509126);
    }

    public static final /* synthetic */ Context a(WidgetLoftView widgetLoftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("963f9b67", new Object[]{widgetLoftView});
        }
        return widgetLoftView.e;
    }

    public static final /* synthetic */ View b(WidgetLoftView widgetLoftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2b5a670f", new Object[]{widgetLoftView});
        }
        return widgetLoftView.d;
    }

    public static final /* synthetic */ TRWidgetInstance c(WidgetLoftView widgetLoftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRWidgetInstance) ipChange.ipc$dispatch("beff16b2", new Object[]{widgetLoftView});
        }
        return widgetLoftView.f3014a;
    }

    public static final /* synthetic */ void d(WidgetLoftView widgetLoftView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb29fab1", new Object[]{widgetLoftView, view});
        } else {
            widgetLoftView.d = view;
        }
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        HashMap<String, String> h = getUTProperties();
        if (h != null) {
            h.put("spm", "a2141.b91375813.c1638791681170.d1638791681170");
        }
        a1v.n("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_exposure", h);
        TRWidgetInstance tRWidgetInstance = this.f3014a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3014a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
    public void e(fks fksVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3608db", new Object[]{this, fksVar, map});
            return;
        }
        if (!ckf.b(TRWidgetConstant.CL_TRIVER_INITING.f19372a, fksVar == null ? null : fksVar.f19372a)) {
            if (fksVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "errorCode", fksVar.f19372a);
                jSONObject.put((JSONObject) "errorMessage", fksVar.b);
                jSONObject.put((JSONObject) "errorActionType", fksVar.c);
                npp.Companion.b(ckf.p("on widget render error : ", jSONObject));
            }
            r54.C(new WidgetLoftView$onRenderError$2(this));
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    public final void f() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b632172c", new Object[]{this});
        } else if (!this.c) {
            this.c = true;
            WidgetLoftData widgetLoftData = this.b;
            if (widgetLoftData != null) {
                TRWidgetInstance tRWidgetInstance = this.f3014a;
                if (tRWidgetInstance != null) {
                    Context context = this.e;
                    ckf.d(context);
                    tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(context));
                }
                TRWidgetInstance tRWidgetInstance2 = this.f3014a;
                if (tRWidgetInstance2 != null) {
                    tRWidgetInstance2.registerWidgetRenderListener(this);
                }
                TRWidgetInstance tRWidgetInstance3 = this.f3014a;
                if (tRWidgetInstance3 != null) {
                    tRWidgetInstance3.registerWidgetExceptionListener(new zbx());
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
                widgetStartParams.setVisualX(String.valueOf(widgetLoftData.visualX));
                widgetStartParams.setVisualY(String.valueOf(widgetLoftData.visualY));
                JSONObject jSONObject2 = widgetLoftData.initData;
                if (jSONObject2 != null) {
                    str2 = jSONObject2.toString();
                }
                widgetStartParams.setInitData(str2);
                TRWidgetInstance tRWidgetInstance4 = this.f3014a;
                if (tRWidgetInstance4 != null) {
                    tRWidgetInstance4.render(widgetStartParams);
                }
                FrameLayout g = g();
                TRWidgetInstance tRWidgetInstance5 = this.f3014a;
                ckf.d(tRWidgetInstance5);
                g.addView(tRWidgetInstance5.getRootView());
            }
        }
    }

    public final FrameLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return (FrameLayout) this.g.getValue();
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
        return g();
    }

    /* renamed from: h */
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
            this.f3014a = new TRWidgetInstance((FragmentActivity) context);
        }
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3014a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3014a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3014a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.stop();
        }
    }

    @Override // tb.xpd
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3014a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        this.f3014a = null;
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
    public void onRenderSuccess(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
        } else {
            npp.Companion.b("on widget render success");
        }
    }

    @Override // tb.xpd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3014a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // tb.xpd
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }
}
