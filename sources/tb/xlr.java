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
import tb.cpr;
import tb.uqi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xlr extends cpr implements uqi.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = xlr.class.getSimpleName();
    public static final String UT_PAGE_NAME = "Page_TaobaoLiveWatch";
    public final String K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final String O;
    public String P;
    public String Q;
    public final awd R;
    public boolean S;

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
            ncc nccVar = xlr.this.t;
            if (nccVar != null) {
                return nccVar.getHeartParams();
            }
            return null;
        }
    }

    static {
        t2o.a(806356187);
        t2o.a(806356172);
    }

    public xlr(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, cpr.b bVar) {
        this(i, str, str2, str3, z, z2, z3, z4, z5, z6, z7, null, bVar);
    }

    public static /* synthetic */ Object ipc$super(xlr xlrVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/TBLiveQueueMessageProvider");
        }
    }

    public static /* synthetic */ String q0(xlr xlrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2a8f86", new Object[]{xlrVar});
        }
        return xlrVar.O;
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

    @Override // tb.uqi.c
    public void a(int i, uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4c2ff3", new Object[]{this, new Integer(i), uqiVar});
            return;
        }
        cpr.b bVar = this.k;
        if (bVar != null) {
            bVar.onMessageReceived(100000, 0);
        }
    }

    @Override // tb.uqi.c
    public void c(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c83d600", new Object[]{this, uqiVar});
        }
    }

    @Override // tb.uqi.c
    public void d(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd4a63f", new Object[]{this, uqiVar});
            return;
        }
        cpr.b bVar = this.k;
        if (bVar != null) {
            bVar.onMessageReceived(1005, 0);
        }
        if (this.u == LiveEmbedType.SHOP_CARD) {
            sjr.g().d("com.taobao.taolive.room.shop.card.subScribe");
        }
    }

    @Override // tb.uqi.c
    public void e(int i, uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d65bf4", new Object[]{this, new Integer(i), uqiVar});
        }
    }

    @Override // tb.cpr, tb.ccc
    public void handleMessage(Message message) {
        cpr.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        if (message.what == 1003 && (bVar = this.k) != null) {
            bVar.onMessageReceived(1027, null);
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
            this.w.o(this.f17221a, this.L, this.R);
        } else {
            this.w.o(this.f17221a, null, this.R);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements awd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            xlr.q0(xlr.this);
            if (i == -3006) {
                xlr xlrVar = xlr.this;
                if (xlrVar.l == null) {
                    xlrVar.l = new jyw(xlr.this);
                }
                xlr.this.l.obtainMessage(1003).sendToTarget();
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
                    xlr.this.w.m(tLiveMsg, 101, true);
                    igq.n().s("Page_TaobaoLiveWatch", "PM_onDispatch_GoodItem", igq.n().l(tLiveMsg));
                }
                xlr xlrVar = xlr.this;
                if (!xlrVar.E) {
                    xlrVar.w(tLiveMsg);
                    if (tLiveMsg.type == 10101 && qvs.e0()) {
                        xlr.this.w.m(tLiveMsg, 102, true);
                    }
                } else if (tLiveMsg.type == 10101 && qvs.e0()) {
                    xlr.this.w.m(tLiveMsg, 102, false);
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

    public xlr(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bwd bwdVar, cpr.b bVar) {
        super(i, str, str2, z, z2, z3, z4, bwdVar, bVar);
        this.M = false;
        this.N = false;
        this.O = "TBLiveMSG";
        this.R = new a();
        this.S = false;
        String K = hjr.K("cdnMsgEnable", "false");
        this.K = str;
        this.L = str3;
        this.M = z6;
        this.r = z7 && zqq.c(K);
        this.N = z5;
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

    @Override // tb.cpr
    public void H(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de90a98", new Object[]{this, tLiveMsg});
        } else if (!TextUtils.isEmpty(tLiveMsg.topic) && TextUtils.equals(tLiveMsg.topic, this.K)) {
            if (tLiveMsg.type == 10101 && qvs.e0()) {
                this.w.m(tLiveMsg, 103, true);
            }
            if (tLiveMsg.type == 10181) {
                tLiveMsg.type = 10101;
            }
            super.H(tLiveMsg);
        } else if (tLiveMsg.type == 10101 && qvs.e0()) {
            this.w.m(tLiveMsg, 103, false);
            Map<String, String> l = igq.n().l(tLiveMsg);
            l.put("status", "0");
            l.put("errorCode", "errorTopic:".concat(new String(tLiveMsg.data)));
            igq n = igq.n();
            n.o("PM_STEP_CHECK_TOPIC:" + JSON.toJSONString(l));
            igq.n().c("liveroomItemMsg", JSON.toJSONString(l), "PM_STEP_CHECK_TOPIC", "PM_STEP_CHECK_TOPIC");
        }
    }

    public void r0() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43432f03", new Object[]{this});
        } else if (!this.S) {
            this.C = false;
            String str2 = TAG;
            eir.a(str2, "Message: subscribe start mTopic = " + this.K);
            joc u = v2s.o().u();
            if (u != null) {
                str = u.getNick();
            } else {
                str = "";
            }
            this.w.setMsgFetchMode(this.f17221a, this.K, this.M ? 4 : 3);
            bwd bwdVar = this.w;
            boolean z2 = this.N;
            if (!qvs.M0()) {
                z = this.N;
            } else if (this.o || this.N) {
                z = true;
            }
            bwdVar.e(z2, z, new b());
            this.P = uqi.g();
            if (v2s.o().c() != null) {
                this.Q = v2s.o().c().b("taolive", "EnableUseNewQueueMessageServiceAB", "bucketID", "unKnow");
            }
            sqi.l().m(new uvq(this.K, this.f17221a, this.L, str, this.o, s0(this.t), this.P, this, this.w));
            p0("subscribeMonitor", this.K);
            if (this.A) {
                hnk.h().m(this.x, this.y, this.z, s0(this.t));
            }
            this.S = true;
        }
    }

    public final String s0(ncc nccVar) {
        String[] split;
        int i;
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
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("liveServerParams", (Object) fkx.d(heartParams.get("liveServerParams")));
                        String str3 = heartParams.get("pmContext");
                        if (!(str3 == null || (parseObject = JSON.parseObject(str3)) == null)) {
                            Iterator<Map.Entry<String, Object>> it = parseObject.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry<String, Object> next = it.next();
                                String key = next.getKey();
                                Object value = next.getValue();
                                if (value instanceof String) {
                                    jSONObject.put(key, (Object) ((String) value));
                                }
                                it = it;
                                str = str;
                            }
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("spm-url", (Object) heartParams.get("spm-url"));
                        jSONObject2.put("clickid", (Object) heartParams.get("clickid"));
                        jSONObject2.put("livesource", (Object) heartParams.get("livesource"));
                        jSONObject2.put("isAD", (Object) heartParams.get("isAD"));
                        jSONObject2.put("supplement_flow_tag", (Object) heartParams.get("supplement_flow_tag"));
                        jSONObject2.put("kandianid", (Object) heartParams.get("kandianid"));
                        jSONObject2.put("watchid", (Object) heartParams.get("watchid"));
                        jSONObject2.put(yj4.PARAM_PVID, (Object) heartParams.get(yj4.PARAM_PVID));
                        jSONObject2.put(yj4.PARAM_LIVE_AD_PARAMS, (Object) heartParams.get(yj4.PARAM_LIVE_AD_PARAMS));
                        jSONObject2.put("entry_source", (Object) heartParams.get("entry_source"));
                        jSONObject2.put(yj4.PARAM_PM_PARAMS, (Object) heartParams.get(yj4.PARAM_PM_PARAMS));
                        jSONObject2.put(str, (Object) heartParams.get(str));
                        try {
                            jSONObject2.put("pmSession", (Object) this.P);
                            if (TextUtils.isEmpty(heartParams.get("entryLiveSource"))) {
                                jSONObject2.put("entryLiveSource", (Object) heartParams.get("livesource"));
                            } else {
                                jSONObject2.put("entryLiveSource", (Object) heartParams.get("entryLiveSource"));
                            }
                            jSONObject2.put("product_type", (Object) heartParams.get("product_type"));
                            jSONObject2.put("entryLiveItemId", (Object) heartParams.get("entryLiveItemId"));
                            jSONObject2.put("liveItemId", (Object) heartParams.get("liveItemId"));
                            if (L()) {
                                jSONObject2.put("officialLiveId", (Object) heartParams.get("officialLiveId"));
                                jSONObject2.put("officialAccountId", (Object) heartParams.get("officialAccountId"));
                            }
                            if (hjr.f()) {
                                jSONObject2.put("clientABTest", (Object) this.Q);
                            }
                            String str4 = TAG;
                            TLog.logi(str4, "liveClientParams:" + jSONObject2.toJSONString());
                            jSONObject.put("liveClientParams", (Object) jSONObject2);
                            jSONObject.put(yj4.PARAM_IGNORE_PV, (Object) heartParams.get(yj4.PARAM_IGNORE_PV));
                            jSONObject.put("needEventWhenIgnorePv", (Object) "true");
                            if (heartParams.containsKey("trackInfo") && heartParams.get("trackInfo") != null) {
                                String decode = Uri.decode(heartParams.get("trackInfo"));
                                if (!TextUtils.isEmpty(decode) && (split = decode.split("&")) != null) {
                                    int length = split.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            break;
                                        }
                                        String str5 = split[i2];
                                        if (str5 != null) {
                                            str2 = str2;
                                            if (str5.startsWith(str2)) {
                                                String replace = str5.replace(str2, "");
                                                if (!TextUtils.isEmpty(replace)) {
                                                    JSONObject jSONObject3 = new JSONObject();
                                                    String[] split2 = replace.split("#");
                                                    int length2 = split2.length;
                                                    int i3 = 0;
                                                    while (i3 < length2) {
                                                        String[] split3 = split2[i3].split(Constants.WAVE_SEPARATOR);
                                                        if (split3 != null && split3.length >= 2) {
                                                            i = 1;
                                                            jSONObject3.put(split3[0], (Object) split3[1]);
                                                            i3 += i;
                                                        }
                                                        i = 1;
                                                        i3 += i;
                                                    }
                                                    jSONObject.put("liveAlgoParams", (Object) jSONObject3);
                                                }
                                            }
                                        } else {
                                            str2 = str2;
                                        }
                                        i2++;
                                    }
                                }
                            }
                            return jSONObject.toJSONString();
                        } catch (Exception unused) {
                            return null;
                        }
                    } catch (Exception unused2) {
                        return null;
                    }
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    @Override // tb.cpr
    public void z() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8f98", new Object[]{this});
            return;
        }
        super.z();
        if (this.S) {
            String str2 = TAG;
            eir.a(str2, "Message: unSubscribe start mTopic = " + this.K);
            joc u = v2s.o().u();
            if (u != null) {
                str = u.getNick();
            } else {
                str = "";
            }
            sqi.l().n(new hgv(this.K, this.f17221a, this.L, str, this.o, s0(this.t), this.P, this, this.w));
            p0("unsubscribeMonitor", this.K);
            if (this.A) {
                hnk.h().o();
            }
            this.S = false;
            if (d4s.e("enablePMIrregularTrack", true)) {
                HashMap hashMap = new HashMap();
                if (this.C) {
                    hashMap.put(to8.COMMENT, "confusion");
                } else {
                    hashMap.put(to8.COMMENT, "success");
                }
                v2s.o().E().trackCustom(yj4.STAIN_TRACK_PAGE, 2101, "Page_liveRoomStability_lpm_pmStability", "", "", hashMap);
            }
            this.C = false;
        }
        m0();
    }
}
