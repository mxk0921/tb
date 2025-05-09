package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.TabBundleInfo$NativeDXTabBundle;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.header.RecyclerViewAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Iterator;
import java.util.List;
import tb.fia;
import tb.hha;
import tb.i3u;
import tb.m3a;
import tb.mbc;
import tb.o3s;
import tb.p3a;
import tb.sjr;
import tb.t2o;
import tb.uyg;
import tb.vfa;
import tb.wda;
import tb.xea;
import tb.yga;
import tb.zha;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodsViewPresenter extends vfa<GoodsView, fia> implements mbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean e;
    public final boolean f;
    public p3a h;
    public boolean i;
    public JSONObject j;
    public final BroadcastReceiver k;
    public final boolean g = yga.D();
    public final BroadcastReceiver l = new BroadcastReceiver() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsViewPresenter.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodviewnew/GoodsViewPresenter$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            hha.b("GoodsViewPresenter", "mBagCloseBroadcastReceiver");
            if (GoodsViewPresenter.P(GoodsViewPresenter.this) != null && GoodsViewPresenter.Q(GoodsViewPresenter.this).q() != null) {
                sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE_DISMISS, null, GoodsViewPresenter.R(GoodsViewPresenter.this).q().C());
            }
        }
    };

    static {
        t2o.a(295699029);
        t2o.a(295699033);
    }

    public GoodsViewPresenter(xea xeaVar) {
        super(xeaVar);
        this.e = false;
        this.f = false;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsViewPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodviewnew/GoodsViewPresenter$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                hha.b("GoodsViewPresenter", "onReceive");
                GoodsViewPresenter.O(GoodsViewPresenter.this);
            }
        };
        this.k = broadcastReceiver;
        this.e = yga.U();
        this.f = yga.R();
        if (xeaVar != null && xeaVar.i() != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("TBLiveWVPlugin.Event.container.close");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this.d.i()).registerReceiver(broadcastReceiver, intentFilter);
            c0();
        }
    }

    public static /* synthetic */ void O(GoodsViewPresenter goodsViewPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80bd3626", new Object[]{goodsViewPresenter});
        } else {
            goodsViewPresenter.a0();
        }
    }

    public static /* synthetic */ xea P(GoodsViewPresenter goodsViewPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("62c8db15", new Object[]{goodsViewPresenter});
        }
        return goodsViewPresenter.d;
    }

    public static /* synthetic */ xea Q(GoodsViewPresenter goodsViewPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("f61d39d6", new Object[]{goodsViewPresenter});
        }
        return goodsViewPresenter.d;
    }

    public static /* synthetic */ xea R(GoodsViewPresenter goodsViewPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("89719897", new Object[]{goodsViewPresenter});
        }
        return goodsViewPresenter.d;
    }

    public static /* synthetic */ Object ipc$super(GoodsViewPresenter goodsViewPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodviewnew/GoodsViewPresenter");
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        xea xeaVar = this.d;
        if (!(xeaVar == null || xeaVar.i() == null)) {
            LocalBroadcastManager.getInstance(this.d.i()).unregisterReceiver(this.k);
            LocalBroadcastManager.getInstance(this.d.i()).unregisterReceiver(this.l);
        }
        this.i = false;
    }

    public void T(LiveItemCategoriesResponseData liveItemCategoriesResponseData, JSONObject jSONObject, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73c70f6", new Object[]{this, liveItemCategoriesResponseData, jSONObject, str, list});
            return;
        }
        hha.c("GoodsViewPresenter", "handleCategoriesData ｜ excludeCategory=");
        xea xeaVar = this.d;
        if (xeaVar.l.l) {
            int j = i3u.j(xeaVar.k);
            int p = i3u.p(jSONObject, j, this.i);
            hha.c("GoodsViewPresenter", "handleCategoriesData | oldLiveCartCount=" + j + "   newLiveCartCount=" + p);
        }
        this.d.k = liveItemCategoriesResponseData;
        Z(jSONObject);
        if (wda.e()) {
            m3a m3aVar = ((GoodsView) this.f29980a).j;
            if (m3aVar != null) {
                m3aVar.d(jSONObject, "handleCategoriesData");
            }
        } else {
            RecyclerViewAdapter recyclerViewAdapter = (RecyclerViewAdapter) ((GoodsView) this.f29980a).g.getAdapter();
            if (recyclerViewAdapter != null) {
                for (IDMComponent iDMComponent : recyclerViewAdapter.P("category")) {
                    iDMComponent.getFields().putAll(jSONObject);
                    recyclerViewAdapter.W(iDMComponent);
                }
            }
        }
        zha.j(jSONObject, false);
        ((GoodsView) this.f29980a).H(liveItemCategoriesResponseData, str, list);
    }

    public void U(boolean z, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2614da2", new Object[]{this, new Boolean(z), jSONObject, jSONObject2});
        } else if (jSONObject == null) {
            hha.b("GoodsViewPresenter", "handleTopOperateStripData | resultData is null");
        } else {
            hha.c("GoodsViewPresenter", "handleTopOperate");
            if (!wda.e()) {
                RecyclerViewAdapter recyclerViewAdapter = (RecyclerViewAdapter) ((GoodsView) this.f29980a).g.getAdapter();
                if (recyclerViewAdapter != null) {
                    for (IDMComponent iDMComponent : recyclerViewAdapter.P("topOperate")) {
                        JSONObject data = iDMComponent.getData();
                        if (!data.containsKey("fields")) {
                            data.put("fields", (Object) new JSONObject());
                        }
                        data.getJSONObject("fields").putAll(jSONObject);
                        recyclerViewAdapter.W(iDMComponent);
                    }
                    if (!wda.G()) {
                        zha.o(jSONObject);
                    }
                }
            } else if (((GoodsView) this.f29980a).j != null) {
                if (jSONObject2 != null) {
                    jSONObject.putAll(jSONObject2);
                }
                ((GoodsView) this.f29980a).j.d(jSONObject, "handleTopOperateStripData");
            }
        }
    }

    public void V(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b328135", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            hha.b("GoodsViewPresenter", "handleTopUserBuyStripData | resultData is null");
        } else {
            hha.c("GoodsViewPresenter", "topUserBuyInfo");
            RecyclerViewAdapter recyclerViewAdapter = (RecyclerViewAdapter) ((GoodsView) this.f29980a).g.getAdapter();
            if (recyclerViewAdapter != null) {
                for (IDMComponent iDMComponent : recyclerViewAdapter.P("topUserBuyInfo")) {
                    JSONObject data = iDMComponent.getData();
                    if (!data.containsKey("fields")) {
                        data.put("fields", (Object) new JSONObject());
                    }
                    data.getJSONObject("fields").putAll(jSONObject);
                    recyclerViewAdapter.W(iDMComponent);
                }
            }
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f04914e", new Object[]{this});
            return;
        }
        M m = this.b;
        if (m == 0 || ((fia) m).u() == null) {
            hha.b("GoodsViewPresenter", "hideTopOperateStrip |  mModel.getPreTopOperateStripData is null.");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(((fia) this.b).u());
        jSONObject.put("carouselListV3", (Object) new JSONArray());
        jSONObject.put("carouselListV2", (Object) new JSONArray());
        jSONObject.put("carouselList", (Object) new JSONArray());
        U(false, jSONObject, null);
        V(jSONObject);
        if (this.g) {
            b0(jSONObject);
        }
    }

    /* renamed from: X */
    public fia N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fia) ipChange.ipc$dispatch("f6974ff8", new Object[]{this});
        }
        return new fia(this.d);
    }

    public void Y(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95be17b", new Object[]{this, str, jSONObject});
            return;
        }
        RecyclerViewAdapter recyclerViewAdapter = (RecyclerViewAdapter) ((GoodsView) this.f29980a).g.getAdapter();
        if (recyclerViewAdapter != null) {
            for (IDMComponent iDMComponent : recyclerViewAdapter.P(str)) {
                JSONObject data = iDMComponent.getData();
                if (!data.containsKey("fields")) {
                    data.put("fields", (Object) new JSONObject());
                }
                data.getJSONObject("fields").putAll(jSONObject);
                recyclerViewAdapter.W(iDMComponent);
                o3s.b("GoodsViewPresenter", " notifyComponentChange | apiName=" + str);
            }
        }
    }

    public final void Z(JSONObject jSONObject) {
        JSONArray jSONArray;
        VideoInfo.ExtraGoodsTabItem extraGoodsTabItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120be1e8", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.d.H() != null && (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) != null && !jSONArray.isEmpty()) {
            if (this.d.N()) {
                jSONObject.remove("topRightEntranceList");
                return;
            }
            int t = ((GoodsView) this.f29980a).t();
            List<VideoInfo.ExtraGoodsTabItem> o = this.d.o();
            if (o != null && o.size() > t && (extraGoodsTabItem = o.get(t)) != null && extraGoodsTabItem.showTopBarType != null && !TextUtils.equals(p3a.TAB_TYPE_NATIVE_DX, extraGoodsTabItem.type)) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    String string = ((JSONObject) it.next()).getString("type");
                    if (TextUtils.isEmpty(string)) {
                        it.remove();
                    } else if (!extraGoodsTabItem.showTopBarType.contains(string)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void b0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8baf7022", new Object[]{this, jSONObject});
            return;
        }
        M m = this.b;
        if (m == 0 || jSONObject == null) {
            hha.b("GoodsViewPresenter", " refreshPrivilegeComponent | data is null");
            return;
        }
        ((fia) m).v(jSONObject);
        if (wda.e()) {
            m3a m3aVar = ((GoodsView) this.f29980a).j;
            if (m3aVar != null) {
                m3aVar.d(jSONObject, "refreshPrivilegeComponent");
                return;
            }
            return;
        }
        Y("topUrgeReceivePrivilege", jSONObject);
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756be4f5", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("TradePay.Event.livebag.close");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.d.i()).registerReceiver(this.l, intentFilter);
    }

    public void e0() {
        TabBundleInfo$NativeDXTabBundle g;
        GoodsLiveStateMutitabView goodsLiveStateMutitabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        a0();
        p3a p3aVar = this.h;
        if (p3aVar != null && (g = p3aVar.g()) != null && (goodsLiveStateMutitabView = g.stateMultiTabView) != null) {
            goodsLiveStateMutitabView.resume();
        }
    }

    @Override // tb.mbc
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc25d256", new Object[]{this, new Integer(i)});
        } else {
            ((GoodsView) this.f29980a).N(i);
        }
    }

    public void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6564bf", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void g0(p3a p3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e695b2", new Object[]{this, p3aVar});
        } else {
            this.h = p3aVar;
        }
    }

    public void h0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3db19d", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            this.j = jSONObject;
        }
        V(this.j);
        U(true, ((fia) this.b).u(), this.j);
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446731cf", new Object[]{this});
        } else if (!((GoodsView) this.f29980a).B()) {
            hha.b("GoodsViewPresenter", "refreshHeaderOnly | list is not show.");
        } else {
            if (this.e) {
                hha.b("GoodsViewPresenter", "refreshHeaderOnly | topOperate.");
                ((fia) this.b).z();
            }
            if (this.f) {
                hha.b("GoodsViewPresenter", "refreshHeaderOnly | category.");
                ((fia) this.b).y(true);
            }
        }
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e144fc60", new Object[]{this});
            return;
        }
        hha.b("GoodsViewPresenter", "refreshHeaderAndCategory | defaultCategoryId=");
        ((fia) this.b).y(false);
        ((fia) this.b).z();
    }
}
