package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bjo;
import tb.f51;
import tb.iuf;
import tb.pg1;
import tb.pod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fw {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<Long> f5712a = new SparseArray<>();
    public int b = -1;
    public long c = 0;
    String[] d = {"ol", "cl", bjo.GL_MEM, "ha", "bs", "ds"};
    public int e = -1;
    public long f = -1;
    private static List<bz> i = new ArrayList();
    private static JSONArray j = null;
    static AMapLocation g = null;
    static boolean h = false;

    /* compiled from: Taobao */
    /* renamed from: com.loc.fw$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5713a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            f5713a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5713a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5713a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String a(int i2) {
        if (i2 == 2011) {
            return "ContextIsNull";
        }
        if (i2 == 2031) {
            return "CreateApsReqException";
        }
        if (i2 == 2041) {
            return "ResponseResultIsNull";
        }
        if (i2 == 2081) {
            return "LocalLocException";
        }
        if (i2 == 2091) {
            return "InitException";
        }
        if (i2 == 2111) {
            return "ErrorCgiInfo";
        }
        if (i2 == 2121) {
            return "NotLocPermission";
        }
        if (i2 == 2141) {
            return "NoEnoughStatellites";
        }
        if (i2 == 2021) {
            return "OnlyMainWifi";
        }
        if (i2 == 2022) {
            return "OnlyOneWifiButNotMain";
        }
        if (i2 == 2061) {
            return "ServerRetypeError";
        }
        if (i2 == 2062) {
            return "ServerLocFail";
        }
        switch (i2) {
            case iuf.DEAMON_JOB_ID /* 2051 */:
                return "NeedLoginNetWork\t";
            case 2052:
                return "MaybeIntercepted";
            case 2053:
                return "DecryptResponseException";
            case 2054:
                return "ParserDataException";
            default:
                switch (i2) {
                    case 2101:
                        return "BindAPSServiceException";
                    case 2102:
                        return "AuthClientScodeFail";
                    case 2103:
                        return "NotConfigAPSService";
                    default:
                        switch (i2) {
                            case 2131:
                                return "NoCgiOAndWifiInfo";
                            case 2132:
                                return "AirPlaneModeAndWifiOff";
                            case 2133:
                                return "NoCgiAndWifiOff";
                            default:
                                switch (i2) {
                                    case 2151:
                                        return "MaybeMockNetLoc";
                                    case 2152:
                                        return "MaybeMockGPSLoc";
                                    case 2153:
                                        return "UNSUPPORT_COARSE_LBSLOC";
                                    case 2154:
                                        return "UNSUPPORT_CONTINUE_LOC";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    private static void f(Context context) {
        try {
            JSONArray jSONArray = j;
            if (jSONArray != null && jSONArray.length() > 0) {
                by.a(new bx(context, fr.c(), j.toString()), context);
                j = null;
            }
        } catch (Throwable th) {
            fr.a(th, "ReportUtil", "writeOfflineLocLog");
        }
    }

    public final void b(Context context) {
        try {
            long b = fy.b() - this.c;
            int i2 = this.b;
            if (i2 != -1) {
                this.f5712a.append(this.b, Long.valueOf(b + this.f5712a.get(i2, 0L).longValue()));
            }
            long b2 = fy.b() - this.f;
            int i3 = this.e;
            if (i3 != -1) {
                this.f5712a.append(this.e, Long.valueOf(b2 + this.f5712a.get(i3, 0L).longValue()));
            }
            SharedPreferences.Editor a2 = fx.a(context, "pref1");
            for (int i4 = 0; i4 < this.d.length; i4++) {
                long longValue = this.f5712a.get(i4, 0L).longValue();
                if (longValue > 0 && longValue > fx.a(context, "pref1", this.d[i4], 0L)) {
                    fx.a(a2, this.d[i4], longValue);
                }
            }
            fx.a(a2);
        } catch (Throwable th) {
            fr.a(th, "ReportUtil", "saveLocationTypeAndMode");
        }
    }

    public final int c(Context context) {
        try {
            long a2 = fx.a(context, "pref1", this.d[2], 0L);
            long a3 = fx.a(context, "pref1", this.d[0], 0L);
            long a4 = fx.a(context, "pref1", this.d[1], 0L);
            if (a2 == 0 && a3 == 0 && a4 == 0) {
                return -1;
            }
            long j2 = a3 - a2;
            long j3 = a4 - a2;
            return a2 > j2 ? a2 > j3 ? 2 : 1 : j2 > j3 ? 0 : 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Context context) {
        try {
            long a2 = fx.a(context, "pref1", this.d[3], 0L);
            long a3 = fx.a(context, "pref1", this.d[4], 0L);
            long a4 = fx.a(context, "pref1", this.d[5], 0L);
            if (a2 == 0 && a3 == 0 && a4 == 0) {
                return -1;
            }
            return a2 > a3 ? a2 > a4 ? 3 : 5 : a3 > a4 ? 4 : 5;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void e(Context context) {
        try {
            SharedPreferences.Editor a2 = fx.a(context, "pref1");
            int i2 = 0;
            while (true) {
                String[] strArr = this.d;
                if (i2 < strArr.length) {
                    fx.a(a2, strArr[i2], 0L);
                    i2++;
                } else {
                    fx.a(a2);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(long j2, long j3) {
        try {
            if (!h) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("gpsTime:");
                stringBuffer.append(fy.a(j2, "yyyy-MM-dd HH:mm:ss.SSS"));
                stringBuffer.append(",sysTime:");
                stringBuffer.append(fy.a(j3, "yyyy-MM-dd HH:mm:ss.SSS"));
                stringBuffer.append(",serverTime:");
                long t = fq.t();
                String str = "0";
                int i2 = (0L > t ? 1 : (0L == t ? 0 : -1));
                if (i2 != 0) {
                    str = fy.a(t, "yyyy-MM-dd HH:mm:ss.SSS");
                }
                stringBuffer.append(str);
                a("checkgpstime", stringBuffer.toString());
                if (i2 != 0 && Math.abs(j2 - t) < 31536000000L) {
                    stringBuffer.append(", correctError");
                    a("checkgpstimeerror", stringBuffer.toString());
                }
                stringBuffer.delete(0, stringBuffer.length());
                h = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, long j2, boolean z) {
        if (context != null) {
            try {
                if (fq.a()) {
                    a(context, j2, z, "O024");
                }
            } catch (Throwable th) {
                fr.a(th, "ReportUtil", "reportCoarseLocUseTime");
            }
        }
    }

    public static synchronized void a(Context context) {
        synchronized (fw.class) {
            if (context != null) {
                try {
                    if (fq.a()) {
                        List<bz> list = i;
                        if (list != null && list.size() > 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(i);
                            ca.b(arrayList, context);
                            i.clear();
                        }
                        f(context);
                    }
                } catch (Throwable th) {
                    fr.a(th, "ReportUtil", "destroy");
                }
            }
        }
    }

    public final void a(Context context, int i2) {
        try {
            int i3 = this.b;
            if (i3 != i2) {
                if (!(i3 == -1 || i3 == i2)) {
                    this.f5712a.append(this.b, Long.valueOf((fy.b() - this.c) + this.f5712a.get(this.b, 0L).longValue()));
                }
                this.c = fy.b() - fx.a(context, "pref1", this.d[i2], 0L);
                this.b = i2;
            }
        } catch (Throwable th) {
            fr.a(th, "ReportUtil", "setLocationType");
        }
    }

    public static void a(Context context, int i2, int i3, long j2, long j3) {
        if (i2 != -1 && i3 != -1) {
            try {
                a(context, "O012", i2, i3, j2, j3);
            } catch (Throwable th) {
                fr.a(th, "ReportUtil", "reportServiceAliveTime");
            }
        }
    }

    public static void a(Context context, long j2, boolean z) {
        if (context != null) {
            try {
                if (fq.a()) {
                    a(context, j2, z, "O015");
                }
            } catch (Throwable th) {
                fr.a(th, "ReportUtil", "reportGPSLocUseTime");
            }
        }
    }

    private static void a(Context context, long j2, boolean z, String str) {
        a(context, str, !z ? "abroad" : "domestic", Long.valueOf(j2).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:4:0x0003, B:8:0x000b, B:26:0x0035, B:36:0x0048, B:38:0x004c, B:41:0x0057, B:43:0x0092, B:44:0x0098, B:46:0x009f, B:47:0x00e1, B:49:0x00f3), top: B:59:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(android.content.Context r8, com.amap.api.location.AMapLocation r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fw.a(android.content.Context, com.amap.api.location.AMapLocation):void");
    }

    public static void a(Context context, AMapLocation aMapLocation, eq eqVar) {
        int i2;
        if (aMapLocation != null) {
            try {
                if (!"gps".equalsIgnoreCase(aMapLocation.getProvider()) && aMapLocation.getLocationType() != 1) {
                    String str = "domestic";
                    if (a(aMapLocation)) {
                        str = "abroad";
                    }
                    String str2 = "net";
                    if (aMapLocation.getErrorCode() != 0) {
                        int errorCode = aMapLocation.getErrorCode();
                        if (!(errorCode == 4 || errorCode == 5 || errorCode == 6 || errorCode == 11)) {
                            str2 = "cache";
                        }
                        i2 = 0;
                    } else {
                        int locationType = aMapLocation.getLocationType();
                        if (!(locationType == 5 || locationType == 6)) {
                            str2 = "cache";
                        }
                        i2 = 1;
                    }
                    a(context, "O016", str2, str, i2, aMapLocation.getErrorCode(), eqVar);
                }
            } catch (Throwable th) {
                fr.a(th, "ReportUtil", "reportBatting");
            }
        }
    }

    public final void a(Context context, AMapLocationClientOption aMapLocationClientOption) {
        int i2;
        try {
            int i3 = AnonymousClass1.f5713a[aMapLocationClientOption.getLocationMode().ordinal()];
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 != 2) {
                i2 = 3;
                if (i3 != 3) {
                    i2 = -1;
                }
            } else {
                i2 = 5;
            }
            int i4 = this.e;
            if (i4 != i2) {
                if (!(i4 == -1 || i4 == i2)) {
                    this.f5712a.append(this.e, Long.valueOf((fy.b() - this.f) + this.f5712a.get(this.e, 0L).longValue()));
                }
                this.f = fy.b() - fx.a(context, "pref1", this.d[i2], 0L);
                this.e = i2;
            }
        } catch (Throwable th) {
            fr.a(th, "ReportUtil", "setLocationMode");
        }
    }

    private static void a(Context context, String str, int i2, int i3, long j2, long j3) {
        if (context != null) {
            try {
                if (fq.a()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("param_int_first", i2);
                    jSONObject.put("param_int_second", i3);
                    jSONObject.put("param_long_first", j2);
                    jSONObject.put("param_long_second", j3);
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                fr.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    private static void a(Context context, String str, String str2, int i2) {
        if (context != null) {
            try {
                if (fq.a()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        jSONObject.put("param_string_second", (Object) null);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                fr.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    private static void a(Context context, String str, String str2, String str3, int i2, int i3, eq eqVar) {
        if (context != null) {
            try {
                if (fq.a()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("param_string_second", str3);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    if (i3 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_second", i3);
                    }
                    if (eqVar != null) {
                        if (!TextUtils.isEmpty(eqVar.d())) {
                            jSONObject.put("dns", eqVar.d());
                        }
                        if (!TextUtils.isEmpty(eqVar.e())) {
                            jSONObject.put("domain", eqVar.e());
                        }
                        if (!TextUtils.isEmpty(eqVar.f())) {
                            jSONObject.put("type", eqVar.f());
                        }
                        if (!TextUtils.isEmpty(eqVar.g())) {
                            jSONObject.put("reason", eqVar.g());
                        }
                        if (!TextUtils.isEmpty(eqVar.c())) {
                            jSONObject.put(pod.IP, eqVar.c());
                        }
                        if (!TextUtils.isEmpty(eqVar.b())) {
                            jSONObject.put(pg1.ATOM_stack, eqVar.b());
                        }
                        if (eqVar.h() > 0) {
                            jSONObject.put("ctime", String.valueOf(eqVar.h()));
                        }
                        if (eqVar.a() > 0) {
                            jSONObject.put("ntime", String.valueOf(eqVar.a()));
                        }
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                fr.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    public static synchronized void a(Context context, String str, JSONObject jSONObject) {
        synchronized (fw.class) {
            if (context != null) {
                try {
                    if (fq.a()) {
                        bz bzVar = new bz(context, MspEventTypes.ACTION_INVOKE_LOC, "6.2.0", str);
                        if (jSONObject != null) {
                            bzVar.a(jSONObject.toString());
                        }
                        i.add(bzVar);
                        if (i.size() >= 30) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(i);
                            ca.b(arrayList, context);
                            i.clear();
                        }
                    }
                } catch (Throwable th) {
                    fr.a(th, "ReportUtil", "applyStatistics");
                }
            }
        }
    }

    public static void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        try {
            if (g == null) {
                if (!fy.a(aMapLocation)) {
                    g = aMapLocation2;
                    return;
                }
                g = aMapLocation.clone();
            }
            if (fy.a(g) && fy.a(aMapLocation2)) {
                AMapLocation clone = aMapLocation2.clone();
                if (!(g.getLocationType() == 1 || g.getLocationType() == 9 || "gps".equalsIgnoreCase(g.getProvider()) || g.getLocationType() == 7 || clone.getLocationType() == 1 || clone.getLocationType() == 9 || "gps".equalsIgnoreCase(clone.getProvider()) || clone.getLocationType() == 7)) {
                    long abs = Math.abs(clone.getTime() - g.getTime()) / 1000;
                    if (abs <= 0) {
                        abs = 1;
                    }
                    if (abs <= f51.DEF_MAX_ASYNC_SECONDS) {
                        float a2 = fy.a(g, clone);
                        float f = a2 / ((float) abs);
                        if (a2 > 30000.0f && f > 1000.0f) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(g.getLatitude());
                            sb.append(",");
                            sb.append(g.getLongitude());
                            sb.append(",");
                            sb.append(g.getAccuracy());
                            sb.append(",");
                            sb.append(g.getLocationType());
                            sb.append(",");
                            if (aMapLocation.getTime() != 0) {
                                sb.append(fy.a(g.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(g.getTime());
                            }
                            sb.append("#");
                            sb.append(clone.getLatitude());
                            sb.append(",");
                            sb.append(clone.getLongitude());
                            sb.append(",");
                            sb.append(clone.getAccuracy());
                            sb.append(",");
                            sb.append(clone.getLocationType());
                            sb.append(",");
                            if (clone.getTime() != 0) {
                                sb.append(fy.a(clone.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(clone.getTime());
                            }
                            a("bigshiftstatistics", sb.toString());
                            sb.delete(0, sb.length());
                        }
                    }
                }
                g = clone;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, int i2) {
        a(str, String.valueOf(i2), a(i2));
    }

    public static void a(String str, String str2) {
        try {
            av.b(fr.c(), str2, str);
        } catch (Throwable th) {
            fr.a(th, "ReportUtil", "reportLog");
        }
    }

    public static void a(String str, String str2, String str3) {
        try {
            av.a(fr.c(), "/mobile/binary", str3, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, Throwable th) {
        try {
            if (th instanceof k) {
                av.a(fr.c(), str, (k) th);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(AMapLocation aMapLocation) {
        return fy.a(aMapLocation) ? !fr.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) : "http://abroad.apilocate.amap.com/mobile/binary".equals(fr.c);
    }
}
