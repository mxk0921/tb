package tb;

import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class flr extends cpr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_TaobaoLiveWatch";
    public static final String V = flr.class.getSimpleName();
    public static final HashMap<String, String> W = new HashMap<>();
    public final String K;
    public final String L;
    public int M;
    public int N;
    public final boolean O;
    public final boolean P;
    public final String Q;
    public String R;
    public String S;
    public final awd T;
    public boolean U;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            flr.q0(flr.this);
            flr flrVar = flr.this;
            if (flrVar.l == null) {
                flrVar.l = new jyw(flr.this);
            }
            Message obtainMessage = flr.this.l.obtainMessage(1001);
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements ncc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ncc
        public Map<String, String> getHeartParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
            }
            ncc nccVar = flr.this.t;
            if (nccVar != null) {
                return nccVar.getHeartParams();
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            flr flrVar = flr.this;
            if (flrVar.l == null) {
                flrVar.l = new jyw(flr.this);
            }
            Message obtainMessage = flr.this.l.obtainMessage(1002);
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
        }
    }

    static {
        t2o.a(806356182);
        t2o.a(806356160);
        t2o.a(806356162);
    }

    public flr(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, cpr.b bVar) {
        this(i, str, str2, str3, z, z2, z3, z4, z5, z6, z7, null, bVar);
    }

    public static /* synthetic */ Object ipc$super(flr flrVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.i0();
                return null;
            case -1645671784:
                super.H((TLiveMsg) objArr[0]);
                return null;
            case 44570194:
                super.y();
                return null;
            case 225283992:
                super.z();
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            case 1713617801:
                super.l0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/TBLiveMessageProvider");
        }
    }

    public static /* synthetic */ String q0(flr flrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb597d29", new Object[]{flrVar});
        }
        return flrVar.Q;
    }

    @Override // tb.cpr
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.w.onPause();
        }
    }

    @Override // tb.cpr
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.w.onResume();
        }
    }

    @Override // tb.cpr, tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        switch (message.what) {
            case 1001:
                t0(message.arg1);
                break;
            case 1002:
                u0(message.arg1);
                break;
            case 1003:
                cpr.b bVar = this.k;
                if (bVar != null) {
                    bVar.onMessageReceived(1027, null);
                    break;
                }
                break;
        }
        super.handleMessage(message);
    }

    @Override // tb.cpr
    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.i0();
        if (!TextUtils.isEmpty(this.L)) {
            this.w.o(this.f17221a, this.L, this.T);
        } else {
            this.w.o(this.f17221a, null, this.T);
        }
    }

    @Override // tb.cpr
    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        super.l0();
        if (!TextUtils.isEmpty(this.L)) {
            if (qvs.T0()) {
                this.w.o(this.f17221a, this.L, null);
            }
        } else if (qvs.T0()) {
            this.w.o(this.f17221a, null, null);
        }
    }

    public final String s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2e619cd", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.L)) {
            return this.K;
        }
        return this.K + "_" + this.L;
    }

    public final void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93670daf", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
            w0();
            v2s.o().e().commitSuccess("taolive", "PM_subscribe");
        } else {
            v0(i);
            vgb e = v2s.o().e();
            e.commitFail("taolive", "PM_subscribe", "PM_subscribe_error", "result:" + i);
        }
    }

    public final void u0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e57470", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
            y0();
        } else {
            x0(i);
        }
    }

    @Override // tb.cpr
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81652", new Object[]{this});
            return;
        }
        super.y();
        if (qvs.X() || this.u != LiveEmbedType.SHOP_CARD || this.v) {
            r0();
        }
        j0();
    }

    public void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5608fd2", new Object[]{this});
            return;
        }
        Map<String, String> m = igq.n().m();
        m.put("status", "1");
        if (this.N == 0) {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endUnSubscribe", m);
        } else {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endUnSubscribeRetry", m);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements awd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.awd
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
                return;
            }
            if (v2s.o().e() != null) {
                v2s.o().e().commitFail("taolive", "PMDispatcher", String.valueOf(i), String.valueOf(i));
            }
            flr.q0(flr.this);
            if (i == -3006) {
                flr flrVar = flr.this;
                if (flrVar.l == null) {
                    flrVar.l = new jyw(flr.this);
                }
                flr.this.l.obtainMessage(1003).sendToTarget();
            }
        }

        @Override // tb.awd
        public void b(TLiveMsg tLiveMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d56b849", new Object[]{this, tLiveMsg});
                return;
            }
            if (v2s.o().e() != null) {
                v2s.o().e().commitSuccess("taolive", "PMDispatcher", String.valueOf(tLiveMsg.type));
            }
            if (tLiveMsg != null) {
                if (tLiveMsg.type == 10101 && qvs.e0()) {
                    flr.this.w.m(tLiveMsg, 101, true);
                    igq.n().s("Page_TaobaoLiveWatch", "PM_onDispatch_GoodItem", igq.n().l(tLiveMsg));
                }
                flr flrVar = flr.this;
                if (!flrVar.E) {
                    flrVar.w(tLiveMsg);
                    if (tLiveMsg.type == 10101 && qvs.e0()) {
                        flr.this.w.m(tLiveMsg, 102, true);
                    }
                } else if (tLiveMsg.type == 10101 && qvs.e0()) {
                    flr.this.w.m(tLiveMsg, 102, false);
                    Map<String, String> l = igq.n().l(tLiveMsg);
                    l.put("status", "0");
                    l.put("errorCode", "HoldMsg:".concat(new String(tLiveMsg.data)));
                    igq n = igq.n();
                    n.o("PM_STEP_HOLD_RETURN:" + JSON.toJSONString(l));
                    igq.n().c("liveroomItemMsg", JSON.toJSONString(l), "PM_STEP_HOLD_RETURN", "PM_STEP_HOLD_RETURN");
                }
            }
        }
    }

    public flr(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bwd bwdVar, cpr.b bVar) {
        super(i, str, str2, z, z2, z3, z4, bwdVar, bVar);
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.P = false;
        this.Q = "TBLiveMSG";
        this.T = new d();
        this.U = false;
        String K = hjr.K("cdnMsgEnable", "false");
        this.K = str;
        this.L = str3;
        this.O = z6;
        this.r = z7 && zqq.c(K);
        this.P = z5;
        String r0 = qvs.r0();
        if (!TextUtils.isEmpty(r0)) {
            if (this.D == null) {
                this.D = new ArrayList();
            }
            for (String str4 : r0.split(",")) {
                ((ArrayList) this.D).add(str4);
            }
        }
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e22911", new Object[]{this});
            return;
        }
        cpr.b bVar = this.k;
        if (bVar != null) {
            bVar.onMessageReceived(1005, 0);
        }
        Map<String, String> m = igq.n().m();
        m.put("status", "1");
        if (qvs.X() && this.u == LiveEmbedType.SHOP_CARD) {
            sjr.g().d("com.taobao.taolive.room.shop.card.subScribe");
        }
        if (this.M == 0) {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endSubscribe", m);
        } else {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endSubscribeRetry", m);
        }
    }

    @Override // tb.cpr
    public void z() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8f98", new Object[]{this});
            return;
        }
        super.z();
        if (this.U) {
            HashMap<String, String> hashMap = W;
            if (toString().equals(hashMap.get(s0()))) {
                hashMap.remove(s0());
                joc u = v2s.o().u();
                if (u != null) {
                    str = u.getNick();
                } else {
                    str = "";
                }
                c cVar = new c();
                bwd bwdVar = this.w;
                int i = this.f17221a;
                String str3 = this.K;
                String str4 = this.L;
                if (this.o) {
                    str2 = "33";
                } else {
                    str2 = "tb";
                }
                bwdVar.k(i, str3, str4, str, str2, qvs.Q() ? z0(this.t) : null, cVar, new Object[0]);
                p0("unsubscribeMonitor", this.K);
                if (this.M == 0) {
                    igq.n().s("Page_TaobaoLiveWatch", "PM_startUnSubscribe", igq.n().m());
                }
                if (this.A) {
                    hnk.h().o();
                }
                this.U = false;
            } else {
                return;
            }
        }
        m0();
    }

    @Override // tb.cpr
    public void H(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de90a98", new Object[]{this, tLiveMsg});
        } else if (TextUtils.isEmpty(tLiveMsg.topic) || !TextUtils.equals(tLiveMsg.topic, this.K)) {
            if (!TextUtils.equals(tLiveMsg.topic, this.K)) {
                this.w.h(this.f17221a, tLiveMsg, 502);
                o0(tLiveMsg);
            }
            if (tLiveMsg.type == 10101 && qvs.e0()) {
                this.w.m(tLiveMsg, 103, false);
                Map<String, String> l = igq.n().l(tLiveMsg);
                l.put("status", "0");
                l.put("errorCode", "errorTopic:".concat(new String(tLiveMsg.data)));
                igq n = igq.n();
                n.o("PM_STEP_CHECK_TOPIC:" + JSON.toJSONString(l));
                igq.n().c("liveroomItemMsg", JSON.toJSONString(l), "PM_STEP_CHECK_TOPIC", "PM_STEP_CHECK_TOPIC");
            }
        } else {
            if (tLiveMsg.type == 10101 && qvs.e0()) {
                this.w.m(tLiveMsg, 103, true);
            }
            if (tLiveMsg.type == 10181) {
                tLiveMsg.type = 10101;
            }
            super.H(tLiveMsg);
        }
    }

    public void r0() {
        String str;
        boolean z;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43432f03", new Object[]{this});
        } else if (!this.U) {
            this.R = UUID.randomUUID().toString();
            if (v2s.o().c() != null) {
                this.S = v2s.o().c().b("taolive", "EnableUseNewQueueMessageServiceAB", "bucketID", "unKnow");
            }
            joc u = v2s.o().u();
            if (u != null) {
                str = u.getNick();
            } else {
                str = "";
            }
            this.w.setMsgFetchMode(this.f17221a, this.K, this.O ? 4 : 3);
            a aVar = new a();
            bwd bwdVar = this.w;
            boolean z2 = this.P;
            if (qvs.M0()) {
                z = this.o || this.P;
            } else {
                z = this.P;
            }
            bwdVar.e(z2, z, new b());
            bwd bwdVar2 = this.w;
            int i = this.f17221a;
            String str3 = this.K;
            String str4 = this.L;
            if (this.o) {
                str2 = "33";
            } else {
                str2 = "tb";
            }
            bwdVar2.q(i, str3, str4, str, str2, qvs.Q() ? z0(this.t) : null, aVar, new Object[0]);
            if (this.M == 0) {
                igq.n().s("Page_TaobaoLiveWatch", "PM_startSubscribe", igq.n().m());
            }
            p0("subscribeMonitor", this.K);
            W.put(s0(), toString());
            if (this.A) {
                hnk.h().m(this.x, this.y, this.z, z0(this.t));
            }
            this.U = true;
        }
    }

    public void v0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f665ec5", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> m = igq.n().m();
        m.put("status", "0");
        m.put("errorCode", String.valueOf(i));
        if (this.M == 0) {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endSubscribe", m);
            igq n = igq.n();
            n.o("PM_endSubscribe:" + i);
        } else {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endSubscribeRetry", m);
            igq n2 = igq.n();
            n2.o("PM_endSubscribeRetry:" + i);
        }
        int i2 = this.M;
        if (i2 < 3) {
            this.M = i2 + 1;
            y();
            return;
        }
        cpr.b bVar = this.k;
        if (bVar != null) {
            bVar.onMessageReceived(100000, 0);
        }
        this.M = 0;
    }

    public void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32181c6", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> m = igq.n().m();
        m.put("status", "0");
        m.put("errorCode", String.valueOf(i));
        if (this.M == 0) {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endUnSubscribe", m);
            igq n = igq.n();
            n.o("PM_endUnSubscribe:" + i);
        } else {
            igq.n().s("Page_TaobaoLiveWatch", "PM_endUnSubscribeRetry", m);
            igq n2 = igq.n();
            n2.o("PM_endUnSubscribeRetry:" + i);
        }
        int i2 = this.N;
        if (i2 < 3) {
            this.N = i2 + 1;
            z();
            return;
        }
        this.N = 0;
    }

    public final String z0(ncc nccVar) {
        Exception e;
        JSONObject jSONObject;
        String[] split;
        JSONObject parseObject;
        String str = "liveToken";
        String str2 = "liveAlgoParams:";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b989888", new Object[]{this, nccVar});
        }
        if (nccVar != null) {
            try {
                Map<String, String> heartParams = this.t.getHeartParams();
                if (heartParams != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("liveServerParams", (Object) fkx.d(heartParams.get("liveServerParams")));
                        String str3 = heartParams.get("pmContext");
                        if (!(str3 == null || (parseObject = JSON.parseObject(str3)) == null)) {
                            Iterator<Map.Entry<String, Object>> it = parseObject.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry<String, Object> next = it.next();
                                String key = next.getKey();
                                Object value = next.getValue();
                                if (value instanceof String) {
                                    jSONObject2.put(key, (Object) ((String) value));
                                }
                                it = it;
                                str = str;
                            }
                        }
                        jSONObject = new JSONObject();
                        jSONObject.put("spm-url", (Object) heartParams.get("spm-url"));
                        jSONObject.put("clickid", (Object) heartParams.get("clickid"));
                        jSONObject.put("livesource", (Object) heartParams.get("livesource"));
                        jSONObject.put("isAD", (Object) heartParams.get("isAD"));
                        jSONObject.put("supplement_flow_tag", (Object) heartParams.get("supplement_flow_tag"));
                        jSONObject.put("kandianid", (Object) heartParams.get("kandianid"));
                        jSONObject.put("watchid", (Object) heartParams.get("watchid"));
                        jSONObject.put(yj4.PARAM_PVID, (Object) heartParams.get(yj4.PARAM_PVID));
                        jSONObject.put(yj4.PARAM_LIVE_AD_PARAMS, (Object) heartParams.get(yj4.PARAM_LIVE_AD_PARAMS));
                        jSONObject.put("entry_source", (Object) heartParams.get("entry_source"));
                        jSONObject.put(yj4.PARAM_PM_PARAMS, (Object) heartParams.get(yj4.PARAM_PM_PARAMS));
                        jSONObject.put(str, (Object) heartParams.get(str));
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        jSONObject.put("pmSession", (Object) this.R);
                        jSONObject.put("entryLiveSource", (Object) heartParams.get("entryLiveSource"));
                        jSONObject.put("product_type", (Object) heartParams.get("product_type"));
                        if (L()) {
                            jSONObject.put("officialLiveId", (Object) heartParams.get("officialLiveId"));
                            jSONObject.put("officialAccountId", (Object) heartParams.get("officialAccountId"));
                        }
                        if (hjr.f()) {
                            jSONObject.put("clientABTest", (Object) this.S);
                        }
                        TLog.logi(V, "liveClientParams:" + jSONObject.toJSONString());
                        jSONObject2.put("liveClientParams", (Object) jSONObject);
                        jSONObject2.put(yj4.PARAM_IGNORE_PV, (Object) heartParams.get(yj4.PARAM_IGNORE_PV));
                        jSONObject2.put("needEventWhenIgnorePv", (Object) "true");
                        if (heartParams.containsKey("trackInfo") && heartParams.get("trackInfo") != null) {
                            String decode = Uri.decode(heartParams.get("trackInfo"));
                            if (!TextUtils.isEmpty(decode) && (split = decode.split("&")) != null) {
                                int length = split.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    String str4 = split[i];
                                    if (str4 != null) {
                                        str2 = str2;
                                        if (str4.startsWith(str2)) {
                                            String replace = str4.replace(str2, "");
                                            if (!TextUtils.isEmpty(replace)) {
                                                JSONObject jSONObject3 = new JSONObject();
                                                String[] split2 = replace.split("#");
                                                for (String str5 : split2) {
                                                    String[] split3 = str5.split(Constants.WAVE_SEPARATOR);
                                                    if (split3 != null && split3.length >= 2) {
                                                        jSONObject3.put(split3[0], (Object) split3[1]);
                                                    }
                                                }
                                                jSONObject2.put("liveAlgoParams", (Object) jSONObject3);
                                            }
                                        }
                                    } else {
                                        str2 = str2;
                                    }
                                    i++;
                                }
                            }
                        }
                        return jSONObject2.toJSONString();
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        return null;
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
        return null;
    }
}
