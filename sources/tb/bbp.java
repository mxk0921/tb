package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bbp extends iy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199336);
    }

    public bbp(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(bbp bbpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendUpdateRequest");
    }

    public static /* synthetic */ void k(bbp bbpVar, MtopResponse mtopResponse, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8dd93c", new Object[]{bbpVar, mtopResponse, map, new Boolean(z)});
        } else {
            bbpVar.s(mtopResponse, map, z);
        }
    }

    public static /* synthetic */ boolean l(bbp bbpVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da185682", new Object[]{bbpVar, map})).booleanValue();
        }
        return bbpVar.p(map);
    }

    public final b3o m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("9e58cf3", new Object[]{this});
        }
        return zs6.c(this.d);
    }

    public final HashMap<String, String> o(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d6848b9", new Object[]{this, requestConfig});
        }
        Map<String, String> c = requestConfig.c();
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject();
            if (c != null) {
                jSONObject.putAll(RequestConfig.a(c));
            }
            hashMap.put("exParams", jSONObject.toJSONString());
        } catch (Throwable th) {
            hav.b("SendUpdateRequest", "getOtherParamsException#", th.getMessage());
        }
        return hashMap;
    }

    public final boolean p(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cf56c3b", new Object[]{this, map})).booleanValue();
        }
        if (n(map) == 1) {
            return true;
        }
        return false;
    }

    public final void r(Map<String, String> map, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded5b64c", new Object[]{this, map, requestConfig});
            return;
        }
        lcu k = requestConfig.k();
        JSONObject c = c(map);
        i(c, requestConfig);
        if (cb4.u(this.f21638a.c()) > sca.k(this.f21638a)) {
            c.put("exceedCheckNum", (Object) Boolean.TRUE.toString());
        } else {
            c.put("exceedCheckNum", (Object) Boolean.FALSE.toString());
        }
        if (k.e(rd3.KEY_INSTALLMENT_TRANS_IN_EVENT) != null) {
            c.putAll((JSONObject) k.e(rd3.KEY_INSTALLMENT_TRANS_IN_EVENT));
        }
        if (k.e("isCheckInPoplayer") != null) {
            c.put("isCheckInPoplayer", k.e("isCheckInPoplayer"));
        } else {
            c.remove("isCheckInPoplayer");
        }
        if (k.e("skuExtParams") instanceof Map) {
            c.putAll((Map) k.e("skuExtParams"));
        }
        if (this.f21638a.x().d().L()) {
            c.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        }
        int e = CheckHoldManager.i().e();
        if ("cartSelect".equals(requestConfig.k().d()) && e > sca.k(this.f21638a) && sca.E(this.f21638a) && sca.z(this.f21638a)) {
            c.put("overMaxCheckCount", "true");
        }
        map.put("exParams", c.toJSONString());
    }

    public final void s(MtopResponse mtopResponse, Map<String, ?> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e883780", new Object[]{this, mtopResponse, map, new Boolean(z)});
            return;
        }
        int n = n(map);
        HashMap hashMap = new HashMap();
        hashMap.put("isStream", String.valueOf(q(mtopResponse.getHeaderFields())));
        hashMap.put(z2k.d.ATTACHED_RESPONSE_HEADER_REQ_NUM, String.valueOf(n));
        hashMap.put(jwi.MATCH_IGNORE, String.valueOf(z));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.d.W().o(), 19999, "Page_ShoppingCart_IgnoreCheck", "mtop.trade.update.bag", null, hashMap).build());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ux b;
        public final /* synthetic */ String c;
        public final /* synthetic */ RequestConfig d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ux uxVar, ux uxVar2, String str, RequestConfig requestConfig) {
            super(uxVar);
            this.b = uxVar2;
            this.c = str;
            this.d = requestConfig;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendUpdateRequest$1");
        }

        @Override // tb.o3o, tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            } else if (bbp.l(bbp.this, map)) {
                ux uxVar = this.b;
                if (uxVar != null) {
                    uxVar.a(i, mtopResponse, obj, z, map);
                }
                if (mtopResponse != null) {
                    fdv.b("SendUpdateRequest", fdv.F_NETWORK_REQUEST, mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "");
                    UnifyLog.m(((vc3) bbp.this.f21638a.x()).c(), "SendUpdateRequest", "sendRespondRequest", "error");
                    if (!zsj.b(mtopResponse) || !"cartSelect".equals(this.c)) {
                        be3.c(bbp.this.b, mtopResponse.getRetMsg());
                    }
                }
            }
        }

        @Override // tb.o3o, tb.ux
        public void i(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c18694c3", new Object[]{this, new Integer(i), mtopResponse, obj, map});
            } else {
                bbp.k(bbp.this, mtopResponse, map, true);
            }
        }

        @Override // tb.o3o, tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            bbp.k(bbp.this, mtopResponse, map, false);
            if (vav.a(c9x.CART_BIZ_NAME, "enableNewUltronProtocolRefreshRules", true)) {
                if (!o(map.get(opq.STREAM_RESPONSE_ULTRON_PROTOCOL))) {
                    return;
                }
            } else if (!bbp.l(bbp.this, map)) {
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.b(i, mtopResponse, obj, fsbVar, map);
            }
            if (bbp.this.f() && !fsbVar.d()) {
                bbp.this.d.e0(false);
            }
            if (bbp.this.f21638a.K()) {
                bbp.this.f21638a.X(true);
            }
            bbp.this.b(this.c);
            bbp.this.h(this.d);
        }

        public final boolean o(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f7997748", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof JSONObject)) {
                ub3.g("shouldCallbackMtopResponseError", "protocol is not JSONObject");
                return false;
            }
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                return jSONObject3 != null && !jSONObject3.isEmpty();
            }
            return true;
        }
    }

    @Override // tb.jod
    public String a(RequestConfig requestConfig, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("523b998e", new Object[]{this, requestConfig, uxVar});
        }
        uf0 uf0Var = new uf0(this.f21638a, this.b, m());
        j(requestConfig);
        lcu k = requestConfig.k();
        IDMComponent b = requestConfig.b();
        fsb c = this.f21638a.c();
        if (k == null) {
            return null;
        }
        if (this.f21638a.B().A() && cb4.C(c) == this.f21638a.B().d()) {
            this.f21638a.B().F(null);
            ob7.c(c, 1);
        }
        String d = k.d();
        if (b != null) {
            ((DMComponent) b).setTriggerEvent(k.g() + "." + d);
        }
        u55 u55Var = (u55) c;
        JSONObject M = u55Var.M();
        ArrayList<String> f = bd4.f((List) k.e("operateItems"), u55Var, cb4.v(this.f21638a.c()));
        r(uf0Var.c().i(), requestConfig);
        this.c.g(f);
        uf0Var.l(b);
        uf0Var.a(o(requestConfig));
        c.g(this.c);
        g(d);
        uf0Var.h(new a(uxVar, uxVar, d, requestConfig), c, requestConfig.g());
        ((u55) c).E0(M);
        return uf0Var.f();
    }

    public final int n(Map<String, ?> map) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71763fda", new Object[]{this, map})).intValue();
        }
        if (map == null || !map.containsKey(opq.STREAM_RESPONSE_NUM) || (num = (Integer) map.get(opq.STREAM_RESPONSE_NUM)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean q(Map<String, List<String>> map) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7be3ee98", new Object[]{this, map})).booleanValue();
        }
        return map != null && (list = map.get("x-used-stream")) != null && !list.isEmpty() && "1".equals(list.get(0));
    }
}
