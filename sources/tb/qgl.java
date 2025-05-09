package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "overseabuy.impl.response.monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qgl extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long j = 0;
    public static Handler k;
    public lo f;
    public String g = "";
    public JSONObject h;
    public AURAGlobalData i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26740a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* renamed from: tb.qgl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class C1039a extends pt {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f26741a;

            public C1039a(a aVar, JSONObject jSONObject) {
                this.f26741a = jSONObject;
            }

            public static /* synthetic */ Object ipc$super(C1039a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in extention/OverSeaOrderNextRPCExtention$1$1");
            }

            @Override // tb.pt, tb.hbb
            public void b(mi miVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                    return;
                }
                TLog.loge("Page_OverseaConfirmOrder", "OverSeaOrderNextRPCExtention", "差量更新出错：" + miVar.e() + ",delaProtocol:" + this.f26741a);
                if (miVar.b().equalsIgnoreCase("0")) {
                    z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_executeFlow_error", miVar.e() + " code:" + miVar.b());
                }
            }
        }

        public a(String str, String str2, String str3) {
            this.f26740a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TLog.loge("tmgcashier", "OverSeaOrderNextRPCExtention", "定时器触发");
                z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_tmg_nextrpc_error", this.f26740a);
                qgl.this.h.replace("desc", this.b);
                qgl.this.h.replace("price", this.c);
                ArrayList arrayList = new ArrayList();
                qgl qglVar = qgl.this;
                JSONObject L0 = qglVar.L0("submit", qglVar.h.toJSONString());
                arrayList.add(new rl(L0));
                qgl.J0(qgl.this).c().c("aura.workflow.update", new AURAParseIO(arrayList), new C1039a(this, L0));
            } catch (Throwable th) {
                TLog.loge("Page_OverseaConfirmOrder", "OverSeaOrderNextRPCExtention", "定时器出错：" + th.getMessage());
            }
        }
    }

    static {
        t2o.a(860880930);
    }

    public static /* synthetic */ lo J0(qgl qglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("bd2ff1d9", new Object[]{qglVar});
        }
        return qglVar.L();
    }

    public static void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f424c936", new Object[0]);
            return;
        }
        TLog.loge("tmgcashier", "OverSeaOrderNextRPCExtention", "clearNextRPCData");
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            k = null;
        }
        z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_clear_NextRPC_timer", new String[0]);
    }

    public static /* synthetic */ Object ipc$super(qgl qglVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1162528052:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
                return null;
            case -568123961:
                super.S((kk) objArr[0]);
                return null;
            case -25033014:
                super.onCreate((lo) objArr[0], (yi) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in extention/OverSeaOrderNextRPCExtention");
        }
    }

    public JSONObject L0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8f657cc5", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("opType", (Object) "merge");
        jSONObject2.put("target", (Object) str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("delta", (Object) jSONArray);
        jSONObject.put("hierarchy", (Object) jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("fields", (Object) str2);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(str, (Object) jSONObject4);
        jSONObject.put("data", (Object) jSONObject5);
        return jSONObject;
    }

    public final void M0(kk kkVar) {
        int i;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5834e1ba", new Object[]{this, kkVar});
            return;
        }
        TLog.loge("tmgcashier", "OverSeaOrderNextRPCExtention", "monitorNextRPC");
        if (k == null) {
            k = new Handler(Looper.getMainLooper());
        }
        try {
            JSONObject jSONObject = kkVar.b().getJSONObject("data").getJSONObject("data");
            if (jSONObject.containsKey("overseaPaymentMethod")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("overseaPaymentMethod").getJSONObject("fields");
                this.h = jSONObject.getJSONObject("submit").getJSONObject("fields");
                if (jSONObject2.containsKey("rpcResponseInterval")) {
                    i = jSONObject2.getInteger("rpcResponseInterval").intValue();
                } else {
                    i = 0;
                }
                if (jSONObject2.containsKey("nextRPCPrice")) {
                    str = jSONObject2.getString("nextRPCPrice");
                } else {
                    str = "";
                }
                if (jSONObject2.containsKey("nextRPCUTParams")) {
                    str2 = jSONObject2.getString("nextRPCUTParams");
                } else {
                    str2 = "";
                }
                if (jSONObject2.containsKey("hasExistNextRPCSubResponse")) {
                    String string = jSONObject2.getString("hasExistNextRPCSubResponse");
                    if (!TextUtils.isEmpty(string) && "true".equalsIgnoreCase(string)) {
                        z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_tmg_nextrpc_fullData", new String[0]);
                        TLog.loge("tmgcashier", "OverSeaOrderNextRPCExtention", "副响应先到，不启定时器");
                        z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_tmg_nextrpc", str2);
                        AURAGlobalData aURAGlobalData = this.i;
                        if (aURAGlobalData != null) {
                            aURAGlobalData.update("overSeaState", "1");
                            return;
                        }
                        return;
                    }
                }
                if (this.h != null && i > 0 && !TextUtils.isEmpty(str)) {
                    z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_tmg_nextrpc", str2);
                    AURAGlobalData aURAGlobalData2 = this.i;
                    if (aURAGlobalData2 != null) {
                        aURAGlobalData2.update("overSeaState", "1");
                    }
                    String string2 = this.h.getString("desc");
                    String string3 = this.h.getString("price");
                    this.h.replace("desc", "");
                    this.h.replace("price", str);
                    TLog.loge("tmgcashier", "OverSeaOrderNextRPCExtention", "触发计算中");
                    k.postDelayed(new a(str2, string2, string3), i);
                    return;
                }
                String str3 = "条件不满足，fields_result：" + this.h + ",timeout:" + i + "overseaPaymentMethodFields:" + jSONObject2.toJSONString();
                z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_nextrpc_quit", str3);
                TLog.loge("tmgcashier", "OverSeaOrderNextRPCExtention", str3);
                AURAGlobalData aURAGlobalData3 = this.i;
                if (aURAGlobalData3 != null) {
                    aURAGlobalData3.update("overSeaState", "0");
                }
            }
        } catch (Throwable th) {
            TLog.loge("tmgcashier", "OverSeaOrderNextRPCExtention", "Throwable:" + th.getMessage());
            z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_data_error", th.getMessage());
        }
    }

    @Override // tb.et, tb.vbb
    public void S(kk kkVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de231dc7", new Object[]{this, kkVar});
            return;
        }
        super.S(kkVar);
        try {
            if ("mtop.trade.order.adjust".equalsIgnoreCase(kkVar.a()) && "1".equalsIgnoreCase((String) this.i.get("overSeaState", String.class))) {
                this.i.update("ovsNextRpc_adjust", Boolean.TRUE);
                K0();
            }
            if ("mtop.trade.order.build".equalsIgnoreCase(kkVar.a())) {
                j = System.currentTimeMillis();
                if (!TextUtils.isEmpty(this.g) && "true".equals(this.g)) {
                    M0(kkVar);
                }
            }
            PositionInfo i = o78.i(this.f.f());
            if (i != null) {
                str = i.countryCode;
            } else {
                str = "";
            }
            if (o78.CHINA_MAINLAND.equalsIgnoreCase(str)) {
                TLog.logd("Page_OverseaConfirmOrder", "OverSeaOrderNextRPCExtention", "中国地区不做上报！");
                return;
            }
            String h = kkVar.h();
            String a2 = kkVar.a();
            StringBuilder sb = new StringBuilder("countryCode:" + str);
            Map<String, List<String>> d = kkVar.d();
            if (d != null && !d.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : d.entrySet()) {
                    if ("eagleeye-traceid".equalsIgnoreCase(entry.getKey())) {
                        sb.append(", traceId:");
                        sb.append(entry.getValue().get(0));
                    }
                }
            }
            if ("SUCCESS".equalsIgnoreCase(h)) {
                String[] split = kkVar.b().getJSONArray(rb.RESULT_KEY).getString(0).split("::");
                if ("SUCCESS".equalsIgnoreCase(split[0])) {
                    AppMonitor.Alarm.commitSuccess("Page_OverseaConfirmOrder", a2, sb.toString());
                    return;
                }
                sb.append(", errMsg:");
                sb.append(kkVar.i());
                AppMonitor.Alarm.commitFail("Page_OverseaConfirmOrder", a2, split[0], sb.toString());
                return;
            }
            sb.append(", errMsg:");
            sb.append(kkVar.i());
            AppMonitor.Alarm.commitFail("Page_OverseaConfirmOrder", a2, h, sb.toString());
        } catch (Exception e) {
            TLog.loge("Page_OverseaConfirmOrder", "OverSeaOrderNextRPCExtention", "didReceiveResponse 方法出错：" + e.getMessage());
        }
    }

    @Override // tb.et, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.f = loVar;
        this.g = OrangeConfig.getInstance().getConfig("cash4android", "nextRpcOpen", "true");
    }

    @Override // tb.et, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.i = aURAGlobalData;
    }

    @Override // tb.et, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        K0();
    }
}
