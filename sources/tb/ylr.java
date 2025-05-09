package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.kmp.live.updown.TaoLiveKtUpDownRequestType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.taolive.room.business.goodcard.GoodCardItemTppBean;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.mediaplatform.service.monitor.AdMonitorBusiness;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.service.TppParamFeedInfo;
import com.taobao.taolive.sdk.controller.BaseListAdapter;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ylr extends yir implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dba f32173a;
    public final nyd b;
    public final zs2 c;
    public final hjw d;
    public final int e = pvs.t2();
    public boolean f = false;
    public Map<String, String> g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements g1a<TaoLiveKtSwitchModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public xhv invoke(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("757d13da", new Object[]{this, taoLiveKtSwitchModel});
            }
            ylr.B(ylr.this, taoLiveKtSwitchModel);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements g1a<TaoLiveKtSwitchModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public xhv invoke(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("757d13da", new Object[]{this, taoLiveKtSwitchModel});
            }
            ylr.C(ylr.this, taoLiveKtSwitchModel);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements g1a<String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public xhv invoke(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("32558f08", new Object[]{this, str});
            }
            ylr.D(ylr.this, str);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements g1a<String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public xhv invoke(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("32558f08", new Object[]{this, str});
            }
            ylr.E(ylr.this, str);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements g1a<List<z3t>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public xhv invoke(List<z3t> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("bbb0936f", new Object[]{this, list});
            }
            ylr.F(ylr.this, list);
            return null;
        }
    }

    static {
        t2o.a(779092932);
        t2o.a(806355016);
    }

    public ylr(boolean z, dba dbaVar, Activity activity) {
        this.f32173a = dbaVar;
        dbaVar.v0(this);
        a4s.b(activity, sjr.g(), this);
        this.c = new zs2(dbaVar);
        this.d = new hjw(dbaVar);
        nyd s = d9m.s();
        this.b = s;
        if (s != null) {
            s.k(z);
            s.r(new a());
            s.s(new b());
            s.n(new c());
            s.i(new d());
            s.o(new e());
        }
    }

    public static /* synthetic */ void B(ylr ylrVar, TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d85656", new Object[]{ylrVar, taoLiveKtSwitchModel});
        } else {
            ylrVar.M(taoLiveKtSwitchModel);
        }
    }

    public static /* synthetic */ void C(ylr ylrVar, TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ef5cf5", new Object[]{ylrVar, taoLiveKtSwitchModel});
        } else {
            ylrVar.N(taoLiveKtSwitchModel);
        }
    }

    public static /* synthetic */ void D(ylr ylrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2add42b0", new Object[]{ylrVar, str});
        } else {
            ylrVar.K(str);
        }
    }

    public static /* synthetic */ void E(ylr ylrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5698b1", new Object[]{ylrVar, str});
        } else {
            ylrVar.O(str);
        }
    }

    public static /* synthetic */ void F(ylr ylrVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca356bd9", new Object[]{ylrVar, list});
        } else {
            ylrVar.L(list);
        }
    }

    public static /* synthetic */ Object ipc$super(ylr ylrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/datamanager/TBLiveRecEngineKMP");
    }

    @Override // tb.yir
    public void A(String str, long j, boolean z, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db0739e", new Object[]{this, str, new Long(j), new Boolean(z), new Long(j2), str2});
        } else {
            this.d.c(str, j, z, j2, str2);
        }
    }

    public final Map<String, Object> G(String str, String str2, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71da7251", new Object[]{this, str, str2, map, str3});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("curLiveId", str);
        hashMap.put("curAccountId", str2);
        hashMap.put("trackInfo", str3);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final void I(RecModel recModel) {
        wpf a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a4679d", new Object[]{this, recModel});
        } else if (v2s.o().q() != null && (a2 = v2s.o().q().a()) != null) {
            String a3 = a2.a();
            String b2 = a2.b();
            String str = recModel.liveId;
            Map<String, String> map = recModel.initParams;
            if (b2.equals(str)) {
                LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo = (LiveDetailMessinfoResponseData.AlimamaInfo) fkx.f(a3, LiveDetailMessinfoResponseData.AlimamaInfo.class);
                iba.v1(alimamaInfo, this.f32173a);
                recModel.alimama = alimamaInfo;
                if (alimamaInfo != null) {
                    ls0.a(alimamaInfo.ifsUrl, alimamaInfo.pid, "liveUpAndDown");
                    AdMonitorBusiness adMonitorBusiness = new AdMonitorBusiness(null);
                    String str2 = alimamaInfo.pid;
                    String str3 = "";
                    String str4 = map != null ? map.get("livesource") : str3;
                    if (map != null) {
                        str3 = map.get(gf0.K_DELIVERY_ID);
                    }
                    adMonitorBusiness.L(str2, "impression", "", str4, str3);
                }
            }
            v2s.o().q().b(null);
        }
    }

    public final void L(List<z3t> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbb93a9", new Object[]{this, list});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            this.c.d(list, nydVar.q());
        }
    }

    public final void M(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffb5336", new Object[]{this, taoLiveKtSwitchModel});
        } else if (taoLiveKtSwitchModel != null) {
            this.c.p(taoLiveKtSwitchModel, this.g);
            RecModel c2 = this.c.c(0);
            if (pvs.M()) {
                I(c2);
            }
        }
    }

    public final void N(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdc85d9", new Object[]{this, taoLiveKtSwitchModel});
        } else if (taoLiveKtSwitchModel != null) {
            this.c.r(taoLiveKtSwitchModel, this.g);
        }
    }

    public final void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee4fdf5", new Object[]{this, str});
        } else if (pvs.N1() && TaoLiveKtUpDownRequestType.FirstBatch.getValue().equals(str)) {
            sjr.g().c("com.taobao.taolive.room.disable_updown_switch", "REQUEST_TYPE_FIRST_error", vx9.e());
        }
    }

    @Override // tb.yir
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16fed6f", new Object[]{this, jSONObject});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            nydVar.d(m3s.d(jSONObject));
        }
    }

    @Override // tb.yir
    public RecModel b() {
        TaoLiveKtSwitchModel taoLiveKtSwitchModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("c325bd66", new Object[]{this});
        }
        nyd nydVar = this.b;
        if (nydVar == null) {
            return null;
        }
        int q = nydVar.q();
        int i = q + 1;
        this.b.g(i);
        RecModel c2 = this.c.c(i);
        if (!(c2 == null || (taoLiveKtSwitchModel = c2.mTaoLiveKtSwitchModel) == null)) {
            c2.visit = true;
            taoLiveKtSwitchModel.setVisit(true);
            this.d.e(c2, false);
            if (this.b.getItemCount() - q < this.e) {
                this.b.requestRecommendModel(null, TaoLiveKtUpDownRequestType.NextBatch.getValue(), J());
            }
        }
        return c2;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TBLiveRecEngineKMP";
    }

    @Override // tb.yir
    public RecModel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("1f7eb12a", new Object[]{this});
        }
        nyd nydVar = this.b;
        if (nydVar == null) {
            return null;
        }
        int q = nydVar.q() - 1;
        this.b.g(q);
        RecModel c2 = this.c.c(q);
        if (c2 != null) {
            c2.visit = true;
            c2.mTaoLiveKtSwitchModel.setVisit(true);
            this.d.e(c2, false);
        }
        return c2;
    }

    @Override // tb.yir
    public void d(String str, String str2, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0844374", new Object[]{this, str, str2, map, str3});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            this.g = map;
            nydVar.l(G(str, str2, map, str3));
        }
    }

    @Override // tb.yir
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f40ae3", new Object[]{this});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            nydVar.requestRecommendModel(null, TaoLiveKtUpDownRequestType.ForceBatch.getValue(), J());
        }
    }

    @Override // tb.yir
    public RecModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("4287f87f", new Object[]{this});
        }
        nyd nydVar = this.b;
        if (nydVar == null) {
            return null;
        }
        return this.c.c(nydVar.q());
    }

    @Override // tb.yir
    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("10640b09", new Object[]{this});
        }
        nyd nydVar = this.b;
        if (nydVar == null) {
            return null;
        }
        return nln.h(nydVar.p());
    }

    @Override // tb.yir
    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b105257", new Object[]{this});
        }
        nyd nydVar = this.b;
        if (nydVar == null) {
            return null;
        }
        return nln.h(nydVar.h());
    }

    @Override // tb.yir
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        nyd nydVar = this.b;
        if (nydVar == null) {
            return 0;
        }
        return nydVar.q();
    }

    @Override // tb.yir
    public RecModel j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("8c3db0c0", new Object[]{this});
        }
        nyd nydVar = this.b;
        if (nydVar == null) {
            return null;
        }
        return this.c.c(nydVar.q() + 1);
    }

    @Override // tb.yir
    public JSONArray k() {
        List<Map<String, Object>> e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("56aa13e5", new Object[]{this});
        }
        nyd nydVar = this.b;
        if (nydVar == null || (e2 = nydVar.e()) == null) {
            return null;
        }
        return JSON.parseArray(JSON.toJSONString(e2));
    }

    @Override // tb.yir
    public ArrayList<TppParamFeedInfo> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c9056293", new Object[]{this});
        }
        return this.d.a();
    }

    @Override // tb.yir
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d706b7a6", new Object[]{this});
        }
    }

    @Override // tb.yir
    public void n(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf4475e", new Object[]{this, str, str2, str3, hashMap});
        } else if (this.b != null && !this.f) {
            this.f = true;
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, str);
            hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, str2);
            hashMap.put(zlr.PARAM_ENTRY_RECOMMEND_BIND_ID, str3);
            this.b.a(hashMap);
            this.d.e(f(), true);
            x5t.h("TBLiveRecEngineKMP", "android native 首次batch请求 调用kmp" + hashCode());
            this.b.requestRecommendModel(null, TaoLiveKtUpDownRequestType.FirstBatch.getValue(), J());
        }
    }

    @Override // tb.yir
    public void o(VideoInfo videoInfo) {
        VideoInfo.OfficialLiveInfo officialLiveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961ac25f", new Object[]{this, videoInfo});
        } else if (this.b != null && videoInfo != null && videoInfo.isOfficialLive() && videoInfo.broadCaster != null && (officialLiveInfo = videoInfo.officialLiveInfo) != null) {
            this.b.j(videoInfo.liveId, officialLiveInfo.officialLiveId);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.addcart", "com.taobao.taolive.room.gotoDetail", uyg.EVENT_SHOW_GOODSPACKAGE, uyg.EVENT_ACTION_ADD_FAVOR, uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, uyg.EVENT_ACTION_FOLLOW, "com.taobao.taolive.room.share", uyg.EVENT_ADD_ITEM, "com.taobao.taolive.room.add_item_new", uyg.EVENT_INPUT_SHOW, "com.taobao.taolive.room.enter", uyg.EVENT_KMP_COMMENT_SEND};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (vx9.d() != null) {
            return vx9.d().C();
        }
        return null;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else {
            this.d.d(str, obj);
        }
    }

    @Override // tb.yir
    public void p(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d87bf9f", new Object[]{this, recModel});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            this.c.l(recModel, nydVar.q());
        }
    }

    @Override // tb.yir
    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            nydVar.remove(i);
        }
    }

    @Override // tb.yir
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf08f36", new Object[]{this});
        }
    }

    @Override // tb.yir
    public void s() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e8bb97", new Object[]{this});
            return;
        }
        RecModel f = f();
        if (f != null && (str = f.actionUrl) != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQueryParameter(yj4.PARAM_ITEM_IDS) != null) {
                f.actionUrl = u90.l(f.actionUrl, yj4.PARAM_ITEM_IDS, "null");
            }
            if (parse.getQueryParameter(yj4.PARAM_ITEM_HOLD_TYPE) != null) {
                f.actionUrl = u90.l(f.actionUrl, yj4.PARAM_ITEM_HOLD_TYPE, "null");
            }
        }
    }

    @Override // tb.yir
    public void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b60965b", new Object[]{this, context});
        } else if (this.b != null) {
            Intent intent = new Intent("com.taobao.taolive.room.service.VisitedList");
            intent.putExtra("feedList", fkx.i(this.d.b(pvs.F2())));
            LocalBroadcastManager.getInstance(context).sendBroadcastSync(intent);
        }
    }

    @Override // tb.yir
    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6ebae8", new Object[]{this, new Integer(i)});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            nydVar.g(i);
            if (i > this.b.c()) {
                this.b.requestRecommendModel(null, TaoLiveKtUpDownRequestType.NormalRealtime.getValue(), J());
                this.b.m(i);
            }
        }
    }

    @Override // tb.yir
    public void v(BaseListAdapter baseListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f36a3e", new Object[]{this, baseListAdapter});
        } else {
            this.c.o(baseListAdapter);
        }
    }

    @Override // tb.yir
    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1038383", new Object[]{this, str});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            nydVar.f(str);
        }
    }

    @Override // tb.yir
    public void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82cb071", new Object[]{this, new Integer(i)});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            nydVar.t(i);
        }
    }

    @Override // tb.yir
    public void y(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.c.q(recyclerView);
        }
    }

    @Override // tb.yir
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        nyd nydVar = this.b;
        if (nydVar != null) {
            nydVar.stopManager();
        }
        zs2 zs2Var = this.c;
        if (zs2Var != null) {
            zs2Var.b();
        }
        this.f = false;
        sjr.g().b(this);
        d9m.b();
    }

    public final Map<String, Object> J() {
        List<GoodCardItemTppBean> list;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d74c0fbf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        dba dbaVar = this.f32173a;
        if (!(dbaVar == null || dbaVar.r() == null || this.f32173a.r().abilityCompontent == null)) {
            z = ((ibt) this.f32173a.r().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard);
        }
        if (!z) {
            hashMap.put("queryDirectDown", "true");
            dba dbaVar2 = this.f32173a;
            if (!(dbaVar2 == null || (list = dbaVar2.c0) == null || ((ArrayList) list).isEmpty())) {
                hashMap.put(bia.UNDER_TAKE_GOODS_LIST, JSON.toJSONString(this.f32173a.c0));
            }
        }
        dba dbaVar3 = this.f32173a;
        if (dbaVar3 != null) {
            dbaVar3.getClass();
        }
        hashMap.put("feedList", this.d.a());
        return hashMap;
    }

    public final void K(String str) {
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        dba dbaVar;
        ISmartLandingProxy.b bVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b74ee7", new Object[]{this, str});
            return;
        }
        TaoLiveKtUpDownRequestType taoLiveKtUpDownRequestType = TaoLiveKtUpDownRequestType.FirstBatch;
        if (taoLiveKtUpDownRequestType.getValue().equals(str) || TaoLiveKtUpDownRequestType.ForceBatch.getValue().equals(str)) {
            sjr.g().c("com.taobao.taolive.room.enable_updown_switch", null, vx9.e());
            sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
        }
        if (!(!taoLiveKtUpDownRequestType.getValue().equals(str) || f() == null || j() == null)) {
            RecModel f = f();
            RecModel j = j();
            if (!(f == null || j == null || (reserveItemCardInfo = j.reserveItemCardInfo) == null || reserveItemCardInfo.bottomInfo == null || reserveItemCardInfo.cardInfo != null || (dbaVar = this.f32173a) == null || (bVar = dbaVar.u) == null)) {
                bVar.f("hasAlimamaInfo", String.valueOf(f.alimama != null));
                this.f32173a.u.f("nextLiveHasAlimamaInfo", String.valueOf(j.alimama != null));
                ISmartLandingProxy.b bVar2 = this.f32173a.u;
                LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo2 = f.reserveItemCardInfo;
                bVar2.f("hasUpdownBottomInfo", String.valueOf((reserveItemCardInfo2 == null || reserveItemCardInfo2.bottomInfo == null) ? false : true));
                ISmartLandingProxy.b bVar3 = this.f32173a.u;
                LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo3 = j.reserveItemCardInfo;
                if (reserveItemCardInfo3 == null || reserveItemCardInfo3.bottomInfo == null) {
                    z = false;
                }
                bVar3.f("nextLiveHasUpdownBottomInfo", String.valueOf(z));
            }
        }
        igq.n().d("recommendLives");
    }
}
