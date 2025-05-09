package com.taobao.android.behavir.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import tb.iaa;
import tb.rja;
import tb.t2o;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UtUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHANGED_UPP_EVENT_ID = 19998;
    public static final int MAX_SAMPLING = 100;
    public static final int MIN_SAMPLING = 0;
    public static final String UPP_ARG_1 = "upp_track";
    public static final int UPP_EVENT_ID = 19999;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f6445a = null;

    static {
        t2o.a(404750432);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || str.length() < 3000) {
            return str;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            Deflater deflater = new Deflater(1);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
            deflaterOutputStream.write(str.getBytes());
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            deflater.end();
            return "Deflater:" + Base64.encodeToString(byteArray, 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void c(String str, Map<String, ?> map, Map<String, ?> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a1781d", new Object[]{str, map, map2});
        } else if (Build.VERSION.SDK_INT > 29) {
            String str2 = "";
            String a2 = map == null ? str2 : a(JSON.toJSONString(map));
            if (map2 != null) {
                str2 = String.valueOf(a.j(map2));
            }
            b(str, a2, str2);
        }
    }

    public static void commitEventForCpp(String str, int i, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d861677d", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        if (!TextUtils.isEmpty(str5) && !"null".equals(str5)) {
            try {
                jSONObject = JSON.parseObject(str5);
            } catch (Throwable unused) {
            }
            d(str, i, str2, str3, str4, jSONObject);
        }
        jSONObject = null;
        d(str, i, str2, str3, str4, jSONObject);
    }

    public static void d(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201f463", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
            return;
        }
        if (i == 19999) {
            i = g();
        }
        TBS.Ext.commitEvent(str, i, str2, str3, str4, h(jSONObject));
        if (rja.a()) {
            str5 = JSON.toJSONString(jSONObject);
        } else {
            str5 = "";
        }
        TLog.loge("UCP", "commitEvent", str, str2, str3, str4, str5);
    }

    public static void e(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        if (i == 19999) {
            i = g();
        }
        if (rja.a()) {
            TLog.loge("UCP", "commitEvent", str, str2, str3, str4, str5);
        }
        TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37badbd0", new Object[0])).intValue();
        }
        if (v82.c.z()) {
            return CHANGED_UPP_EVENT_ID;
        }
        return 19999;
    }

    public static String h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39015978", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                sb.append(str);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd20611", new Object[]{str, str2, str3});
        } else if (Build.VERSION.SDK_INT > 28 && v82.h("enableCasuallyLog", true)) {
            if (!TextUtils.isEmpty(str3)) {
                str3 = "args=" + str3;
            }
            e("UCP", 19999, TLogTracker.SCENE_EXCEPTION, str, str2, str3);
        }
    }

    public static void f(String str, String str2, String str3, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f926662f", new Object[]{str, str2, str3, jSONObject});
            return;
        }
        int x = v82.c.x();
        if (x <= 0) {
            TLog.logd("UtUtils", "upp track sampling is zero.");
            return;
        }
        if (rja.b()) {
            x = 100;
        }
        if (x == 100) {
            d(str, g(), UPP_ARG_1, str2, str3, jSONObject);
        } else if (!TextUtils.isEmpty(iaa.f21189a)) {
            if (f6445a == null) {
                try {
                    if (Long.parseLong(iaa.f21189a) % 100 >= x) {
                        z = false;
                    }
                    f6445a = Boolean.valueOf(z);
                } catch (Throwable th) {
                    TLog.loge("UtUtils", "parse user id error.", th);
                }
            }
            Boolean bool = f6445a;
            if (bool != null && bool.booleanValue()) {
                d(str, g(), UPP_ARG_1, str2, str3, jSONObject);
            }
        }
    }
}
