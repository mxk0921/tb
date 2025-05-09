package com.alipay.mobile.common.logging.util.crash;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CrashAnalyzer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<CrashInfoDO> f4001a;

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        try {
            return context.getSharedPreferences(CrashConstants.SP_NAME, 4);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("CrashAnalyzer", "readAndParseStrategy", th);
            return null;
        }
    }

    public static void analyzeJavaCrash(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34154d2", new Object[]{context, str});
        }
    }

    public static synchronized void b(Context context, List<CrashInfoDO> list) {
        synchronized (CrashAnalyzer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773151", new Object[]{context, list});
            } else if (context != null && list != null) {
                if (f4001a == null) {
                    f4001a = new ArrayList();
                }
                f4001a.clear();
                f4001a.addAll(list);
                SharedPreferences a2 = a(context);
                if (a2 != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (CrashInfoDO crashInfoDO : f4001a) {
                        jSONArray.put(crashInfoDO.toJsonObject());
                    }
                    a2.edit().putString(CrashConstants.SP_KEY_CRASH_TYPES, jSONArray.toString()).commit();
                    return;
                }
                throw new RuntimeException("SP is null");
            }
        }
    }

    public static synchronized List<CrashInfoDO> getHistoryCrashTypes(Context context) {
        synchronized (CrashAnalyzer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("8ebb6b16", new Object[]{context});
            }
            ArrayList arrayList = new ArrayList();
            if (context == null) {
                return arrayList;
            }
            List<CrashInfoDO> list = f4001a;
            if (list != null) {
                arrayList.addAll(list);
                return arrayList;
            }
            f4001a = new ArrayList();
            SharedPreferences a2 = a(context);
            if (a2 != null) {
                String string = a2.getString(CrashConstants.SP_KEY_CRASH_TYPES, "");
                if (!TextUtils.isEmpty(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        CrashInfoDO crashInfoDO = new CrashInfoDO();
                        crashInfoDO.parse(jSONObject);
                        f4001a.add(crashInfoDO);
                    }
                }
                arrayList.addAll(f4001a);
                return arrayList;
            }
            throw new RuntimeException("SP is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0255 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x0085, TryCatch #5 {all -> 0x0085, blocks: (B:20:0x0069, B:23:0x0073, B:30:0x0095, B:32:0x009f, B:33:0x00a6, B:35:0x00ae, B:36:0x00b7, B:38:0x00bd, B:39:0x00c6, B:41:0x00cc, B:42:0x00d7, B:45:0x00df, B:47:0x00e5, B:49:0x00eb, B:51:0x00f1, B:54:0x00fd, B:57:0x011a, B:60:0x0126, B:64:0x0145, B:66:0x014d, B:68:0x0156, B:70:0x015e, B:72:0x0167, B:75:0x0171, B:77:0x017a, B:79:0x0182, B:81:0x018c, B:56:0x0108, B:62:0x0131), top: B:150:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[Catch: all -> 0x0085, TryCatch #5 {all -> 0x0085, blocks: (B:20:0x0069, B:23:0x0073, B:30:0x0095, B:32:0x009f, B:33:0x00a6, B:35:0x00ae, B:36:0x00b7, B:38:0x00bd, B:39:0x00c6, B:41:0x00cc, B:42:0x00d7, B:45:0x00df, B:47:0x00e5, B:49:0x00eb, B:51:0x00f1, B:54:0x00fd, B:57:0x011a, B:60:0x0126, B:64:0x0145, B:66:0x014d, B:68:0x0156, B:70:0x015e, B:72:0x0167, B:75:0x0171, B:77:0x017a, B:79:0x0182, B:81:0x018c, B:56:0x0108, B:62:0x0131), top: B:150:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: all -> 0x0085, TryCatch #5 {all -> 0x0085, blocks: (B:20:0x0069, B:23:0x0073, B:30:0x0095, B:32:0x009f, B:33:0x00a6, B:35:0x00ae, B:36:0x00b7, B:38:0x00bd, B:39:0x00c6, B:41:0x00cc, B:42:0x00d7, B:45:0x00df, B:47:0x00e5, B:49:0x00eb, B:51:0x00f1, B:54:0x00fd, B:57:0x011a, B:60:0x0126, B:64:0x0145, B:66:0x014d, B:68:0x0156, B:70:0x015e, B:72:0x0167, B:75:0x0171, B:77:0x017a, B:79:0x0182, B:81:0x018c, B:56:0x0108, B:62:0x0131), top: B:150:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc A[Catch: all -> 0x0085, TryCatch #5 {all -> 0x0085, blocks: (B:20:0x0069, B:23:0x0073, B:30:0x0095, B:32:0x009f, B:33:0x00a6, B:35:0x00ae, B:36:0x00b7, B:38:0x00bd, B:39:0x00c6, B:41:0x00cc, B:42:0x00d7, B:45:0x00df, B:47:0x00e5, B:49:0x00eb, B:51:0x00f1, B:54:0x00fd, B:57:0x011a, B:60:0x0126, B:64:0x0145, B:66:0x014d, B:68:0x0156, B:70:0x015e, B:72:0x0167, B:75:0x0171, B:77:0x017a, B:79:0x0182, B:81:0x018c, B:56:0x0108, B:62:0x0131), top: B:150:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void analyzeNativeCrash(android.content.Context r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.crash.CrashAnalyzer.analyzeNativeCrash(android.content.Context, java.lang.String):void");
    }
}
