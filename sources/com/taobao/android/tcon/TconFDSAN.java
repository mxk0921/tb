package com.taobao.android.tcon;

import android.app.Application;
import android.os.Build;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.asq;
import tb.j7h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TconFDSAN extends TconBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static long config(long j, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0e677b3", new Object[]{new Long(j), jSONObject, str})).longValue();
        }
        String string = jSONObject.getString(str);
        if (string == null) {
            return j;
        }
        try {
            long parseLong = Long.parseLong(string);
            return parseLong > 1 ? parseLong : j;
        } catch (Exception unused) {
            return j;
        }
    }

    public static /* synthetic */ Object ipc$super(TconFDSAN tconFDSAN, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tcon/TconFDSAN");
    }

    private static native void nativeStartFDSAN(String str);

    private static native boolean nativeStopFDSAN();

    public static boolean stopFDSAN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd1d040b", new Object[0])).booleanValue();
        }
        return nativeStopFDSAN();
    }

    public static boolean init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3847dd2c", new Object[]{application})).booleanValue();
        }
        String b = j7h.d().b("tcon", "fdsan_config");
        try {
            JSONObject parseObject = JSON.parseObject(b);
            if (parseObject == null || !"true".equals(parseObject.getString("enable_fdsan"))) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            String str = Build.MODEL;
            JSONObject jSONObject = new JSONObject() { // from class: com.taobao.android.tcon.TconFDSAN.1
                {
                    put("29", "Mi 10");
                    put("28", "VTR-AL00");
                }
            };
            if (parseObject.containsKey("fdsan_whitelist")) {
                jSONObject = parseObject.getJSONObject("fdsan_whitelist");
            }
            if ((!"*".equals(jSONObject.getString(String.valueOf(i))) && (asq.e(str) || !jSONObject.containsKey(String.valueOf(i)) || !jSONObject.getString(String.valueOf(i)).toLowerCase().contains(str.toLowerCase()))) || !TconBase.loadRequiredLibrary()) {
                return false;
            }
            String str2 = application.getFilesDir().getAbsolutePath() + "/tcon_fdsan.log";
            String readLog = TconBase.readLog(str2);
            if (readLog != null && readLog.length() > 0) {
                TconBase.reportException(application, "fdscan-" + String.valueOf(readLog.length()), readLog, "FDSAN_ERROR");
                TconBase.clearLog(str2);
            }
            return startFDSAN(str2);
        } catch (Exception unused) {
            Log.e(TconInitializer.TCON_TAG, "invalid fdsan config" + b);
            return false;
        }
    }

    public static boolean startFDSAN(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0ca61b5", new Object[]{str})).booleanValue();
        }
        nativeStartFDSAN(str);
        return true;
    }
}
