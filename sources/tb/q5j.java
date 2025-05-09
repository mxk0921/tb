package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.network.domain.NetworkStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q5j implements qrj<r5j, nsj> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUCCESS_STATUS = "SUCCESS";
    public static final String TRAFFIC_LIMIT_LOCKED_STATUS = "ANDROID_SYS_API_FLOW_LIMIT_LOCKED";
    public static final String TRAFFIC_LIMIT_STATUS = "FAIL_SYS_TRAFFIC_LIMIT";
    public static volatile boolean b = true;
    public static volatile boolean c = false;
    public static volatile yib d;
    public static volatile reb e;

    /* renamed from: a  reason: collision with root package name */
    public final yko f26518a;

    static {
        t2o.a(993001903);
        t2o.a(993001891);
    }

    public q5j(yko ykoVar) {
        this.f26518a = ykoVar;
    }

    public static JSONObject e(JSONObject jSONObject) throws ResultException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78a36442", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        throw new ResultException(new ResultError(3, "no data object in mtop"));
    }

    public static void f(yib yibVar, reb rebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c61840", new Object[]{yibVar, rebVar});
            return;
        }
        d = yibVar;
        e = rebVar;
    }

    @Override // tb.qrj
    public JSONObject a(JSONObject jSONObject) throws ResultException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("edc8ea4a", new Object[]{this, jSONObject});
        }
        return e(jSONObject);
    }

    public final RequestStats d(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestStats) ipChange.ipc$dispatch("fa8be15e", new Object[]{this, mtopResponse});
        }
        RequestStats requestStats = new RequestStats();
        if (!(mtopResponse.getMtopStat() == null || mtopResponse.getMtopStat().netStats == null)) {
            NetworkStats networkStats = mtopResponse.getMtopStat().netStats;
            requestStats.oneWayTime = networkStats.oneWayTime_ANet;
            requestStats.serverRt = networkStats.serverRT;
            requestStats.recvDataSize = networkStats.recvSize;
            requestStats.recvDataTime = networkStats.recDataTime;
            requestStats.retryTimes = networkStats.retryTimes;
            requestStats.sendDataSize = networkStats.sendSize;
        }
        return requestStats;
    }

    /* renamed from: g */
    public nsj b(r5j r5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsj) ipChange.ipc$dispatch("bd716a", new Object[]{this, r5jVar});
        }
        return c(r5jVar, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:12|(1:16)|19|20|(3:132|21|22)|(34:136|23|24|25|(1:27)(1:28)|29|(1:31)(1:32)|33|(1:35)(1:38)|(1:40)|(1:44)|(1:48)|49|(1:51)|52|(1:56)|57|(1:59)|60|61|(1:63)|64|(1:66)|67|(1:69)|70|(1:72)|(1:74)|(1:76)|77|(1:79)|80|(1:86)|87)|104|130|105|108|(1:110)(1:111)|112|(5:114|(1:116)(1:117)|118|(1:120)(1:121)|122)(1:123)|(1:125)|126) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02fc, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.nsj c(tb.r5j r29, tb.fsj r30) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q5j.c(tb.r5j, tb.fsj):tb.nsj");
    }
}
