package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean.LVView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import java.util.HashMap;
import java.util.Map;
import tb.bn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m3a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f23752a;
    public final GoodsView b;
    public final feg c;
    public final ViewGroup d;
    public final JSONObject e;
    public LVView f;
    public Map<String, Object> g;

    static {
        t2o.a(295699016);
    }

    public m3a(xea xeaVar, GoodsView goodsView, ViewGroup viewGroup) {
        JSONObject jSONObject = new JSONObject();
        this.e = jSONObject;
        this.f23752a = xeaVar;
        this.b = goodsView;
        this.d = viewGroup;
        this.c = xeaVar.I().h;
        jSONObject.put("extraGoodsTabList", fkx.h(xeaVar.H().extraGoodsTabList));
        jSONObject.put("itemListType", fkx.h(xeaVar.H().itemListType));
        b();
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Number h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d7859d", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("compressList");
            if (!TextUtils.isEmpty(string) && (h = o66.h(qm7.a(string, "", new bn7.b().j(jSONObject2).f()))) != null && h.intValue() > 0) {
                this.b.q(nw0.c(ikr.f().e(), this.f23752a.i(), h.intValue()));
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b6ede2", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        hashMap.put("keyViewHandler", this.b.u());
        this.g.put("keyTopBarHandler", this.b.e);
        this.g.put(l10.KEY_GOODS_LIVE_CONTEXT, this.f23752a);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a851ff20", new Object[]{this});
            return;
        }
        int t = this.b.t();
        if (this.f23752a.H() == null || this.f23752a.o() == null || this.f23752a.o().size() <= t) {
            hha.b("GLHeaderView", "putCurrentTabInfo | info empty. index=" + t);
            this.e.remove("showTopBarType");
            return;
        }
        this.e.put("showTopBarType", fkx.h(this.f23752a.o().get(t).showTopBarType));
        this.e.put("tabIndex", (Object) Integer.valueOf(t));
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f28d544", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = this.e.containsKey("extraGoodsTabList") ? this.e.getJSONArray("extraGoodsTabList") : null;
            this.e.putAll(jSONObject);
            int t = this.b.t();
            if (this.f23752a.H() == null || this.f23752a.o() == null || this.f23752a.o().size() <= t) {
                hha.b("GLHeaderView", "putCurrentTabInfo | info empty. index=" + t);
                this.e.remove("showTopBarType");
            } else {
                this.e.put("showTopBarType", fkx.h(this.f23752a.o().get(t).showTopBarType));
                this.e.put("tabIndex", (Object) Integer.valueOf(t));
            }
            if (this.e.containsKey("extraGoodsTabList")) {
                jSONArray = this.e.getJSONArray("extraGoodsTabList");
            }
            if ((jSONArray == null || jSONArray.isEmpty()) && jSONArray2 != null) {
                this.e.put("extraGoodsTabList", (Object) jSONArray2);
            }
        } catch (Exception e) {
            hha.b("GLHeaderView", "putCurrentTabInfo | error. " + e.getMessage());
        }
    }

    public void d(JSONObject jSONObject, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a025b0", new Object[]{this, jSONObject, str});
            return;
        }
        hha.b("GLHeaderView", "renderHeader | from=" + str);
        if (i9l.a("goodlist", "enableCategoryCdnFix", Boolean.TRUE).booleanValue()) {
            e(jSONObject);
        } else {
            this.e.putAll(jSONObject);
            c();
        }
        if (this.f == null) {
            this.f = this.c.d(this.f23752a.i(), GLRenderType.GOODS_LIST.pageCode, this.g);
        } else {
            z = false;
        }
        LVView lVView = this.f;
        if (lVView != null) {
            this.c.j(lVView, "GLHeader", this.e);
            if (z) {
                this.d.removeAllViews();
                this.d.addView(this.f);
            }
            if (this.f.getRenderNode() != null && this.f.getRenderNode().c() != null) {
                a(this.f.getRenderNode().c().f, this.e);
            }
        }
    }
}
