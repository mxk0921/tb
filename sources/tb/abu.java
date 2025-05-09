package tb;

import android.text.TextUtils;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class abu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FUNNEL_STEP_AFTER_REQUEST = "requested";
    public static final String FUNNEL_STEP_LAUNCH_WIDGET = "launchWidget";
    public static final String FUNNEL_STEP_START = "start";
    public static final String FUNNEL_STEP_VIEW_LOAD = "viewLoaded";

    static {
        t2o.a(435159097);
    }

    public static void b(boolean z, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a661567f", new Object[]{new Boolean(z), new Long(j)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("indexId", String.valueOf(j));
            if (z) {
                str = "configUpdateSuccess";
            } else {
                str = "configUpdateFail";
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("DesktopService", 19999, "floatWindow", str, "", hashMap).build());
            yv8.a("TrackUtil.doTrack.arg2=%s.trackMap=%s", str, hashMap);
        } catch (Throwable th) {
            yv8.b("TrackUtil.doTrack.error", th);
        }
    }

    public static void c(int i, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea1c97f", new Object[]{new Integer(i), str, jSONObject, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("actionBehaviour", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("targetUrl", str3);
        a(i, str, jSONObject, hashMap, "action");
    }

    public static void d(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854a0181", new Object[]{new Integer(i), str, jSONObject});
        } else {
            a(i, str, jSONObject, new HashMap(), "display");
        }
    }

    public static void e(int i, String str, JSONObject jSONObject, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bbcb09", new Object[]{new Integer(i), str, jSONObject, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("closeStep", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("closeReason", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put("errorMessage", str4);
        a(i, str, jSONObject, hashMap, "funnel");
    }

    public static void f(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e59f929", new Object[]{new Integer(i), str, jSONObject});
        } else {
            a(i, str, jSONObject, new HashMap(), ndv.UMB_FEATURE_REQUEST_SUCCESS);
        }
    }

    public static void a(int i, String str, JSONObject jSONObject, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eeb645", new Object[]{new Integer(i), str, jSONObject, map, str2});
            return;
        }
        try {
            map.put("triggerType", String.valueOf(i));
            map.put("bizCode", String.valueOf(str));
            if (jSONObject != null) {
                map.put("abBucketId", String.valueOf(jSONObject.getString("abBucketId")));
                map.put(DnsNavConfigTask.MatchKey, String.valueOf(jSONObject.getString(DnsNavConfigTask.MatchKey)));
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("DesktopService", 19999, "floatWindow", str2, "", map).build());
            yv8.a("TrackUtil.doTrack.arg2=%s.trackMap=%s", str2, map);
        } catch (Throwable th) {
            yv8.b("TrackUtil.doTrack.error", th);
        }
    }
}
