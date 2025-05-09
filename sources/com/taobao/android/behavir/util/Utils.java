package com.taobao.android.behavir.util;

import android.app.Application;
import android.os.Build;
import android.os.Looper;
import android.preference.PreferenceManager;
import androidx.core.app.NotificationManagerCompat;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.message.notification.constans.SettingContants;
import mtopsdk.mtop.global.SDKUtils;
import tb.arp;
import tb.enu;
import tb.f82;
import tb.jk;
import tb.t2o;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(deserialize = false, serialize = false)

        /* renamed from: a  reason: collision with root package name */
        private final transient JSONObject f6446a;

        static {
            t2o.a(404750435);
        }

        public b(JSONObject jSONObject) {
            this.f6446a = jSONObject;
        }

        @JSONField(serialize = false)
        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9e944b44", new Object[]{this});
            }
            return Utils.j(this.f6446a);
        }
    }

    static {
        t2o.a(404750433);
    }

    public static void a(String str, String str2, String str3, long j, String str4, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5fcd67", new Object[]{str, str2, str3, new Long(j), str4, aVar, new Boolean(z)});
            return;
        }
        BHRTaskConfigBase.isMatchTrackSimpling(v82.i("ucpDefaultTrackSampling", 1.0d));
        long currentTimeMillis = System.currentTimeMillis() - j;
        ((enu.a) aVar).a(true, 201, com.taobao.android.behavir.util.a.g().b("schemeId", str).b("bizId", str2).b(arp.MATERIAL_ID_KEY, str3).b("triggerCode", str4).b("checkCost", Long.valueOf(currentTimeMillis)).b(jk.KEY_RET_CODE, 201).a(), currentTimeMillis);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f36deb", new Object[0])).booleanValue();
        }
        Application d = f82.d();
        if (d == null) {
            return false;
        }
        return PreferenceManager.getDefaultSharedPreferences(d).getBoolean(SettingContants.SETTINGS_APP_BANNER, true);
    }

    public static boolean c() {
        boolean isCurrentThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6903d9db", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            isCurrentThread = Looper.getMainLooper().isCurrentThread();
            return isCurrentThread;
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        } else {
            return false;
        }
    }

    public static void d(String str, String str2, String str3, String str4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53475813", new Object[]{str, str2, str3, str4, aVar});
        } else if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            BHREvent.buildInternalEvent(str, str2, "").bizArgKVMapObject = com.taobao.android.behavir.util.a.d("triggerCode", str4, arp.MATERIAL_ID_KEY, str3, "br_from", "ucp");
            a(str, str2, str3, currentTimeMillis, str4, aVar, true);
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8770836e", new Object[0])).booleanValue();
        }
        Application d = f82.d();
        if (d == null) {
            return false;
        }
        return NotificationManagerCompat.from(d).areNotificationsEnabled();
    }

    public static <I, O> JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2aa4cd18", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return com.taobao.android.behavir.util.a.EMPTY_JSON;
        }
        return jSONObject;
    }

    public static String g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da954da", new Object[]{obj});
        }
        if (obj != null) {
            return String.valueOf(obj.hashCode());
        }
        return "";
    }

    public static long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[0])).longValue();
        }
        return SDKUtils.getCorrectionTimeMillis();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba55d363", new Object[0])).booleanValue();
        }
        return "taobao".equals(f82.c());
    }

    public static JSONArray i(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("30c8062b", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return new JSONArray();
        }
        return jSONArray;
    }

    public static JSONObject j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("caeadee5", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a722a824", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
