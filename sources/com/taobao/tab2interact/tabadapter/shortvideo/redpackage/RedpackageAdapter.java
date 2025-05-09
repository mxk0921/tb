package com.taobao.tab2interact.tabadapter.shortvideo.redpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.model.UserModel;
import com.taobao.login4android.api.Login;
import com.taobao.tab2interact.core.redpackage.mtop.AwardRequestParams;
import com.taobao.tab2interact.core.redpackage.mtop.BucketHitRequestParams;
import com.taobao.tab2interact.core.redpackage.mtop.RedPackageRequestParams;
import com.taobao.tab2interact.core.redpackage.mtop.RedPackageResultRequestParams;
import com.taobao.tab2interact.core.utils.MtopUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.cbu;
import tb.ckf;
import tb.g1a;
import tb.jmi;
import tb.jpu;
import tb.kis;
import tb.kqu;
import tb.kxd;
import tb.mqu;
import tb.t2o;
import tb.ud0;
import tb.uj3;
import tb.v3i;
import tb.v4s;
import tb.v7;
import tb.vaj;
import tb.vgh;
import tb.vv1;
import tb.xhv;
import tb.yfm;
import tb.yps;
import tb.yz3;
import tb.z0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RedpackageAdapter extends v7<Object> implements z0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String k;
    public String m;
    public Map<String, ? extends Object> p;
    public Map<String, String> r;
    public final Context s;
    public final kxd t;
    public JSONObject j = new JSONObject();
    public String l = "guangguang_pick";
    public String n = "";
    public Map<String, ? extends Object> o = new HashMap();
    public final yfm q = new yfm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963270);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements MtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ g1a b;

        public b(g1a g1aVar) {
            this.b = g1aVar;
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
                return;
            }
            vgh.c(this, "Redpackage", "receiveAward error, data: " + mtopResponse);
            RedpackageAdapter.X(RedpackageAdapter.this);
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b63e5d", new Object[]{this, mtopResponse});
            } else if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "mtopResponse.bytedata");
                JSONObject jSONObject = JSON.parseObject(new String(bytedata, uj3.UTF_8)).getJSONObject("data");
                if (!(jSONObject instanceof Map) || !mqu.Companion.b(jSONObject.get("finished"), false)) {
                    vgh.c(this, "Redpackage", "receiveAward error, data: " + jSONObject);
                    return;
                }
                this.b.invoke(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements MtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b63e5d", new Object[]{this, mtopResponse});
                return;
            }
            vgh.c(this, "Redpackage", "reportBucketHit return, data: " + mtopResponse);
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
                return;
            }
            vgh.c(this, "Redpackage", "reportBucketHit error, retCode: " + mtopResponse);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d implements MtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b63e5d", new Object[]{this, mtopResponse});
                return;
            }
            vgh.c(this, "Redpackage", "requestRedpackage return, data: " + mtopResponse);
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "mtopResponse.bytedata");
                JSONObject jSONObject = JSON.parseObject(new String(bytedata, uj3.UTF_8)).getJSONObject("data");
                if (jSONObject instanceof Map) {
                    RedpackageAdapter.T(RedpackageAdapter.this, jSONObject);
                    mqu.a aVar = mqu.Companion;
                    boolean b = aVar.b(aVar.j(jSONObject, "userPop.canShow"), false);
                    boolean b2 = aVar.b(aVar.j(jSONObject, "userPop.popupDelayed"), false);
                    String i = aVar.i(aVar.j(jSONObject, "clientInfo.executeClient"), null);
                    String i2 = aVar.i(aVar.j(jSONObject, "userPop.type"), null);
                    String i3 = aVar.i(aVar.j(jSONObject, "experimentInfo.requestExperiment"), null);
                    String i4 = aVar.i(aVar.j(jSONObject, "experimentInfo.component"), null);
                    String i5 = aVar.i(aVar.j(jSONObject, "experimentInfo.module"), null);
                    RedpackageAdapter.k0(RedpackageAdapter.this, "init", v3i.f(jpu.a("96352", jSONObject)));
                    RedpackageAdapter.Z(RedpackageAdapter.this, b, i2, i);
                    RedpackageAdapter.R(RedpackageAdapter.this, i, i2, i3, i4, i5);
                    if (!b2) {
                        RedpackageAdapter.W(RedpackageAdapter.this, jSONObject);
                    } else {
                        vgh.c(this, "Redpackage", "popupDelayed");
                    }
                }
            }
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
                return;
            }
            RedpackageAdapter.U(RedpackageAdapter.this, false);
            RedpackageAdapter.Y(RedpackageAdapter.this);
            vgh.c(this, "Redpackage", "requestingRedpackage error, res: " + mtopResponse);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e implements MtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a f11869a;

        public e(g1a g1aVar) {
            this.f11869a = g1aVar;
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b63e5d", new Object[]{this, mtopResponse});
                return;
            }
            vgh.c(this, "Redpackage", "request Result Redpackage return, data: " + mtopResponse);
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "mtopResponse.bytedata");
                JSONObject jSONObject = JSON.parseObject(new String(bytedata, uj3.UTF_8)).getJSONObject("data");
                if (jSONObject instanceof Map) {
                    this.f11869a.invoke(jSONObject);
                }
            }
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
                return;
            }
            vgh.c(this, "Redpackage", "request Result Redpackage error, " + mtopResponse);
        }
    }

    static {
        t2o.a(689963269);
        t2o.a(919601351);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpackageAdapter(Context context, kxd kxdVar, jmi jmiVar, vv1 vv1Var, yps ypsVar) {
        super(jmiVar, vv1Var, ypsVar);
        ckf.g(context, "context");
        ckf.g(kxdVar, "serviceDelegate");
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(ypsVar, "tabBaseInfoManager");
        this.s = context;
        this.t = kxdVar;
    }

    public static final /* synthetic */ Map M(RedpackageAdapter redpackageAdapter, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("295eb773", new Object[]{redpackageAdapter, map, map2});
        }
        return redpackageAdapter.l0(map, map2);
    }

    public static final /* synthetic */ boolean N(RedpackageAdapter redpackageAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66b45d61", new Object[]{redpackageAdapter})).booleanValue();
        }
        return redpackageAdapter.g;
    }

    public static final /* synthetic */ void O(RedpackageAdapter redpackageAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b57b88", new Object[]{redpackageAdapter, new Boolean(z)});
        } else {
            redpackageAdapter.p0(z);
        }
    }

    public static final /* synthetic */ void P(RedpackageAdapter redpackageAdapter, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5ca6c9", new Object[]{redpackageAdapter, map});
        } else {
            redpackageAdapter.r0(map);
        }
    }

    public static final /* synthetic */ void Q(RedpackageAdapter redpackageAdapter, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51339f2", new Object[]{redpackageAdapter, g1aVar});
        } else {
            redpackageAdapter.t0(g1aVar);
        }
    }

    public static final /* synthetic */ void R(RedpackageAdapter redpackageAdapter, String str, String str2, Object obj, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec57eb2b", new Object[]{redpackageAdapter, str, str2, obj, str3, str4});
        } else {
            redpackageAdapter.w0(str, str2, obj, str3, str4);
        }
    }

    public static final /* synthetic */ void S(RedpackageAdapter redpackageAdapter, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ab83d2", new Object[]{redpackageAdapter, g1aVar});
        } else {
            redpackageAdapter.y0(g1aVar);
        }
    }

    public static final /* synthetic */ void T(RedpackageAdapter redpackageAdapter, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb9204e", new Object[]{redpackageAdapter, map});
        } else {
            redpackageAdapter.p = map;
        }
    }

    public static final /* synthetic */ void U(RedpackageAdapter redpackageAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cb3ac", new Object[]{redpackageAdapter, new Boolean(z)});
        } else {
            redpackageAdapter.i = z;
        }
    }

    public static final /* synthetic */ void V(RedpackageAdapter redpackageAdapter, String str, Map map, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c01f3e", new Object[]{redpackageAdapter, str, map, g1aVar});
        } else {
            redpackageAdapter.z0(str, map, g1aVar);
        }
    }

    public static final /* synthetic */ void W(RedpackageAdapter redpackageAdapter, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87fbd74", new Object[]{redpackageAdapter, map});
        } else {
            redpackageAdapter.A0(map);
        }
    }

    public static final /* synthetic */ void X(RedpackageAdapter redpackageAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a3bcaa", new Object[]{redpackageAdapter});
        } else {
            redpackageAdapter.C0();
        }
    }

    public static final /* synthetic */ void Y(RedpackageAdapter redpackageAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02ca0fd", new Object[]{redpackageAdapter});
        } else {
            redpackageAdapter.D0();
        }
    }

    public static final /* synthetic */ void Z(RedpackageAdapter redpackageAdapter, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825d6d91", new Object[]{redpackageAdapter, new Boolean(z), str, str2});
        } else {
            redpackageAdapter.E0(z, str, str2);
        }
    }

    public static final /* synthetic */ void a0(RedpackageAdapter redpackageAdapter, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32043213", new Object[]{redpackageAdapter, new Boolean(z), str});
        } else {
            redpackageAdapter.F0(z, str);
        }
    }

    public static final /* synthetic */ void b0(RedpackageAdapter redpackageAdapter, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7fcab2", new Object[]{redpackageAdapter, str, new Boolean(z)});
        } else {
            redpackageAdapter.H0(str, z);
        }
    }

    public static final /* synthetic */ void c0(RedpackageAdapter redpackageAdapter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88427a2", new Object[]{redpackageAdapter, str});
        } else {
            redpackageAdapter.I0(str);
        }
    }

    public static final /* synthetic */ void d0(RedpackageAdapter redpackageAdapter, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12337537", new Object[]{redpackageAdapter, str, new Boolean(z)});
        } else {
            redpackageAdapter.J0(str, z);
        }
    }

    public static final /* synthetic */ void e0(RedpackageAdapter redpackageAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8cccf2", new Object[]{redpackageAdapter});
        } else {
            redpackageAdapter.L0();
        }
    }

    public static final /* synthetic */ void f0(RedpackageAdapter redpackageAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343c42be", new Object[]{redpackageAdapter});
        } else {
            redpackageAdapter.M0();
        }
    }

    public static final /* synthetic */ void g0(RedpackageAdapter redpackageAdapter, boolean z, boolean z2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e503b8f0", new Object[]{redpackageAdapter, new Boolean(z), new Boolean(z2), obj});
        } else {
            redpackageAdapter.O0(z, z2, obj);
        }
    }

    public static final /* synthetic */ void h0(RedpackageAdapter redpackageAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59eefd25", new Object[]{redpackageAdapter, new Boolean(z)});
        } else {
            redpackageAdapter.P0(z);
        }
    }

    public static final /* synthetic */ void i0(RedpackageAdapter redpackageAdapter, boolean z, boolean z2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7755fc", new Object[]{redpackageAdapter, new Boolean(z), new Boolean(z2), obj});
        } else {
            redpackageAdapter.R0(z, z2, obj);
        }
    }

    public static /* synthetic */ Object ipc$super(RedpackageAdapter redpackageAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1544323859:
                super.A((String) objArr[0], (String) objArr[1]);
                return null;
            case -1494410735:
                super.z((Map) objArr[0]);
                return null;
            case -706673279:
                super.v();
                return null;
            case -172691066:
                super.C((String) objArr[0], (String) objArr[1]);
                return null;
            case 79699924:
                super.B((String) objArr[0]);
                return null;
            case 1335953106:
                super.D((String) objArr[0], (String) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/redpackage/RedpackageAdapter");
        }
    }

    public static final /* synthetic */ void j0(RedpackageAdapter redpackageAdapter, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e619c3", new Object[]{redpackageAdapter, new Boolean(z), obj});
        } else {
            redpackageAdapter.T0(z, obj);
        }
    }

    public static final /* synthetic */ void k0(RedpackageAdapter redpackageAdapter, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5818bb0e", new Object[]{redpackageAdapter, str, map});
        } else {
            redpackageAdapter.W0(str, map);
        }
    }

    @Override // tb.w7, tb.wx1
    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f37ced", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabType");
        super.A(str, str2);
        if (ckf.b(str, "video")) {
            this.k = str;
            IStorageAdapter f = ud0.Companion.f();
            f.b("ggredpackagestatus", new JSONObject());
            f.b("ggredpackagequeryunhandled", new JSONObject());
        }
    }

    @Override // tb.w7, tb.wx1
    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        super.B(str);
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2353e23f", new Object[]{this});
        } else {
            cbu.d("Show-openFakeGuidesReceiveAward", kotlin.collections.a.h());
        }
    }

    @Override // tb.w7
    public Object F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("392caa4", new Object[]{this});
        }
        return null;
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be1b507", new Object[]{this});
        } else {
            cbu.b("Button-LearnPage", v3i.f(jpu.a("spm", "a21afv.28088452.growth.8")));
        }
    }

    public final void W0(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a875799", new Object[]{this, str, map});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(this.j);
        if (map != null) {
            jSONObject.putAll(map);
        }
        jSONObject.put((JSONObject) "status", str);
        this.j = jSONObject;
        ud0.Companion.f().b("ggredpackagestatus", jSONObject);
        s0("ggredpackagestatuschanged", jSONObject);
        Intent intent = new Intent("ggredpackagestatuschanged");
        intent.putExtra("data", jSONObject);
        LocalBroadcastManager.getInstance(this.s).sendBroadcast(intent);
    }

    @Override // tb.z0d
    public void c(String str, JSONObject jSONObject) {
        Map<String, ? extends Object> map;
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f33023", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "name");
        ckf.g(jSONObject, "params");
        if (ckf.b(str, "ggGetLastQueryNotify")) {
            if (n0()) {
                map2 = this.r;
            } else {
                map2 = this.t.R();
            }
            s0("ggLastQueryNotify", map2);
            this.r = null;
        } else if (ckf.b(str, "ggh5NotifyOpenRedPacket") && !this.h && (map = this.p) != null) {
            A0(map);
        }
    }

    public final boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2db3a1b", new Object[]{this})).booleanValue();
        }
        return ((Boolean) ud0.Companion.b().c("weitao_switch.isFixGGLastQueryNotify", Boolean.TRUE)).booleanValue();
    }

    public final boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    public final void p0(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be518f13", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        Map<String, ? extends Object> f = v3i.f(jpu.a("isPop", Boolean.valueOf(z)));
        s0("ggNativeNotifyPopStatus", f);
        ud0.Companion.f().b("ggNativeNotifyPopStatus", f);
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "VSMSG_pausePlayer";
        } else {
            str = "VSMSG_playPlayer";
        }
        jSONObject.put((JSONObject) "name", str);
        jSONObject.put((JSONObject) "args", (String) new JSONObject());
        this.t.u(new BaseOuterComponent.b("messageChannelForBaseGG", jSONObject, BaseOuterComponent.OuterComponentType.INTERACT_CONTAINER, BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER, BaseOuterComponent.OuterComponentType.TAB, "video"));
    }

    public final void s0(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd94b69e", new Object[]{this, str, map});
        } else {
            this.t.v(str, map);
        }
    }

    public final void t0(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf4e87", new Object[]{this, g1aVar});
            return;
        }
        AwardRequestParams awardRequestParams = new AwardRequestParams();
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        if (!this.o.isEmpty()) {
            String jSONString = JSON.toJSONString(this.o);
            ckf.f(jSONString, "JSON.toJSONString(this.currentExtParams)");
            hashMap.put("extParams", jSONString);
        }
        hashMap.put("invokeApp", kis.TAO);
        jSONObject.put((JSONObject) "entityId", "99558");
        jSONObject.put((JSONObject) "params", JSON.toJSONString(hashMap));
        awardRequestParams.setData(jSONObject);
        MtopUtils.INSTANCE.e(awardRequestParams, new b(g1aVar));
    }

    public final void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131a62b5", new Object[]{this});
        } else {
            this.t.F("ggh5NotifyOpenRedPacket", this);
        }
    }

    @Override // tb.wx1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e10581", new Object[]{this});
        } else {
            super.v();
        }
    }

    public final void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd7fd80", new Object[]{this});
        } else {
            this.t.F("ggGetLastQueryNotify", this);
        }
    }

    public final void y0(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3719a867", new Object[]{this, g1aVar});
            return;
        }
        RedPackageResultRequestParams redPackageResultRequestParams = new RedPackageResultRequestParams();
        HashMap hashMap = new HashMap();
        hashMap.put("invokeApp", kis.TAO);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "entityId", "94268");
        String str = this.k;
        if (str != null) {
            jSONObject.put((JSONObject) "tabSource", str);
            jSONObject.put((JSONObject) "params", JSON.toJSONString(hashMap));
            redPackageResultRequestParams.setData(jSONObject);
            MtopUtils.INSTANCE.e(redPackageResultRequestParams, new e(g1aVar));
            return;
        }
        ckf.y(vaj.KEY_TAB_ID);
        throw null;
    }

    @Override // tb.wx1
    public void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ed1a11", new Object[]{this, map});
            return;
        }
        ckf.g(map, "pageURLQuery");
        super.z(map);
        this.r = map;
    }

    public final void z0(String str, Map<String, ? extends Object> map, g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48849", new Object[]{this, str, map, g1aVar});
            return;
        }
        vgh.c(this, "Redpackage", "showPopInternal, name: " + str + ", data: " + map);
        this.q.b(this.s, str, map, g1aVar);
    }

    @Override // tb.wx1
    public void C(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f186", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        super.C(str, str2);
        v0();
        if (ckf.b(str, "video")) {
            this.f++;
            this.g = true;
            u0();
            x0();
        }
    }

    @Override // tb.wx1
    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa106d2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        super.D(str, str2);
        if (ckf.b(str, "video")) {
            this.g = false;
        }
    }

    public final void m0(BaseOuterComponent.b bVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        if ((ckf.b(bVar.b(), "MSG_URL_REFRESH") || ckf.b(bVar.b(), "MSG_INIT_URL")) && (a2 = bVar.a()) != null && !a2.isEmpty()) {
            Object obj = a2.get("iconStreams");
            if (obj instanceof String) {
                JSONArray parseArray = JSON.parseArray((String) obj);
                if (((CharSequence) obj).length() > 0) {
                    Object obj2 = parseArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        mqu.a aVar = mqu.Companion;
                        JSONObject jSONObject = (JSONObject) obj2;
                        String i = aVar.i(jSONObject.get("sceneSource"), "guangguang_pick");
                        ckf.d(i);
                        this.l = i;
                        this.m = aVar.i(jSONObject.get("entityId"), null);
                    }
                }
            }
            this.o = a2;
            this.n = mqu.Companion.i(a2.get("sceneSource"), "");
            if (ckf.b(bVar.b(), "MSG_URL_REFRESH") && this.g) {
                Map<String, String> R = this.t.R();
                ud0.Companion.f().b("ggredpackagequeryunhandled", R);
                s0("ggredpackagequeryunhandled", R);
            }
        }
    }

    public final void q0(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93773781", new Object[]{this, map});
            return;
        }
        String i = mqu.Companion.i(map.get("currentStage"), null);
        Object obj = map.get("rewardPopInfo");
        B0(i, obj);
        if (i != null && (obj instanceof Map)) {
            if (ckf.b(i, "0")) {
                G0(i);
                p0(true);
                z0(yfm.POP_RED_PACKAGE_GUIDE, map, new RedpackageAdapter$openFakeGuide$1(this, i, map));
            } else if (ckf.b(i, "1")) {
                t0(new RedpackageAdapter$openFakeGuide$2(this, map));
            }
        }
    }

    public final void r0(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19843314", new Object[]{this, map});
            return;
        }
        Object obj = map.get("rewardPopInfo");
        String i = mqu.Companion.i(map.get("currentStage"), null);
        if (obj instanceof Map) {
            Map<String, ? extends Object> map2 = (Map) obj;
            if (map2.get("tokenCount") != null) {
                K0(i);
                p0(true);
                z0(yfm.POP_RED_PACKAGE_RESULT, map2, new RedpackageAdapter$openResultPackageOnFakeGuides$1(this, i, map));
            }
        }
    }

    public final void w0(String str, String str2, Object obj, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1775fa80", new Object[]{this, str, str2, obj, str3, str4});
        } else if (ckf.b(str, "web") && ckf.b(str2, "NW") && mqu.Companion.b(obj, false) && str3 != null && str4 != null) {
            BucketHitRequestParams bucketHitRequestParams = new BucketHitRequestParams();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "component", str3);
            jSONObject.put((JSONObject) "module", str4);
            jSONObject.put((JSONObject) "invokeApp", kis.TAO);
            bucketHitRequestParams.setData(jSONObject);
            MtopUtils.INSTANCE.e(bucketHitRequestParams, new c());
        }
    }

    public final void A0(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f1aa3f", new Object[]{this, map});
        } else if (!this.g) {
            vgh.c(this, "Redpackage", "ignore showRedpackagePop, isAppear is false");
        } else {
            this.p = null;
            mqu.a aVar = mqu.Companion;
            boolean b2 = aVar.b(aVar.j(map, "userPop.canShow"), false);
            String i = aVar.i(aVar.j(map, "clientInfo.executeClient"), null);
            String i2 = aVar.i(aVar.j(map, "userPop.type"), null);
            int d2 = aVar.d(aVar.j(map, "userPop.autoOpenTime"), 0);
            Object j = aVar.j(map, "entranceStagePop");
            Object j2 = aVar.j(map, "awardStrengthenPop");
            if (!b2 || !ckf.b(i, "web") || !ckf.b(i2, "NW")) {
                if (j instanceof Map) {
                    q0((Map) j);
                } else if (j2 instanceof Map) {
                    Map<String, ? extends Object> map2 = (Map) j2;
                    if (map2.get("tokenCount") != null) {
                        Q0();
                        p0(true);
                        z0(yfm.POP_RED_PACKAGE_RESULT, map2, new RedpackageAdapter$showRedpackagePop$2(this));
                    }
                }
            } else if (aVar.b(aVar.j(map, "hidden"), false)) {
                vgh.c(this, "Redpackage", "showRedpackagePop, hidden is true");
            } else {
                S0(true);
                W0("show", null);
                RedpackageAdapter$showRedpackagePop$callback$1 redpackageAdapter$showRedpackagePop$callback$1 = new RedpackageAdapter$showRedpackagePop$callback$1(this, b2);
                if (d2 == -1) {
                    y0(redpackageAdapter$showRedpackagePop$callback$1);
                    return;
                }
                p0(true);
                z0(yfm.POP_NEW_USER, map, new RedpackageAdapter$showRedpackagePop$1(this, redpackageAdapter$showRedpackagePop$callback$1));
            }
        }
    }

    public final void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52710312", new Object[]{this});
        } else {
            cbu.d("Show-fetchVideoRedPackageError", v3i.f(jpu.a("utLogMap", JSON.toJSONString(kotlin.collections.a.j(jpu.a("appearNum", Integer.valueOf(this.f)), jpu.a("redpackagetype", "native"))))));
        }
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec08653", new Object[]{this});
        } else {
            cbu.d("Show-LearnPage", kotlin.collections.a.j(jpu.a("spm", "a21afv.28088452.growth.2"), jpu.a("x_source", this.n)));
        }
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2267088", new Object[]{this});
        } else {
            cbu.d("Show-videoTabNoLogin", kotlin.collections.a.j(jpu.a("spm", "a21afv.28088452.activity.40"), jpu.a("outSide", String.valueOf(this.t.G().r())), jpu.a("appearNum", String.valueOf(this.f)), jpu.a("redpackagetype", "native"), jpu.a("lastScene", this.n)));
        }
    }

    public final void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d2c3d6", new Object[]{this});
        } else {
            cbu.d("Show-SourcePop", kotlin.collections.a.j(jpu.a("spm", "a21afv.28088452.growth.3"), jpu.a("x_source", this.n)));
        }
    }

    public final void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b818d23", new Object[]{this});
        } else {
            cbu.d("startRequest", v3i.f(jpu.a("utLogMap", JSON.toJSONString(kotlin.collections.a.j(jpu.a("appearNum", Integer.valueOf(this.f)), jpu.a("redpackagetype", "native"), jpu.a("outSide", Boolean.valueOf(this.t.G().r())), jpu.a("lastScene", this.n))))));
        }
    }

    public final void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251f87b0", new Object[]{this});
        } else {
            cbu.d("Show-videoTab", v3i.f(jpu.a("utLogMap", JSON.toJSONString(kotlin.collections.a.j(jpu.a("appearNum", Integer.valueOf(this.f)), jpu.a("redpackagetype", "native"))))));
        }
    }

    public final void x0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270bb10b", new Object[]{this});
        } else if (!this.i) {
            this.i = true;
            V0();
            if (o0()) {
                U0();
                if (TextUtils.isEmpty(this.n)) {
                    str = this.l;
                } else {
                    str = this.n;
                }
                RedPackageRequestParams redPackageRequestParams = new RedPackageRequestParams();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "interactShareToken", (String) this.o.get("videoShareToken"));
                jSONObject.put((JSONObject) UserModel.AvatarIcon.LIGHT_TYPE_RED_POINT, this.m);
                jSONObject.put((JSONObject) "sceneSource", str);
                if (!this.o.isEmpty()) {
                    jSONObject.put((JSONObject) "extParams", JSON.toJSONString(this.o));
                }
                jSONObject.put((JSONObject) "outSide", (String) Boolean.valueOf(this.t.G().r()));
                jSONObject.put((JSONObject) "invokeApp", kis.TAO);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "entityId", "96352");
                String str2 = this.k;
                if (str2 != null) {
                    jSONObject2.put((JSONObject) "tabSource", str2);
                    jSONObject2.put((JSONObject) "params", JSON.toJSONString(jSONObject));
                    redPackageRequestParams.setData(jSONObject2);
                    MtopUtils.INSTANCE.e(redPackageRequestParams, new d());
                    return;
                }
                ckf.y(vaj.KEY_TAB_ID);
                throw null;
            }
            this.i = false;
            N0();
        }
    }

    public final void G0(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314c4484", new Object[]{this, str});
            return;
        }
        Pair a2 = jpu.a("spm", "a21afv.28088452.growth.1");
        Pair a3 = jpu.a("x_source", this.n);
        if (ckf.b(str, "0")) {
            str2 = "first";
        } else {
            str2 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND;
        }
        cbu.d("Show-LearnEntranceRedpackage", kotlin.collections.a.j(a2, a3, jpu.a("x_day", str2), jpu.a("x_task_status", "1")));
    }

    public final void I0(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742b9d77", new Object[]{this, str});
            return;
        }
        Pair a2 = jpu.a("spm", "a21afv.28088452.growth.1");
        Pair a3 = jpu.a("x_source", this.n);
        if (ckf.b(str, "0")) {
            str2 = "first";
        } else {
            str2 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND;
        }
        cbu.d("Show-LearnEntranceLayer", kotlin.collections.a.j(a2, a3, jpu.a("x_day", str2), jpu.a("x_task_status", "2")));
    }

    public final void K0(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873104bf", new Object[]{this, str});
            return;
        }
        Pair a2 = jpu.a("spm", "a21afv.28088452.growth.3");
        Pair a3 = jpu.a("x_source", this.n);
        if (ckf.b(str, "0")) {
            str2 = "first";
        } else {
            str2 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND;
        }
        cbu.d("Show-LearnMoneyPop", kotlin.collections.a.j(a2, a3, jpu.a("x_day", str2)));
    }

    public final void P0(boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4267dc30", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "Button-SourcePopYes";
        } else {
            str = "Button-SourcePopNo";
        }
        if (z) {
            str2 = "a21afv.28088452.growth.6";
        } else {
            str2 = "a21afv.28088452.growth.7";
        }
        cbu.b(str, kotlin.collections.a.j(jpu.a("spm", str2), jpu.a("x_source", this.n)));
    }

    public final void S0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb35b08f", new Object[]{this, new Boolean(z)});
            return;
        }
        cbu.d("Show-StartPop", kotlin.collections.a.j(jpu.a("spm", "a21afv.28088452.activity.40"), jpu.a("utLogMap", JSON.toJSONString(kotlin.collections.a.j(jpu.a("isAppear", Boolean.valueOf(this.g)), jpu.a("appearNum", Integer.valueOf(this.f)), jpu.a("redpackagetype", "native"), jpu.a("showCashPop", Boolean.valueOf(z)))))));
    }

    public final Map<String, Object> l0(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4b6ef88", new Object[]{this, map, map2});
        }
        Object j = mqu.Companion.j(map2, "currentStage.showAmount");
        if (j != null && kqu.m(map.get("rewardPopInfo"))) {
            Object obj = map.get("rewardPopInfo");
            if (obj != null) {
                Map d2 = kqu.d(obj);
                d2.put("tokenCount", j);
                d2.put("tokenCountStart", j);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
            }
        }
        Object obj2 = map.get(v4s.PARAM_UPLOAD_STAGE);
        Object obj3 = map2.get(v4s.PARAM_UPLOAD_STAGE);
        if ((obj2 instanceof List) && (obj3 instanceof List) && ((List) obj2).size() == 2) {
            List list = (List) obj3;
            if (list.size() == 2) {
                for (Object obj4 : (Iterable) obj2) {
                    i++;
                    if (i < 0) {
                        yz3.p();
                        throw null;
                    } else if (kqu.m(obj4) && (list.get(i) instanceof Map)) {
                        if (obj4 != null) {
                            Map d3 = kqu.d(obj4);
                            Object obj5 = list.get(i);
                            if (obj5 != null) {
                                Object obj6 = ((Map) obj5).get("finished");
                                if (obj6 != null) {
                                    d3.put("finished", obj6);
                                    Map map3 = (Map) obj4;
                                    Object obj7 = list.get(i);
                                    if (obj7 != null) {
                                        Object obj8 = ((Map) obj7).get("showAmount");
                                        if (obj8 != null) {
                                            map3.put("showAmount", obj8);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                        }
                    }
                }
            }
        }
        return map;
    }

    public final void B0(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0de772", new Object[]{this, str, obj});
            return;
        }
        Pair a2 = jpu.a("spm", "a21afv.28088452.growth.12");
        Pair a3 = jpu.a("x_source", this.n);
        String str3 = "0";
        if (ckf.b(str, str3)) {
            str2 = "first";
        } else {
            str2 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND;
        }
        Pair a4 = jpu.a("x_day", str2);
        Pair a5 = jpu.a(v4s.PARAM_UPLOAD_STAGE, str);
        Pair a6 = jpu.a("isOutSide", String.valueOf(this.t.G().r()));
        if (obj != null) {
            str3 = "1";
        }
        cbu.d("Show-LearnEntranceExposedBefore", kotlin.collections.a.j(a2, a3, a4, a5, a6, jpu.a("hasRewardPopInfo", str3), jpu.a("branch", "light")));
    }

    public final void F0(boolean z, String str) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb1ba5e", new Object[]{this, new Boolean(z), str});
            return;
        }
        if (z) {
            str2 = "Button-LearnEntranceLayerYes";
        } else {
            str2 = "Button-LearnEntranceLayerNo";
        }
        if (z) {
            str3 = "a21afv.28088452.growth.4";
        } else {
            str3 = "a21afv.28088452.growth.5";
        }
        Pair a2 = jpu.a("spm", str3);
        Pair a3 = jpu.a("x_source", this.n);
        if (ckf.b(str, "0")) {
            str4 = "first";
        } else {
            str4 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND;
        }
        cbu.b(str2, kotlin.collections.a.j(a2, a3, jpu.a("x_day", str4), jpu.a("x_task_status", "1")));
    }

    public final void H0(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9b85fd", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (z) {
            str2 = "Button-LearnEntranceLayerYes";
        } else {
            str2 = "Button-LearnEntranceLayerNo";
        }
        if (z) {
            str3 = "a21afv.28088452.growth.4";
        } else {
            str3 = "a21afv.28088452.growth.5";
        }
        Pair a2 = jpu.a("spm", str3);
        Pair a3 = jpu.a("x_source", this.n);
        if (ckf.b(str, "0")) {
            str4 = "first";
        } else {
            str4 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND;
        }
        cbu.b(str2, kotlin.collections.a.j(a2, a3, jpu.a("x_day", str4), jpu.a("x_task_status", "2")));
    }

    public final void J0(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4f802", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (z) {
            str2 = "Button-LearnMoneyPopYes";
        } else {
            str2 = "Button-LearnMoneyPopNo";
        }
        if (z) {
            str3 = "a21afv.28088452.growth.6";
        } else {
            str3 = "a21afv.28088452.growth.7";
        }
        Pair a2 = jpu.a("spm", str3);
        Pair a3 = jpu.a("x_source", this.n);
        if (ckf.b(str, "0")) {
            str4 = "first";
        } else {
            str4 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND;
        }
        cbu.b(str2, kotlin.collections.a.j(a2, a3, jpu.a("x_day", str4)));
    }

    public final void T0(boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832b5f0e", new Object[]{this, new Boolean(z), obj});
            return;
        }
        Pair a2 = jpu.a("isAppear", Boolean.valueOf(this.g));
        Pair a3 = jpu.a("appearNum", Integer.valueOf(this.f));
        Pair a4 = jpu.a("redpackagetype", "native");
        Pair a5 = jpu.a("showCashPop", Boolean.valueOf(z));
        Pair a6 = jpu.a("x_count", obj);
        Pair a7 = jpu.a("x_status", "no");
        String str = this.k;
        if (str != null) {
            cbu.d("Show-StartPopResult", kotlin.collections.a.j(jpu.a("spm", "a21afv.28088452.activity.41"), jpu.a("utLogMap", JSON.toJSONString(kotlin.collections.a.j(a2, a3, a4, a5, a6, a7, jpu.a("x_tab_source", str))))));
            return;
        }
        ckf.y(vaj.KEY_TAB_ID);
        throw null;
    }

    public final void O0(boolean z, boolean z2, Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac26a785", new Object[]{this, new Boolean(z), new Boolean(z2), obj});
            return;
        }
        Pair a2 = jpu.a("isAppear", Boolean.valueOf(this.g));
        Pair a3 = jpu.a("appearNum", Integer.valueOf(this.f));
        Pair a4 = jpu.a("redpackagetype", "native");
        Pair a5 = jpu.a("showCashPop", Boolean.valueOf(z2));
        Pair a6 = jpu.a("x_count", obj);
        String str3 = this.k;
        if (str3 != null) {
            String jSONString = JSON.toJSONString(kotlin.collections.a.j(a2, a3, a4, a5, a6, jpu.a("x_tab_source", str3)));
            if (z) {
                str = "Button-SourcePopYes";
            } else {
                str = "Button-SourcePopNo";
            }
            if (z) {
                str2 = "a21afv.28088452.growth.6";
            } else {
                str2 = "a21afv.28088452.growth.7";
            }
            cbu.b(str, kotlin.collections.a.j(jpu.a("spm", str2), jpu.a("utLogMap", jSONString)));
            return;
        }
        ckf.y(vaj.KEY_TAB_ID);
        throw null;
    }

    public final void R0(boolean z, boolean z2, Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e38011", new Object[]{this, new Boolean(z), new Boolean(z2), obj});
            return;
        }
        Pair a2 = jpu.a("isAppear", Boolean.valueOf(this.g));
        Pair a3 = jpu.a("appearNum", Integer.valueOf(this.f));
        Pair a4 = jpu.a("redpackagetype", "native");
        Pair a5 = jpu.a("showCashPop", Boolean.valueOf(z2));
        Pair a6 = jpu.a("x_count", obj);
        String str3 = this.k;
        if (str3 != null) {
            String jSONString = JSON.toJSONString(kotlin.collections.a.j(a2, a3, a4, a5, a6, jpu.a("x_tab_source", str3)));
            if (z) {
                str = "Button-StartPopOpen";
            } else {
                str = "Button-StartPopClose";
            }
            if (z) {
                str2 = "a21afv.28088452.activity.40";
            } else {
                str2 = "a21afv.28088452.activity.41";
            }
            cbu.b(str, kotlin.collections.a.j(jpu.a("spm", str2), jpu.a("utLogMap", jSONString)));
            return;
        }
        ckf.y(vaj.KEY_TAB_ID);
        throw null;
    }

    public final void E0(boolean z, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a871c", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        Pair a2 = jpu.a("utLogMap", JSON.toJSONString(kotlin.collections.a.j(jpu.a("appearNum", Integer.valueOf(this.f)), jpu.a("redpackagetype", "native"), jpu.a("isAppear", Boolean.valueOf(this.g)), jpu.a("showCashPop", Boolean.valueOf(z)), jpu.a("type", str), jpu.a("executeClient", str2))));
        Pair a3 = jpu.a("isAppear", String.valueOf(this.g));
        Pair a4 = jpu.a("isOutSide", String.valueOf(this.t.G().r()));
        if (!z || !ckf.b(str, "NW") || !ckf.b(str2, "web")) {
            str3 = "false";
        } else {
            str3 = "true";
        }
        cbu.d("Show-fetchVideoRedPackage", kotlin.collections.a.j(a2, a3, a4, jpu.a("isNW", str3)));
    }
}
