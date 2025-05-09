package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tinct.ITinctOperater;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r7j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMBRELLA_SPINDLE_BIZ = "WirelessSRE";

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f27164a = hdv.a();

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2c42e3", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LogField.EVENTID.toString(), "19999");
        hashMap.put(LogField.PAGE.toString(), str);
        String obj = LogField.ARG1.toString();
        hashMap.put(obj, str3 + "$" + str4);
        hashMap.put(LogField.ARG2.toString(), str5);
        StringBuffer stringBuffer = new StringBuffer("tinctTag=");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        stringBuffer.append(str2);
        stringBuffer.append(",traceId=");
        if (TextUtils.isEmpty(str7)) {
            str7 = "";
        }
        stringBuffer.append(str7);
        stringBuffer.append(",errorMsg=");
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        stringBuffer.append(str6);
        hashMap.put(LogField.ARGS.toString(), stringBuffer.toString());
        UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bea1d919", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "_EMPTY_";
        }
        if (str.startsWith("ANDROID_SYS_")) {
            return "ERROR_MTOP_APP_SDK";
        }
        if (str.startsWith("FAIL_SYS_")) {
            return "ERROR_MTOP_SERVER";
        }
        return "ERROR_BIZ_SERVER";
    }

    public static String c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50216637", new Object[]{mtopResponse});
        }
        return zxu.g(mtopResponse);
    }

    public static Map<String, String> d(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d884f66", new Object[]{mtopResponse});
        }
        HashMap hashMap = new HashMap();
        int responseCode = mtopResponse.getResponseCode();
        hashMap.put("responseSource", mtopResponse.getSource().name());
        hashMap.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, String.valueOf(responseCode));
        String c = c(mtopResponse);
        if (c == null) {
            c = "";
        }
        hashMap.put("eagleEyeTraceId", c);
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat == null) {
            return hashMap;
        }
        boolean z = mtopStat.backGround;
        String str = mtopStat.domain;
        String str2 = mtopStat.clientTraceId;
        NetworkStats networkStats = mtopStat.netStats;
        int i = networkStats.retryTimes;
        long j = networkStats.serverRT;
        long j2 = mtopStat.netTotalTime;
        long j3 = networkStats.recDataTime;
        long totalTime = mtopStat.getTotalTime();
        hashMap.put("isBackground", String.valueOf(z));
        hashMap.put("domain", String.valueOf(str));
        hashMap.put("clientTraceId", String.valueOf(str2));
        hashMap.put("retryTimes", String.valueOf(i));
        hashMap.put("serverRT", String.valueOf(j));
        hashMap.put("netTotalTime", String.valueOf(j2));
        hashMap.put("recDataTime", String.valueOf(j3));
        hashMap.put("mtopTotalTime", String.valueOf(totalTime));
        return hashMap;
    }

    public static void f(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7464baac", new Object[]{str, mtopResponse});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && mtopResponse != null) {
                String tinctInfo = ITinctOperater.getInstance().getTinctInfo(str);
                if (TextUtils.isEmpty(tinctInfo)) {
                    tinctInfo = "empty";
                }
                String api = mtopResponse.getApi();
                String v = mtopResponse.getV();
                Map<String, String> d = d(mtopResponse);
                d.put(d71.PARAM_TINCT_TAG, tinctInfo);
                f27164a.commitSuccess("MtopTrace", api, v, UMBRELLA_SPINDLE_BIZ, str, d);
            }
        } catch (Throwable th) {
            new StringBuilder("MtopTracer~traceMtopSuccess~Exception:::").append(th.getMessage());
        }
    }

    public static void e(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a96c271", new Object[]{str, mtopResponse});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && mtopResponse != null) {
                String tinctInfo = ITinctOperater.getInstance().getTinctInfo(str);
                if (TextUtils.isEmpty(tinctInfo)) {
                    tinctInfo = "empty";
                }
                String api = mtopResponse.getApi();
                String v = mtopResponse.getV();
                String retCode = mtopResponse.getRetCode();
                String retMsg = mtopResponse.getRetMsg();
                Map<String, String> d = d(mtopResponse);
                d.put(d71.PARAM_TINCT_TAG, tinctInfo);
                d.put("errorType", b(retCode));
                f27164a.commitFailure("MtopTrace", api, v, UMBRELLA_SPINDLE_BIZ, str, d, retCode, retMsg);
                a(str, tinctInfo, api, v, retCode, retMsg, d.get("eagleEyeTraceId"));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
