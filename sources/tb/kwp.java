package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean.LVView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kwp implements jqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f22973a;
    public final feg b;
    public LVView c;
    public final a1o d;
    public final boolean e;
    public final GLRenderType f;

    static {
        t2o.a(295699117);
        t2o.a(295699052);
    }

    public kwp(xea xeaVar, boolean z, GLRenderType gLRenderType) {
        boolean z2;
        this.f22973a = xeaVar;
        this.e = z;
        this.f = gLRenderType;
        this.b = xeaVar.I().h;
        if (GLRenderType.KANDIAN_BIG_CARD == gLRenderType) {
            z2 = true;
        } else {
            z2 = false;
        }
        a1o a1oVar = new a1o(null, z2);
        this.d = a1oVar;
        a1oVar.i(xeaVar);
    }

    @Override // tb.jqd
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1710c0", new Object[]{this, viewGroup});
            return;
        }
        LVView lVView = this.c;
        if (lVView != null) {
            lVView.destroy();
        }
    }

    @Override // tb.jqd
    public void c(FrameLayout frameLayout, LiveItem liveItem, gwp gwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ecdd95", new Object[]{this, frameLayout, liveItem, gwpVar});
        } else {
            e(frameLayout, liveItem, gwpVar);
        }
    }

    public final void f(DXWidgetNode dXWidgetNode, LiveItem liveItem) {
        JSONObject i;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7982fd", new Object[]{this, dXWidgetNode, liveItem});
        } else if (liveItem != null && liveItem.nativeConfigInfos != null && dXWidgetNode != null && dXWidgetNode.getDXRuntimeContext() != null && (i = dXWidgetNode.getDXRuntimeContext().i()) != null) {
            String string = liveItem.nativeConfigInfos.getString("sabItemAtmosphereState");
            JSONObject jSONObject2 = i.getJSONObject("ultronItemData");
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("nativeConfigInfos")) != null) {
                jSONObject.put("sabItemAtmosphereState", (Object) string);
            }
        }
    }

    public final JSONObject d(LiveItem liveItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4cd787f7", new Object[]{this, liveItem});
        }
        liveItem.nativeConfigInfos.put("enableNewHotSaleAtmosphere", (Object) Boolean.TRUE);
        JSONObject jSONObject = liveItem.nativeConfigInfos;
        if (this.e) {
            str = "true";
        } else {
            str = "false";
        }
        jSONObject.put("showcasePcg", (Object) str);
        JSONObject parseJsonObject = liveItem.parseJsonObject();
        this.d.g(this.f22973a, parseJsonObject, false, this.f);
        return parseJsonObject;
    }

    @Override // tb.jqd
    public void b(FrameLayout frameLayout, LiveItem liveItem) {
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47166032", new Object[]{this, frameLayout, liveItem});
        } else if ((!qvs.P() || !hjr.E("enableBanShowShowCase", false)) && (xeaVar = this.f22973a) != null) {
            if (!(xeaVar == null || xeaVar.q() == null || this.f22973a.q().w() == null)) {
                this.f22973a.q().w().a("hasShowShowCase", "true");
            }
            hha.e("showcase_render");
            LVView lVView = this.c;
            HashMap hashMap = new HashMap();
            hashMap.put(l10.KEY_GOODS_LIVE_CONTEXT, this.f22973a);
            if (lVView == null) {
                lVView = this.b.d(this.f22973a.i(), this.f.pageCode, hashMap);
            }
            if (lVView == null) {
                hha.b("ShowcaseRenderUltron", "renderNormalCard | create view failed.");
                return;
            }
            lVView.setRenderPipeline(true);
            this.b.j(lVView, this.f.renderNode, d(liveItem));
            frameLayout.removeAllViews();
            frameLayout.addView(lVView);
            this.c = lVView;
            hha.f();
        }
    }

    public final void e(FrameLayout frameLayout, LiveItem liveItem, gwp gwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678d1cb2", new Object[]{this, frameLayout, liveItem, gwpVar});
        } else if (frameLayout == null || frameLayout.getChildCount() < 1) {
            hha.b("ShowcaseRenderUltron", "refreshCardInternal | rootView=" + frameLayout);
        } else {
            View childAt = frameLayout.getChildAt(0);
            if (!(childAt instanceof LVView)) {
                hha.b("ShowcaseRenderUltron", "refreshCardInternal | child error. child=" + childAt);
                return;
            }
            JSONObject d = d(liveItem);
            LVView lVView = (LVView) childAt;
            this.b.i(lVView, "smallcardcontent", d);
            if (yga.M()) {
                this.b.i(lVView, "backgroundLayerCard", d);
            }
            DXWidgetNode queryDXWidgetNodeInternal = lVView.queryDXWidgetNodeInternal("good_atmosphere_content");
            if (queryDXWidgetNodeInternal != null) {
                f(queryDXWidgetNodeInternal, liveItem);
                lVView.refreshDXWidgetNode(queryDXWidgetNodeInternal);
            }
        }
    }
}
