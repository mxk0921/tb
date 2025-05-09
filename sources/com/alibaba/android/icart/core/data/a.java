package com.alibaba.android.icart.core.data;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.cache.CacheManagerImpl;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.blq;
import tb.c9x;
import tb.cb4;
import tb.ct1;
import tb.eav;
import tb.et6;
import tb.f8e;
import tb.fdd;
import tb.fsb;
import tb.gb3;
import tb.hav;
import tb.hd3;
import tb.ic3;
import tb.imb;
import tb.jod;
import tb.kcu;
import tb.kmb;
import tb.lcu;
import tb.n8v;
import tb.na3;
import tb.o3o;
import tb.ob7;
import tb.op6;
import tb.p2i;
import tb.pav;
import tb.pxb;
import tb.q7v;
import tb.qa3;
import tb.ra3;
import tb.sb3;
import tb.sca;
import tb.t2o;
import tb.u55;
import tb.ub3;
import tb.umm;
import tb.ux;
import tb.v55;
import tb.va3;
import tb.vav;
import tb.vc3;
import tb.yap;
import tb.yr6;
import tb.z5o;
import tb.z9v;
import tb.zsj;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends zxb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_NAME = "cart_common";
    public static final va3 q = new va3();
    public final kmb g;
    public CartGlobal j;
    public final pxb<byte[]> o;
    public final yr6 p;
    public final Map<String, Boolean> i = new HashMap();
    public final p2i h = new p2i(this);
    public Map<String, List<IDMComponent>> k = new HashMap();
    public final List<zxb.a> l = new ArrayList();
    public final List<ux> m = new ArrayList();
    public final DataBizContext n = new DataBizContext();

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.icart.core.data.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0066a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public StreamRemoteMainResponse b;
        public final /* synthetic */ int c;
        public final /* synthetic */ ux d;
        public final /* synthetic */ RequestConfig e;
        public final /* synthetic */ blq f;
        public final /* synthetic */ int g;
        public final /* synthetic */ lcu h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0066a(ux uxVar, int i, ux uxVar2, RequestConfig requestConfig, blq blqVar, int i2, lcu lcuVar) {
            super(uxVar);
            this.c = i;
            this.d = uxVar2;
            this.e = requestConfig;
            this.f = blqVar;
            this.g = i2;
            this.h = lcuVar;
        }

        public static /* synthetic */ Object ipc$super(C0066a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -882511587) {
                super.j((JSONObject) objArr[0]);
                return null;
            } else if (hashCode == -636794163) {
                super.k((fsb) objArr[0]);
                return null;
            } else if (hashCode == 1660067414) {
                super.m(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2], (fsb) objArr[3], (Map) objArr[4]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/icart/core/data/DataManager$1");
            }
        }

        @Override // tb.o3o, tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            PageInfo pageInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            a.w0(a.this).c(this.e, mtopResponse);
            ob7.c(a.a0(a.this).j(), 2);
            a.y0(a.this, true);
            for (ux uxVar : a.z0(a.this)) {
                uxVar.a(i, mtopResponse, obj, z, map);
            }
            if (this.e.k() != null) {
                this.e.k().h();
            }
            ux uxVar2 = this.d;
            if (uxVar2 != null) {
                uxVar2.a(i, mtopResponse, obj, z, map);
            }
            this.f.a(1);
            if (this.e.q()) {
                if (this.e.l()) {
                    pageInfo = PageInfo.FIRST_PAGE;
                } else {
                    pageInfo = PageInfo.NEXT_PAGE;
                }
                a.A0(a.this, pageInfo, DataInfo.ERROR_DATA);
            } else if (this.e.r()) {
                a.B0(a.this);
            }
            umm.a(a.C0(a.this), mtopResponse);
            if (mtopResponse != null) {
                ic3.g(zsj.a(mtopResponse), this.e, mtopResponse.getRetCode(), mtopResponse.getRetMsg(), false);
            }
            a.a0(a.this).e().t().j1(false);
        }

        @Override // tb.o3o, tb.ux
        public boolean e(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
            }
            if (a.Z(a.this).getContext().isFinishing() || ((f8e) a.a0(a.this).T()).isDestroy() || this.c != a.l0(a.this).k() || a.l0(a.this).i() == a.l0(a.this).k()) {
                return true;
            }
            ux uxVar = this.d;
            if (uxVar == null || !uxVar.e(i, mtopResponse, obj)) {
                return false;
            }
            return true;
        }

        @Override // tb.o3o, tb.ux
        public void j(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb65f11d", new Object[]{this, jSONObject});
                return;
            }
            super.j(jSONObject);
            qa3.e(a.a0(a.this), jSONObject);
            sb3.k(a.t0(a.this), a.a0(a.this), this.e.l(), a.this.F(), jSONObject);
        }

        @Override // tb.o3o, tb.ux
        public void k(fsb fsbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da0b4acd", new Object[]{this, fsbVar});
                return;
            }
            super.k(fsbVar);
            ux uxVar = this.d;
            if (uxVar != null) {
                uxVar.k(fsbVar);
            }
        }

        @Override // tb.o3o, tb.ux
        public void l(fsb fsbVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64a3aac8", new Object[]{this, fsbVar, streamRemoteMainResponse, list});
            } else {
                this.b = streamRemoteMainResponse;
            }
        }

        @Override // tb.o3o, tb.ux
        public void m(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62f29e56", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            super.m(i, mtopResponse, obj, fsbVar, map);
            a.w0(a.this).d(this.e, mtopResponse, fsbVar);
            if (!this.e.m() && vav.a(c9x.CART_BIZ_NAME, "preRenderDXWhenRequestSuccess", true)) {
                ra3.c(a.a0(a.this), fsbVar.getComponents(), "realtime");
            }
            ux uxVar = this.d;
            if (uxVar != null) {
                uxVar.m(i, mtopResponse, obj, fsbVar, map);
            }
        }

        @Override // tb.o3o, tb.ux
        public boolean n(String str, List<AttachedResponse> list) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a91f55b", new Object[]{this, str, list})).booleanValue();
            }
            if ((a.r0(a.this).getContext() != null && a.s0(a.this).getContext().isFinishing()) || list == null || list.isEmpty()) {
                return false;
            }
            String reqId = list.get(0).getReqId();
            if (reqId == null || !reqId.equals(str)) {
                if (z5o.a(reqId, a.l0(a.this).g()) < 0 || z5o.a(reqId, a.l0(a.this).r()) < 0) {
                    z = false;
                }
                UnifyLog.d("DataManager", "attachedRequestId=" + reqId + ",mFirstPageRequestId=" + a.l0(a.this).g() + ",currentRequestId=" + str + ",mUpdateRequestId=" + a.l0(a.this).r() + ",verify=" + z);
                return z;
            }
            UnifyLog.d("DataManager", "requestId=" + str + ",attachedRequestId=" + reqId);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x030e  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0367  */
        @Override // tb.o3o, tb.ojd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(int r19, mtopsdk.mtop.domain.MtopResponse r20, java.lang.Object r21, tb.fsb r22, java.util.Map<java.lang.String, ?> r23) {
            /*
                Method dump skipped, instructions count: 943
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.icart.core.data.a.C0066a.b(int, mtopsdk.mtop.domain.MtopResponse, java.lang.Object, tb.fsb, java.util.Map):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f2190a;

        public b(byte[] bArr) {
            this.f2190a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                a.u0(a.this).a(this.f2190a);
                gb3.b(a.v0(a.this), a.x0(a.this));
            } catch (Exception e) {
                ub3.g("缓存首屏数据报错", e.getMessage());
            }
        }
    }

    static {
        t2o.a(479199270);
    }

    public a(kmb kmbVar) {
        super(kmbVar);
        this.g = kmbVar;
        op6 andRemoveDataCache = CartFirstPageCache.getAndRemoveDataCache();
        if (andRemoveDataCache == null) {
            this.o = new op6(this.f17296a);
        } else {
            this.o = andRemoveDataCache;
        }
        this.p = new yr6(this);
        q7v.c(q);
    }

    public static /* synthetic */ void A0(a aVar, PageInfo pageInfo, DataInfo dataInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d64606", new Object[]{aVar, pageInfo, dataInfo});
        } else {
            aVar.M0(pageInfo, dataInfo);
        }
    }

    public static /* synthetic */ void B0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624826bc", new Object[]{aVar});
        } else {
            aVar.L0();
        }
    }

    public static /* synthetic */ Context C0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("72e7793", new Object[]{aVar});
        }
        return aVar.f17296a;
    }

    public static /* synthetic */ CartGlobal D0(a aVar, CartGlobal cartGlobal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("20b9b2de", new Object[]{aVar, cartGlobal});
        }
        aVar.j = cartGlobal;
        return cartGlobal;
    }

    public static /* synthetic */ fdd Z(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdd) ipChange.ipc$dispatch("8e249a29", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ kmb a0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5545e34b", new Object[]{aVar});
        }
        return aVar.g;
    }

    public static /* synthetic */ void b0(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6509201c", new Object[]{aVar, jSONObject});
        } else {
            aVar.O0(jSONObject);
        }
    }

    public static /* synthetic */ void c0(a aVar, RequestConfig.RequestType requestType, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaafe953", new Object[]{aVar, requestType, jSONObject});
        } else {
            aVar.E0(requestType, jSONObject);
        }
    }

    public static /* synthetic */ Context d0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5245840a", new Object[]{aVar});
        }
        return aVar.f17296a;
    }

    public static /* synthetic */ Context e0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3038e9e9", new Object[]{aVar});
        }
        return aVar.f17296a;
    }

    public static /* synthetic */ void f0(a aVar, RequestConfig requestConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c46284", new Object[]{aVar, requestConfig, new Integer(i)});
        } else {
            aVar.N0(requestConfig, i);
        }
    }

    public static /* synthetic */ Context g0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ec1fb5a7", new Object[]{aVar});
        }
        return aVar.f17296a;
    }

    public static /* synthetic */ void h0(a aVar, fsb fsbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce8a952", new Object[]{aVar, fsbVar, str});
        } else {
            aVar.P0(fsbVar, str);
        }
    }

    public static /* synthetic */ boolean i0(a aVar, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c2848d", new Object[]{aVar, u55Var})).booleanValue();
        }
        return aVar.G0(u55Var);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/DataManager");
    }

    public static /* synthetic */ kcu j0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcu) ipChange.ipc$dispatch("bbb12094", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ kcu k0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcu) ipChange.ipc$dispatch("fc2c3633", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ DataBizContext l0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataBizContext) ipChange.ipc$dispatch("c66cdf62", new Object[]{aVar});
        }
        return aVar.n;
    }

    public static /* synthetic */ kcu m0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcu) ipChange.ipc$dispatch("86c011dd", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ kcu n0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcu) ipChange.ipc$dispatch("c73b277c", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ void o0(a aVar, fsb fsbVar, boolean z, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ca7a6e", new Object[]{aVar, fsbVar, new Boolean(z), bArr});
        } else {
            aVar.F0(fsbVar, z, bArr);
        }
    }

    public static /* synthetic */ void p0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815f16f2", new Object[]{aVar});
        } else {
            aVar.K0();
        }
    }

    public static /* synthetic */ PageInfo q0(a aVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("31515048", new Object[]{aVar, requestConfig});
        }
        return aVar.I0(requestConfig);
    }

    public static /* synthetic */ fdd r0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdd) ipChange.ipc$dispatch("ccc54876", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ fdd s0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdd) ipChange.ipc$dispatch("d405e15", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ fsb t0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("bba43262", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ pxb u0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pxb) ipChange.ipc$dispatch("8bb949a0", new Object[]{aVar});
        }
        return aVar.o;
    }

    public static /* synthetic */ kcu v0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcu) ipChange.ipc$dispatch("cb13d474", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ yr6 w0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr6) ipChange.ipc$dispatch("cc67451f", new Object[]{aVar});
        }
        return aVar.p;
    }

    public static /* synthetic */ Context x0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5751644e", new Object[]{aVar});
        }
        return aVar.f17296a;
    }

    public static /* synthetic */ void y0(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76014895", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.J0(z);
        }
    }

    public static /* synthetic */ List z0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8cf47589", new Object[]{aVar});
        }
        return aVar.m;
    }

    @Override // tb.zxb
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b04cb2e7", new Object[]{this});
        }
        return this.n.e();
    }

    @Override // tb.zxb
    public DataBizContext B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataBizContext) ipChange.ipc$dispatch("789d64a0", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.zxb
    public boolean C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62882bc2", new Object[]{this, str})).booleanValue();
        }
        if (((HashMap) this.i).get(str) == null) {
            return false;
        }
        return ((Boolean) ((HashMap) this.i).get(str)).booleanValue();
    }

    @Override // tb.zxb
    public List<IDMComponent> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3d3038b4", new Object[]{this});
        }
        imb h0 = this.g.e().h0();
        if (h0 != null) {
            return h0.getComponents();
        }
        return null;
    }

    @Override // tb.zxb
    public et6 E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("7fdf86f9", new Object[]{this});
        }
        return this.n.l();
    }

    public final void E0(RequestConfig.RequestType requestType, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64861ec5", new Object[]{this, requestType, jSONObject});
        } else if (RequestConfig.RequestType.LOAD_CACHE_DATA == requestType && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("performanceStage")) != null && (jSONObject3 = jSONObject2.getJSONObject("commonArgs")) != null) {
            for (String str : jSONObject3.keySet()) {
                z9v.u(this.f17296a).e(str, String.valueOf(jSONObject3.get(str)));
            }
        }
    }

    @Override // tb.zxb
    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c53285d", new Object[]{this})).booleanValue();
        }
        return ((op6) this.o).d();
    }

    public final void F0(fsb fsbVar, boolean z, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9cccc0", new Object[]{this, fsbVar, new Boolean(z), bArr});
        } else if (fsbVar != null && !fsbVar.d() && this.g.b0() && z && bArr != null) {
            pav.k(new b(bArr));
        }
    }

    @Override // tb.zxb
    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e35ca1a", new Object[]{this})).booleanValue();
        }
        if (c() == null || c().getRootComponent() == null) {
            return true;
        }
        String key = c().getRootComponent().getKey();
        if (((HashMap) this.i).get(key) != null) {
            return ((Boolean) ((HashMap) this.i).get(key)).booleanValue();
        }
        return true;
    }

    public final boolean G0(u55 u55Var) {
        JSONObject g;
        JSONObject jSONObject;
        ViewManager Z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef1621e", new Object[]{this, u55Var})).booleanValue();
        }
        v55 v = u55Var.v();
        if (v == null || (g = v.g()) == null || (jSONObject = g.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) == null || (Z = this.g.e()) == null || Z.t() == null) {
            return false;
        }
        return eav.b(jSONObject);
    }

    @Override // tb.zxb
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d294b83", new Object[]{this});
            return;
        }
        RequestConfig.RequestType m = this.n.m();
        if (m == RequestConfig.RequestType.QUERY_CART_PAGE || m == RequestConfig.RequestType.QUERY_CART_NEXT_PAGE) {
            DataBizContext dataBizContext = this.n;
            dataBizContext.K(dataBizContext.k());
        }
    }

    public final IDMComponent H0(String str, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("638035ea", new Object[]{this, str, u55Var});
        }
        List<IDMComponent> n = u55Var.n();
        if (n == null) {
            return null;
        }
        for (IDMComponent iDMComponent : n) {
            if (str.equals(iDMComponent.getTag())) {
                return iDMComponent;
            }
        }
        return null;
    }

    @Override // tb.zxb
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("190dc33d", new Object[]{this})).booleanValue();
        }
        if (this.g.W().u() || !this.g.W().w()) {
            return true;
        }
        return false;
    }

    public final PageInfo I0(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("700c14bc", new Object[]{this, requestConfig});
        }
        if (requestConfig.o() || requestConfig.l()) {
            return PageInfo.FIRST_PAGE;
        }
        if (!G()) {
            return PageInfo.LAST_PAGE;
        }
        return PageInfo.NEXT_PAGE;
    }

    @Override // tb.zxb
    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b023b2", new Object[]{this})).booleanValue();
        }
        return TextUtils.isEmpty(this.n.b());
    }

    public final void J0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca503c15", new Object[]{this, new Boolean(z)});
            return;
        }
        IDMComponent u = u("submit");
        if (!(u == null || u.getFields().get(cb4.KEY_IS_CALCULATING_STATE) == null)) {
            cb4.c(this.c);
        }
        if (z) {
            this.g.e().E(4);
        }
    }

    @Override // tb.zxb
    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e42ab7", new Object[]{this})).booleanValue();
        }
        return this.h.b();
    }

    public final void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f9d95f", new Object[]{this});
        } else if (sca.w(this)) {
            cb4.c(this.c);
            cb4.W(this.c, this.g);
            this.g.e().E(4);
        }
    }

    @Override // tb.zxb
    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de7e5c4b", new Object[]{this})).booleanValue();
        }
        return this.n.y();
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1450d3", new Object[]{this});
            return;
        }
        List<ct1.a> a2 = a();
        if (a2 != null) {
            for (ct1.a aVar : a2) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public final void M0(PageInfo pageInfo, DataInfo dataInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce80efc", new Object[]{this, pageInfo, dataInfo});
            return;
        }
        List<ct1.b> b2 = b();
        if (b2 != null) {
            for (ct1.b bVar : b2) {
                if (bVar != null) {
                    bVar.a(pageInfo, dataInfo);
                }
            }
        }
    }

    @Override // tb.zxb
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.p.b();
        this.g.Y().a(5);
    }

    public final void N0(RequestConfig requestConfig, int i) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d450", new Object[]{this, requestConfig, new Integer(i)});
            return;
        }
        RequestConfig.RequestType i2 = requestConfig.i();
        if (!RequestConfig.RequestType.LOAD_CACHE_DATA.equals(i2) && !RequestConfig.RequestType.QUERY_CART_PAGE.equals(i2) && !RequestConfig.RequestType.QUERY_CART_NEXT_PAGE.equals(i2)) {
            int s = sca.s(this);
            Bundle bundle = new Bundle();
            String str2 = hd3.c;
            if (i == s) {
                z = false;
            }
            bundle.putBoolean(str2, z);
            bundle.putInt(hd3.d, s);
            bundle.putString(hd3.e, hd3.i);
            if (requestConfig.k() != null) {
                str = requestConfig.k().d();
            } else {
                str = null;
            }
            bundle.putBoolean(hd3.f, "cartSelect".equals(str));
            hd3.b(this.f17296a, bundle);
        }
    }

    @Override // tb.zxb
    public void O(ct1.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33989d70", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.f).remove(aVar);
        }
    }

    public final void O0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8f4a3d", new Object[]{this, jSONObject});
        } else {
            this.j = CartGlobal.parseCartGlobal(jSONObject);
        }
    }

    @Override // tb.zxb
    public void P(ct1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba2c230", new Object[]{this, bVar});
        } else {
            ((ArrayList) this.e).remove(bVar);
        }
    }

    public final void P0(fsb fsbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62117891", new Object[]{this, fsbVar, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.i).put(str, Boolean.valueOf(cb4.J((u55) fsbVar, str)));
        }
    }

    @Override // tb.zxb
    public void Q(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39db38d", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null) {
            u55 u55Var = (u55) this.c;
            u55Var.r().remove(iDMComponent.getKey());
            u55Var.p().remove(iDMComponent.getKey());
            if (!I()) {
                CheckHoldManager.i().p(iDMComponent.getFields());
            }
        }
    }

    @Override // tb.zxb
    public void R(ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5856b7d3", new Object[]{this, uxVar});
        } else if (((ArrayList) this.m).contains(uxVar)) {
            ((ArrayList) this.m).remove(uxVar);
        }
    }

    @Override // tb.zxb
    public void T(Map<String, List<IDMComponent>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62140301", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    @Override // tb.zxb
    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b76e293", new Object[]{this, str});
        } else {
            this.n.E(str);
        }
    }

    @Override // tb.zxb
    public void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51254073", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            DataBizContext dataBizContext = this.n;
            dataBizContext.D(dataBizContext.e());
            this.n.O(false);
        } else {
            this.n.D(str);
            this.n.O(true);
        }
    }

    @Override // tb.zxb
    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6ad47a", new Object[]{this, str});
            return;
        }
        String p = this.g.W().p(na3.sQueryParamsKeyDefaultFilterItem);
        if ((str == null || str.isEmpty()) && p != null) {
            str = p;
        }
        this.n.D(str);
        this.n.G(str);
    }

    @Override // tb.zxb
    public void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf7d394", new Object[]{this, new Boolean(z)});
        } else {
            this.h.c(z);
        }
    }

    @Override // tb.zxb
    public void Y(String str) {
        DataBizContext.CartGroupContext h;
        IDMComponent H0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963a4d85", new Object[]{this, str});
        } else if (str != null && str.startsWith(na3.sKeyEditGroupPopWindow) && (h = this.n.h()) != null && (H0 = H0(na3.sKeyTagGroupExtendBody, (u55) this.c)) != null) {
            JSONObject fields = H0.getFields();
            if (fields == null || fields.isEmpty()) {
                hav.a("DataManager", "groupExtendBody的fields为空");
                return;
            }
            JSONArray jSONArray = fields.getJSONArray("inGroups");
            if (jSONArray == null || jSONArray.isEmpty()) {
                hav.d("DataManager", "inGroups不存在");
                return;
            }
            List<String> originItems = h.getOriginItems();
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof String) && (originItems == null || !originItems.contains(next))) {
                    arrayList.add((String) next);
                }
            }
            h.setItemsInOtherGroup(arrayList);
        }
    }

    @Override // tb.ct1
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79882d3", new Object[]{this});
        }
    }

    @Override // tb.ct1
    public void j(IDMComponent iDMComponent, lcu lcuVar, boolean z, ux uxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26931385", new Object[]{this, iDMComponent, lcuVar, new Boolean(z), uxVar, obj});
        }
    }

    @Override // tb.ct1
    public void k(ct1.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe571a3", new Object[]{this, aVar});
        } else if (!((ArrayList) this.f).contains(aVar)) {
            ((ArrayList) this.f).add(aVar);
        }
    }

    @Override // tb.ct1
    public void l(ct1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89845e12", new Object[]{this, bVar});
        } else if (!((ArrayList) this.e).contains(bVar)) {
            ((ArrayList) this.e).add(bVar);
        }
    }

    @Override // tb.zxb
    public void o(zxb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c198d56", new Object[]{this, aVar});
        } else if (!((ArrayList) this.l).contains(aVar)) {
            ((ArrayList) this.l).add(aVar);
        }
    }

    @Override // tb.zxb
    public void p(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c12ef9", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (!I() && iDMComponent != null) {
            CheckHoldManager.i().d(iDMComponent.getFields(), z);
        }
    }

    @Override // tb.zxb
    public void q(ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a1cf16", new Object[]{this, uxVar});
        } else if (!((ArrayList) this.m).contains(uxVar)) {
            ((ArrayList) this.m).add(uxVar);
        }
    }

    @Override // tb.zxb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4ac28e", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            ((zxb.a) it.next()).a(K());
        }
        this.h.a();
        Iterator it2 = ((ArrayList) this.l).iterator();
        while (it2.hasNext()) {
            ((zxb.a) it2.next()).b(K());
        }
    }

    @Override // tb.zxb
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            Mtop.instance(Mtop.Id.INNER, this.f17296a).removeCacheBlock(new CacheManagerImpl(null).getBlockName(StringUtils.concatStr2LowerCase("mtop.trade.query.bag", AfcCustomSdk.SDK_VERSION)));
        }
    }

    @Override // tb.zxb
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fa2bee1", new Object[]{this})).booleanValue();
        }
        if (this.g.d().L()) {
            return C(this.n.c());
        }
        return G();
    }

    @Override // tb.zxb
    public IDMComponent u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("4a577834", new Object[]{this, str});
        }
        List<IDMComponent> list = this.k.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // tb.zxb
    public CartGlobal w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("9c6a8a40", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.zxb
    public kmb x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("6c84c8c2", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.zxb
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13b7ef6b", new Object[]{this});
        }
        return this.n.b();
    }

    @Override // tb.zxb
    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8f060ab", new Object[]{this});
        }
        return this.n.c();
    }

    @Override // tb.zxb
    public void S(RequestConfig requestConfig, ux uxVar) {
        int s;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f67e952", new Object[]{this, requestConfig, uxVar});
            return;
        }
        blq Y = this.g.Y();
        if (requestConfig != null) {
            if (requestConfig.m()) {
                s = this.n.k();
            } else {
                s = this.n.s();
            }
            this.n.T(requestConfig.i());
            if (requestConfig.n()) {
                Y.j(1, requestConfig.d());
            }
            lcu k = requestConfig.k();
            requestConfig.E(System.currentTimeMillis());
            C0066a aVar = new C0066a(uxVar, s, uxVar, requestConfig, Y, sca.s(this), k);
            RequestConfig.RequestType i = requestConfig.i();
            String c = ((vc3) this.g).c();
            StringBuilder sb = new StringBuilder("发起请求:");
            if (i == null) {
                str = "";
            } else {
                str = i.name();
            }
            sb.append(str);
            hav.d(c, sb.toString());
            jod a2 = yap.a(this, i);
            if (a2 != null) {
                this.p.a(requestConfig);
                String a3 = a2.a(requestConfig, aVar);
                if (requestConfig.l()) {
                    this.n.H(a3);
                } else if (requestConfig.r()) {
                    this.n.X(a3);
                }
            }
        }
    }

    @Override // tb.zxb
    public void v(n8v.c<byte[]> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea35ae", new Object[]{this, cVar});
        } else if (vav.a(c9x.CART_BIZ_NAME, "syncGetCacheData", true)) {
            byte[] j = ((op6) this.o).j();
            if (j != null) {
                cVar.onSuccess(j);
            } else {
                cVar.onFail("fail to get cache data");
            }
        } else {
            ((op6) this.o).c(vav.a(c9x.CART_BIZ_NAME, na3.sGetCacheDataOnSameThread, true), cVar);
        }
    }

    @Override // tb.zxb
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42456e5", new Object[]{this});
        } else if (sca.x(this)) {
            boolean P = cb4.P(u("submit"));
            if (J() && P) {
                this.n.L(true);
            } else if (!"repeatBuy".equals(y()) && !P) {
                this.n.L(false);
            }
        }
    }
}
