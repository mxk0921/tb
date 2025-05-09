package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayNative;
import com.taobao.android.remoteso.config.RSoConfig;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944574);
    }

    public static /* synthetic */ JSONObject a(long j, String str, String str2, String str3, long j2, String str4, int i, String str5, String str6, long j3, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("69066acf", new Object[]{new Long(j), str, str2, str3, new Long(j2), str4, new Integer(i), str5, str6, new Long(j3), new Boolean(z), map}) : f(j, str, str2, str3, j2, str4, i, str5, str6, j3, z, map);
    }

    public static /* synthetic */ void b(String str, boolean z, boolean z2, long j, long j2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1169d6c3", new Object[]{str, new Boolean(z), new Boolean(z2), new Long(j), new Long(j2), map});
        } else {
            e(str, z, z2, j, j2, map);
        }
    }

    public static String c(String str, String str2, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ed83a45", new Object[]{str, str2, map});
        }
        long nanoTime = System.nanoTime();
        String str3 = null;
        try {
            str3 = sd8.e(sd8.a(str));
            map.put(txa.MEASURE_COMPRESS_TIME, Long.valueOf((System.nanoTime() - nanoTime) / 1000));
            return str3;
        } catch (Exception e) {
            Log.e("HighwayMtopUtil", "requestMtop: compress events error! " + str2 + ", " + e.getMessage());
            return str3;
        }
    }

    public static long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e69262b", new Object[]{new Long(j)})).longValue();
        }
        return j + cdp.b().a();
    }

    public static void e(String str, boolean z, boolean z2, long j, long j2, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0ddf46", new Object[]{str, new Boolean(z), new Boolean(z2), new Long(j), new Long(j2), map});
            return;
        }
        map.put(txa.MEASURE_BATCH_COUNT, Long.valueOf(j2));
        map.put("totalTime", Long.valueOf(j));
        if (!z2) {
            txa.b(str, z, map);
        }
    }

    public static JSONObject f(long j, String str, String str2, String str3, long j2, String str4, int i, String str5, String str6, long j3, boolean z, Map<String, Long> map) {
        String str7;
        long j4;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e23b5516", new Object[]{new Long(j), str, str2, str3, new Long(j2), str4, new Integer(i), str5, str6, new Long(j3), new Boolean(z), map});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (z) {
                jSONObject.put("isClientPreview", true);
            } else if (vxa.h()) {
                jSONObject.put("enablePreview", true);
            }
            if (z) {
                j4 = 2;
                str8 = "HighwayMtopUtil";
            } else {
                str8 = "HighwayMtopUtil";
                j4 = j;
            }
            try {
                jSONObject.put("version", j4);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("featureVersion", str);
                }
                jSONObject.put("eventName", str2);
                jSONObject.put(ru1.FEATURE_NAME, str2);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("reason", str3);
                }
                jSONObject.put("eventId", j2);
                if (rxa.d().h()) {
                    jSONObject.put("events", str4);
                    jSONObject.put(RSoConfig.TYPE_COMPRESSED, false);
                } else {
                    String c = c(str4, str2, map);
                    if (!StringUtils.isNotBlank(c) || !StringUtils.isNotBlank(str4) || c.getBytes().length >= str4.getBytes().length) {
                        jSONObject.put("events", str4);
                        jSONObject.put(RSoConfig.TYPE_COMPRESSED, false);
                    } else {
                        jSONObject.put("events", c);
                        jSONObject.put(RSoConfig.TYPE_COMPRESSED, true);
                    }
                }
                jSONObject.put("count", i);
                jSONObject.put("solutionId", str5);
                jSONObject.put("triggerId", str6);
                str7 = str8;
            } catch (Exception unused) {
                str7 = str8;
            }
            try {
                Log.e(str7, "HighwayMtopUtil Start highway");
            } catch (Exception unused2) {
                Log.e(str7, "requestMtop: add data params error!");
                jSONObject.put("timestamp", d(j3));
                return jSONObject;
            }
        } catch (Exception unused3) {
            str7 = "HighwayMtopUtil";
        }
        try {
            jSONObject.put("timestamp", d(j3));
        } catch (JSONException unused4) {
            Log.e(str7, "requestMtop: add server time param error!");
        }
        return jSONObject;
    }

    public static void g(long j, String str, String str2, String str3, long j2, String str4, int i, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2181ad", new Object[]{new Long(j), str, str2, str3, new Long(j2), str4, new Integer(i), str5, str6});
            return;
        }
        try {
            vxa.d().execute(new a(str2, j, str, str3, j2, str4, i, str5, str6));
        } catch (Throwable unused) {
            Log.e("HighwayMtopUtil", "task is full!");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29657a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ String f;
        public final /* synthetic */ int g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;

        public a(String str, long j, String str2, String str3, long j2, String str4, int i, String str5, String str6) {
            this.f29657a = str;
            this.b = j;
            this.c = str2;
            this.d = str3;
            this.e = j2;
            this.f = str4;
            this.g = i;
            this.h = str5;
            this.i = str6;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            Exception e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean f = vxa.f(this.f29657a);
            if (f) {
                str = vxa.a(this.f29657a);
            } else {
                str = this.f29657a;
            }
            HashMap hashMap = new HashMap();
            String c = rxa.d().c();
            MtopRequest mtopRequest = new MtopRequest();
            if (!TextUtils.isEmpty(c)) {
                MtopBuilder build = Mtop.instance(vxa.b(), vxa.e()).build(mtopRequest, vxa.e());
                build.setCustomDomain(c);
                build.reqMethod(MethodEnum.POST);
                mtopRequest.setApiName("mtop.taobao.search.highway.upload");
                mtopRequest.setVersion("1.0");
                mtopRequest.setNeedSession(true);
                mtopRequest.setData(uxa.a(this.b, this.c, str, this.d, this.e, this.f, this.g, this.h, this.i, currentTimeMillis, f, hashMap).toString());
                try {
                    MtopResponse syncRequest = build.syncRequest();
                    if (syncRequest == null) {
                        Log.e("HighwayMtopUtil", "HighwayMtopUtil mtopResponse empty");
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j = currentTimeMillis2 - currentTimeMillis;
                    cdp.b().c(syncRequest, j, currentTimeMillis2);
                    try {
                        uxa.b(str, syncRequest.isApiSuccess(), f, j, this.g, hashMap);
                        DataHighwayNative.a(syncRequest.getRetCode(), str);
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("HighwayMtopUtil", "HighwayMtopUtil mtopResponse error:" + e.getMessage());
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } else {
                Log.e("HighwayMtopUtil", "HighwayMtopUtil empty domain:" + c);
            }
        }
    }
}
